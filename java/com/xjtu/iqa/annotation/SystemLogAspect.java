package com.xjtu.iqa.annotation;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.xjtu.iqa.mapper.UserMapper;
import com.xjtu.iqa.po.User;
import com.xjtu.iqa.service.LogService;

/**
 * 切点类 创建一个代理类使用@Aspect @Component注解进行标记
 */
@Aspect
@Component
public class SystemLogAspect {
	@Autowired
	private LogService logService;
	@Autowired
	UserMapper userMapper;

	public SystemLogAspect() {
		System.out.println("SystemLogAspect is initing!!!!");
	}

	// 本地异常日志记录对象
	public Logger logger = Logger.getLogger(SystemLogAspect.class);
	// private static final Logger logger =
	// Logger.getLogger(SystemLogAspect.class);

	// 定义切入点point:自拦截有权限注解的方法，更能提升性能
	// Controller层切点
	@Pointcut("@annotation(com.xjtu.iqa.annotation.SystemControllerLog)")
	public void controllerAspect() {

	}

	// Service层切点
	// @Pointcut("@annotation(org.xjtusicd3.partner.annotation.SystemServiceLog)")
	// public void serviceAspect() {
	// }

	@AfterReturning("controllerAspect()")
	public void doBefore(JoinPoint joinPoint) {
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())
				.getRequest();
		HttpSession session = request.getSession();
		String urlPath1 = request.getRequestURL().toString();
		String queryString = request.getQueryString();

		// 读取session中的用户
		String username = (String) session.getAttribute("UserName");
		List<User> list = userMapper.getUserInfo(username);
		// 获取请求ip
		String ip = getIP(request);
		try {

			System.out.println("=====后置通知开始=====");
			System.out.println("请求方法:"
					+ (joinPoint.getTarget().getClass().getName() + "." + joinPoint.getSignature().getName() + "()"));
			System.out.println("方法描述:" + getControllerMethodDescription(joinPoint));
			System.out.println("请求url：" + urlPath1);
			if (username != null) {
				System.out.println("请求人:" + username);
			} else {
				System.out.println("请求人: 游客");
			}
			System.out.println("请求IP:" + ip);

			/*
			 * if (joinPoint.getArgs() != null && joinPoint.getArgs().length >
			 * 0) { for ( int i = 0; i < joinPoint.getArgs().length; i++) {
			 * params += JSON.toJSONString(joinPoint.getArgs()[i]) + ";"; } }
			 */
			// System.out.println("params.length() = " + params.length());
			// System.out.println("params = " + params);
			com.xjtu.iqa.po.Log myLog = new com.xjtu.iqa.po.Log();
			myLog.setLOGID(UUID.randomUUID().toString());
			myLog.setLOGMETHOD(
					joinPoint.getTarget().getClass().getName() + "." + joinPoint.getSignature().getName() + "()");
			myLog.setOPERATION(getControllerMethodDescription(joinPoint));
			if (queryString == null) {
				String urlPath = urlPath1;
				myLog.setURL(urlPath);
			} else {
				String urlPath2 = urlPath1 + "?" + queryString;
				// StringBuffer urlPath = new StringBuffer(urlPath2);
				myLog.setURL(urlPath2);
			}

			myLog.setIP(ip);
			// myLog.setNormal(LOG_NORMAL);

			if (username != null) {
				myLog.setUSERID(list.get(0).getUSERID());
			} else {
				myLog.setUSERID("00000000-0000-0000-0000-000000000000");
			}
			Date date = new Date();
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String time = format.format(date);
			myLog.setLOGTIME(time);

			logService.insertLog(myLog);
			logger.info("here wait for moment");
			System.out.println("=====后置通知结束=====");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings("rawtypes")
	public static String getControllerMethodDescription(JoinPoint joinPoint) throws Exception {
		String targetName = joinPoint.getTarget().getClass().getName(); // 获得执行方法的类名
		String methodName = joinPoint.getSignature().getName(); // 获得执行方法的方法名
		Object[] arguments = joinPoint.getArgs(); // 获取切点方法的所有参数类型
		Class targetClass = Class.forName(targetName);
		Method[] methods = targetClass.getMethods(); // 获取公共方法，不包括类私有的
		String description = "";
		for (Method method : methods) {
			if (method.getName().equals(methodName)) {
				Class[] clazzs = method.getParameterTypes(); // 对比方法中参数的个数
				if (clazzs.length == arguments.length) {
					description = method.getAnnotation(SystemControllerLog.class).description();
					break;
				}
			}
		}
		return description;
	}

	public static String getIP(HttpServletRequest request) {
		String ip = request.getHeader("x-forwarded-for");
		if (!checkIP(ip)) {
			ip = request.getHeader("Proxy-Client-IP");
		}
		if (!checkIP(ip)) {
			ip = request.getHeader("WL-Proxy-Client-IP");
		}
		if (!checkIP(ip)) {
			ip = request.getRemoteAddr();
		}
		return ip;
	}

	private static boolean checkIP(String ip) {
		if (ip == null || ip.length() == 0 || "unkown".equalsIgnoreCase(ip) || ip.split(".").length != 4) {
			return false;
		}
		return true;
	}
}
