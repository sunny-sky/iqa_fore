package com.xjtu.iqa.controller;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;
import com.xjtu.iqa.annotation.SystemControllerLog;
import com.xjtu.iqa.mapper.ItMapper;
import com.xjtu.iqa.mapper.PayMapper;
import com.xjtu.iqa.mapper.TimeStampMapper;
import com.xjtu.iqa.mapper.UserMapper;
import com.xjtu.iqa.po.It;
import com.xjtu.iqa.po.Pay;
import com.xjtu.iqa.po.User;
import com.xjtu.iqa.service.UserService;
import com.xjtu.iqa.util.CopyFile;
import com.xjtu.iqa.util.JsonUtil;
import com.xjtu.iqa.util.MD5;
import com.xjtu.iqa.util.RegexAddress;
import com.xjtu.iqa.vo.Personal2_CommunityView;
import com.xjtu.iqa.vo.Personal2_FaqView;
import com.xjtu.iqa.vo.Personal2_PayView;
import com.xjtu.iqa.vo.Personal2_indexList;
import com.xjtu.iqa.vo.UserView;

@Controller
public class UserController {
	@Autowired
	UserMapper userMapper;
	@Autowired
	UserService userService;
	@Autowired
	TimeStampMapper timeStampMapper;
	@Autowired
	PayMapper payMapper;
	@Autowired
	ItMapper itMapper;
	
	/*
	 * login_ajax_注册
	 */
	@ResponseBody
	@RequestMapping(value={"/saveRegister"},method={org.springframework.web.bind.annotation.RequestMethod.POST},produces="text/plain;charset=UTF-8")
	public String registerlist(HttpServletRequest request,HttpServletResponse response) throws NoSuchAlgorithmException, UnsupportedEncodingException{	
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		
		//判断用户名是否被注册
		Boolean isExist = userMapper.getUserInfoByName(name);
		
		/*isExist == false 用户未注册;	isExist == true 用户已注册*/
		if (isExist == false) {
			userService.login_register(name, password);
			return "0";
		}else {
			return "1";
		}
	}
	
	
	/**
	 * abstract:用户登录
	 */
	@ResponseBody
	@RequestMapping(value="/saveLogin",method=RequestMethod.POST)
	@SystemControllerLog(description = "用户登录")
	public String loginlist(UserView userView,HttpSession session,HttpServletRequest request) throws NoSuchAlgorithmException, UnsupportedEncodingException{
		String path = request.getServletPath();				
		long startTime = System.currentTimeMillis();//计算开始日期
				
		String urlPath = (String) session.getAttribute("urlPath");
		
		if (urlPath==null) {
			urlPath = "/robot.html";
		}
		
		//zzl_获得前台用户名或密码
		/*String username = userView.getNameOrEmail();
		String password = userView.getUserPassword();*/
		
		String username = request.getParameter("nameOrEmail");
		String password = request.getParameter("userPassword");
		System.out.println(username+"  "+password);
		
		
		JSONObject jsonObject = new JSONObject();
		
		//获取登录用户信息
		Boolean isExist = userService.isLogin(username, password);
		
		System.out.println(isExist);
		
		/*用户名 或密码错误，返回登录页面重新登录;正确跳转至urlPath所指向页面*/		 
		if ( false == isExist ) {			
			long executionTime = System.currentTimeMillis() - startTime;
			
			/*SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String dateStr = dateformat.format(startTime);*/
			//记录运行时间
			System.out.println("buzhengque");
			timeStampMapper.addTimeStamp(UUID.randomUUID().toString(),path,executionTime,startTime);			
			jsonObject.put("value", "0");
			String result = JsonUtil.toJsonString(jsonObject); 			
			return result;
			
			//return "redirect:login.html";			
		}else {
			System.out.println("zhengque");
			//zzl_查找登录用户信息
			User list = userService.loginUserInfo(username);
			
			session.setAttribute("UserId", list.getUSERID());
			session.setAttribute("UserName", list.getUSERNAME());
						
			long executionTime = System.currentTimeMillis() - startTime;
			//记录运行时间
			/*SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String dateStr = dateformat.format(startTime);*/
			timeStampMapper.addTimeStamp(UUID.randomUUID().toString(),path,executionTime,startTime);
			
			jsonObject.put("value", "1");
			jsonObject.put("urlPath", urlPath);
			System.out.println("urlPath   "+urlPath);
			String result = JsonUtil.toJsonString(jsonObject);
			return result;
			//return "redirect:"+urlPath;			
		}		
	}
	
	/*
	 * 用户退出
	 */
	@RequestMapping(value="/loginout",method=RequestMethod.GET)
	@SystemControllerLog(description = "用户推出")
	public String loginout(HttpSession session,HttpServletRequest request){
		long startTime = System.currentTimeMillis();//计算开始日期
		String path = request.getServletPath();			
		String urlPath = (String) session.getAttribute("urlPath");
		session.invalidate();		
		long executionTime = System.currentTimeMillis() - startTime;		
		//记录运行时间
		timeStampMapper.addTimeStamp(UUID.randomUUID().toString(),path,executionTime,startTime);
		return "redirect:"+urlPath;
	}
	
	/*
	 * personal_个人信息
	 */
	@RequestMapping(value="personal",method=RequestMethod.GET)
	@SystemControllerLog(description = "个人基本信息")
	public ModelAndView personal(UserView userView ,HttpSession session,HttpServletRequest request){
		long startTime = System.currentTimeMillis();//计算开始日期
		String path = request.getServletPath();		
		
		String username = (String) session.getAttribute("UserName");
		if (username==null) {
			long executionTime = System.currentTimeMillis() - startTime;			
			//记录运行时间
			timeStampMapper.addTimeStamp(UUID.randomUUID().toString(),path,executionTime,startTime);
			
			return new ModelAndView("login");			
		}else {
			ModelAndView mv = new ModelAndView("personal");
			
			User list = userMapper.getUserInfo(username);
			String address = list.getUSERADDRESS();
		
			if(address==null){
				
			}else {
				mv.addObject("address", RegexAddress.replaceAddress(address));
			}
			mv.addObject("personal_list", list);
			long executionTime = System.currentTimeMillis() - startTime;
			
			//记录运行时间
			timeStampMapper.addTimeStamp(UUID.randomUUID().toString(),path,executionTime,startTime);
			return mv;
		}
		
	}
	
	/*
	 * personal_个人信息添加
	 */
	@RequestMapping(value="/addUserInfo",method=RequestMethod.POST)
	@SystemControllerLog(description = "个人信息添加")
	public String addUserInfo(UserView userView,HttpServletRequest request,HttpSession session){
		long startTime = System.currentTimeMillis();//计算开始日期
		String path = request.getServletPath();	
		
		//zzl_获得前台用户名
		String loginUsername = (String) session.getAttribute("UserName");
		String usersex = "";
		String address = "";
		if (loginUsername==null) {			
			long executionTime = System.currentTimeMillis() - startTime;			
			//记录运行时间
			timeStampMapper.addTimeStamp(UUID.randomUUID().toString(),path,executionTime,startTime);
			return "redirect:login.html";
		}else {			
			User list = userMapper.getUserInfo(loginUsername);			
			if(userView.getUserSex()==null){
				usersex = list.getGENDER();
			}else if (userView.getUserSex()!=null) {
				usersex = userView.getUserSex();
			}			
			String userbirthday = userView.getUserBirthday();
			String province = userView.getProvince();
			String city = userView.getCity();
			String district = userView.getDistrict();

			if (province==""&&city==""&&district=="") {
				address = list.getUSERADDRESS();
			}else {
				address = "0"+province+"1"+city+"2"+district+"3";
			}
			String userbrief = userView.getUserBrief();
			//zzl_获取登录用户信息
			User userlist = userService.loginUserInfo(loginUsername);	
		
			userMapper.updateUserInfo2(userlist.getUSERID(), usersex, userbirthday, address, userbrief);					
			long executionTime = System.currentTimeMillis() - startTime;
			
			//记录运行时间
			timeStampMapper.addTimeStamp(UUID.randomUUID().toString(),path,executionTime,startTime);
			return "redirect:personal.html";
		}
	}
		
	/*
	 * personal_个人密码修改
	 */
	@ResponseBody
	@RequestMapping(value={"/updateUserPassword"},method={org.springframework.web.bind.annotation.RequestMethod.POST},produces="text/html;charset=UTF-8")
	@SystemControllerLog(description = "密码修改")
	public String updateUserPassword(HttpServletRequest request,HttpServletResponse response,HttpSession session) throws NoSuchAlgorithmException, UnsupportedEncodingException{
		long startTime = System.currentTimeMillis();//计算开始日期
		String path = request.getServletPath();		
			
		String username = (String) session.getAttribute("UserName");
		String password = request.getParameter("password");		
		String password2 = request.getParameter("password2");

		if (username==null) {
			long executionTime = System.currentTimeMillis() - startTime;			
			//记录运行时间
			timeStampMapper.addTimeStamp(UUID.randomUUID().toString(),path,executionTime,startTime);			
			return "redirect:login.html";
		}else {
			if (password.equals(password2)) {
				//新密码和旧密码重复				
				long executionTime = System.currentTimeMillis() - startTime;				
				//记录运行时间
				timeStampMapper.addTimeStamp(UUID.randomUUID().toString(),path,executionTime,startTime);				
				return "0";
			}else {
				boolean islogin = userService.isLogin(username, password);
				if (islogin==false) {
					//密码错误									
					long executionTime = System.currentTimeMillis() - startTime;					
					//记录运行时间
					timeStampMapper.addTimeStamp(UUID.randomUUID().toString(),path,executionTime,startTime);
					return "1";
				}else {
					//登录成功					
					password2 = MD5.EncoderByMd5(password2);					
					//修改密码
					userMapper.updateUserPassword(username, password2);					
					System.out.println("返回2");				
					long executionTime = System.currentTimeMillis() - startTime;					
					//记录运行时间
					timeStampMapper.addTimeStamp(UUID.randomUUID().toString(),path,executionTime,startTime);
					return "2";
				}
			}
		}
	}
	
	
	/*
	 * 头像上传
	 */
	@ResponseBody
	@RequestMapping(value = "/uploadUserImage",method=RequestMethod.POST)
	@SystemControllerLog(description = "头像上传")
    public String uploadUserImage(HttpServletRequest request,HttpSession session) throws IOException {
		String path1 = request.getContextPath();
		String username = (String) session.getAttribute("UserName");		
		if (username==null) {
			return "redirect:login.html";
		}else {
			MultipartHttpServletRequest mRequest = (MultipartHttpServletRequest) request;//request强制转换注意
			Iterator<String> iterator = mRequest.getFileNames();
	        String path  ="";
	        String fileName = "";
	        String suffix = "";
			String filename = "";
	        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
	        String dir = "static/image/"+username +"/"+ sdf.format(new Date()) + "/";
	        String realPath = request.getSession().getServletContext().getRealPath("/");
	       	        
	        while(iterator.hasNext()){
	            MultipartFile multipartFile = mRequest.getFile(iterator.next());
	            if(multipartFile != null){
	                String fn = multipartFile.getOriginalFilename();
	                 suffix = fn.substring(fn.lastIndexOf("."));
	                 filename = RandomStringUtils.randomAlphanumeric(6);
	                fileName = dir + filename + suffix;
	                path = realPath + fileName;
	                path = path.replace("\\", "/");
	                File f = new File(path);
	                if(!f.mkdirs()){
	                    f.mkdir();
	                }
	                multipartFile.transferTo(f);
	            }
	        }
	        
	        CopyFile copyFile = new CopyFile();
	        String newPath = copyFile.copyFile(path, username, sdf.format(new Date()));

	        newPath = newPath.replace("\\", "/");
	        newPath = newPath.replace("E:/eclipse/workspace/robot-master/org.xjtusicd3.partner/src/main/webapp", "/01");
	        userMapper.updateUserImage(username, newPath);
			try {
				Thread.sleep(3500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	        String aString = "{\"result\":\""+newPath+"\"}";
			return aString;
		}
    }
		
	/*
	 * zyq_personal2_个人信息
	 */
	@RequestMapping(value="personal2",method=RequestMethod.GET)
	@SystemControllerLog(description = "个人主页")
	public ModelAndView personal2(String u,HttpServletRequest request,HttpSession session){
		//u是url传过来的被访问用户，UserId是现在登录用户
		long startTime = System.currentTimeMillis();//计算开始日期
		String path = request.getServletPath();		
		String username = (String) session.getAttribute("UserName");
		String userId = (String) session.getAttribute("UserId");
		User list = new User();		
		if (username==null) {			
			long executionTime = System.currentTimeMillis() - startTime;			
			//记录运行时间
			timeStampMapper.addTimeStamp(UUID.randomUUID().toString(),path,executionTime,startTime);
			return new ModelAndView("login");
		}else {
			//显示主页页面
			ModelAndView mv = new ModelAndView("personal2");
			//当传入的userid（u）是空或者u就是当前用户时，是查看自己的主页
			if (u==null||u==userId) {
				//zzl_查看自己主页
				list = userMapper.getUserInfo(username);
				List<Personal2_indexList> lists = userService.personal2_indexList(username);				
				mv.addObject("IsMy", "1");
				mv.addObject("indexList", lists);
				mv.addObject("indexListSize", lists.size());
			}else {
				//查看他人主页
				list = userMapper.getUserInfoById(u);
				mv.addObject("IsMy", "0");
				//zzl_查看是否关注
				List<Pay> payPersistences = payMapper.getpayList(userId,u);
				String toUserName = userMapper.getUserNameById(u);
				List<Personal2_indexList> lists = userService.personal2_indexList(toUserName);
				mv.addObject("indexList", lists);
				mv.addObject("indexListSize", lists.size());				
				if (payPersistences.size()==0) {
					mv.addObject("payList","0");
				}else {
					mv.addObject("payList","1");
				}			
			}
			
			List<It> list2 = itMapper.IT(list.getUSERID());
			if (list2.size()!=0) {
				mv.addObject("GOODWORK", list2.get(0).getGOODWORK());
				mv.addObject("WORKAGE", list2.get(0).getWORKAGE());
			}
			int paySize = payMapper.payListSize(list.getUSERID());
			int bepaySize = payMapper.bepayListSize(list.getUSERID());
			
			mv.addObject("personal2_list", list);
			mv.addObject("paynumber", paySize);//关注人数
			mv.addObject("bepaynumber", bepaySize);//粉丝数
			mv.addObject("uid", userId);			
			long executionTime = System.currentTimeMillis() - startTime;			
			//记录运行时间
			timeStampMapper.addTimeStamp(UUID.randomUUID().toString(),path,executionTime,startTime);
			return mv;		
		}			
	}
	
	/*
	 * zyq_personal2_ajax_获取更多的个人主页信息
	 */
	@ResponseBody
	@RequestMapping(value={"/getMoreIndex"},method={org.springframework.web.bind.annotation.RequestMethod.POST},produces="application/json;charset=UTF-8")
	@SystemControllerLog(description = "获取更多的个人主页信息")
	public String getMoreIndex(HttpServletRequest request,HttpSession session){
		String username = (String) session.getAttribute("UserName");
		String time1 = request.getParameter("time1");
		String time2 = request.getParameter("time2");
		String time3 = request.getParameter("time3");
		String time11 = request.getParameter("time11");
		String time22 = request.getParameter("time22");
		String time33 = request.getParameter("time33");
		JSONObject jsonObject = new JSONObject();
		if (username==null) {
			jsonObject.put("value", "0");
			String result = JsonUtil.toJsonString(jsonObject); 
			return result;
		}else{
			List<Personal2_indexList> personal2_indexLists = userService.personal2_indexList_Limit(username,time1,time2,time3,time11,time22,time33);
			jsonObject.put("personalIndex", personal2_indexLists);
			jsonObject.put("personalIndexSize", personal2_indexLists.size());
			jsonObject.put("value", "1");
			String result = JsonUtil.toJsonString(jsonObject); 
			return result;
		}
	}
	
	/*
	 * zyq_personal2_ajax_获取知识库列表
	 */
	@ResponseBody
	@RequestMapping(value={"/getpersonalFaq"},method={org.springframework.web.bind.annotation.RequestMethod.POST},produces="application/json;charset=UTF-8")
	@SystemControllerLog(description = "获取知识库列表")
	public String getpersonalFaq(HttpServletRequest request,HttpSession session){
		long startTime = System.currentTimeMillis();//计算开始日期
		String path = request.getServletPath();				
		String username = (String) session.getAttribute("UserName");
		String userId = request.getParameter("userId");
		JSONObject jsonObject = new JSONObject();
		if (username==null) {
			jsonObject.put("value", "0");
			String result = JsonUtil.toJsonString(jsonObject); 		
			long executionTime = System.currentTimeMillis() - startTime;		
			//记录运行时间
			timeStampMapper.addTimeStamp(UUID.randomUUID().toString(),path,executionTime,startTime);
			return result;
		}else{
			List<Personal2_FaqView> personal2_FaqViews = userService.getpersonalFaq(userId);
			jsonObject.put("faqView", personal2_FaqViews);
			jsonObject.put("value", "1");
			String result = JsonUtil.toJsonString(jsonObject); 			
			long executionTime = System.currentTimeMillis() - startTime;
			//记录运行时间
			timeStampMapper.addTimeStamp(UUID.randomUUID().toString(),path,executionTime,startTime);
			return result;
		}
	}
	
	/*
	 * zyq_personal2_ajax_获取更多的个人FAQ
	 */
	@ResponseBody
	@RequestMapping(value={"/getMoreFaq1"},method={org.springframework.web.bind.annotation.RequestMethod.POST},produces="application/json;charset=UTF-8")
	@SystemControllerLog(description = "获取更多的个人FAQ")
	public String getMoreFaq1(HttpServletRequest request,HttpSession session){
		String username = (String) session.getAttribute("UserName");
		String userId = userMapper.getUserIdByName(username);
		int startnumber = Integer.parseInt(request.getParameter("startnumber"));
		JSONObject jsonObject = new JSONObject();
		if (username==null) {
			jsonObject.put("value", "0");
			String result = JsonUtil.toJsonString(jsonObject); 
			return result;
		}else{
			List<Personal2_FaqView> personal2_FaqViews = userService.getpersonalFaq_More(userId, startnumber);
			jsonObject.put("faqView", personal2_FaqViews);
			jsonObject.put("value", "1");
			String result = JsonUtil.toJsonString(jsonObject); 
			return result;
		}
	}
	
	/*
	 * zyq_personal2_ajax_获取收藏FAQ
	 */
	@ResponseBody
	@RequestMapping(value={"/getCollectFaq"},method={org.springframework.web.bind.annotation.RequestMethod.POST},produces="application/json;charset=UTF-8")
	@SystemControllerLog(description = "获取收藏FAQ")
	public String getCollectFaq(HttpServletRequest request,HttpSession session){
		long startTime = System.currentTimeMillis();//计算开始日期
		String path = request.getServletPath();			
		String username = (String) session.getAttribute("UserName");
		String userId = userMapper.getUserIdByName(username);
		JSONObject jsonObject = new JSONObject();
		if (username==null) {
			jsonObject.put("value", "0");
			String result = JsonUtil.toJsonString(jsonObject); 			
			long executionTime = System.currentTimeMillis() - startTime;			
			//记录运行时间
			timeStampMapper.addTimeStamp(UUID.randomUUID().toString(),path,executionTime,startTime);
			return result;
		}else{
			List<Personal2_FaqView> personal2_FaqViews = userService.getCollectionFaq(userId);
			jsonObject.put("faqView", personal2_FaqViews);
			jsonObject.put("value", "1");
			String result = JsonUtil.toJsonString(jsonObject);
			
			long executionTime = System.currentTimeMillis() - startTime;
			
			//记录运行时间
			timeStampMapper.addTimeStamp(UUID.randomUUID().toString(),path,executionTime,startTime);
			return result;
		}
	}
	
	/*
	 * zyq_personal2_ajax_获取更多的收藏FAQ
	 */
	@ResponseBody
	@RequestMapping(value={"/getMoreCollectFaq"},method={org.springframework.web.bind.annotation.RequestMethod.POST},produces="application/json;charset=UTF-8")
	@SystemControllerLog(description = "获取更多的收藏FAQ")
	public String getMoreCollectFaq(HttpServletRequest request,HttpSession session){
		String username = (String) session.getAttribute("UserName");
		String userId = userMapper.getUserIdByName(username);
		int startnumber = Integer.parseInt(request.getParameter("startnumber"));
		JSONObject jsonObject = new JSONObject();
		if (username==null) {
			jsonObject.put("value", "0");
			String result = JsonUtil.toJsonString(jsonObject); 
			return result;
		}else{
			List<Personal2_FaqView> personal2_FaqViews = userService.getCollectionFaq_More(userId,startnumber);
			jsonObject.put("faqView", personal2_FaqViews);
			jsonObject.put("value", "1");
			String result = JsonUtil.toJsonString(jsonObject);
			return result;
		}
	}
	
	/*
	 * zyq_personal2_ajax_获取FAQ的评论
	 */
	@ResponseBody
	@RequestMapping(value={"/getCommentFaq"},method={org.springframework.web.bind.annotation.RequestMethod.POST},produces="application/json;charset=UTF-8")
	@SystemControllerLog(description = "获取FAQ的评论")
	public String getCommentFaq(HttpServletRequest request,HttpSession session){		
		long startTime = System.currentTimeMillis();//计算开始日期
		String path = request.getServletPath();	
		
		String username = (String) session.getAttribute("UserName");
		String userId = userMapper.getUserIdByName(username);
		JSONObject jsonObject = new JSONObject();
		if (username==null) {
			jsonObject.put("value", "0");
			String result = JsonUtil.toJsonString(jsonObject); 			
			long executionTime = System.currentTimeMillis() - startTime;			
			//记录运行时间
			timeStampMapper.addTimeStamp(UUID.randomUUID().toString(),path,executionTime,startTime);
			return result;
		}else{
			List<Personal2_FaqView> personal2_FaqViews = userService.getCommentFaq(userId);
			jsonObject.put("faqView", personal2_FaqViews);
			jsonObject.put("value", "1");
			String result = JsonUtil.toJsonString(jsonObject);			
			long executionTime = System.currentTimeMillis() - startTime;
			//记录运行时间
			timeStampMapper.addTimeStamp(UUID.randomUUID().toString(),path,executionTime,startTime);
			return result;
		}
	}
	
	/*
	 * zyq_personal2_ajax_获取更多FAQ的评论
	 */
	@ResponseBody
	@RequestMapping(value={"/getMoreCommentFaq"},method={org.springframework.web.bind.annotation.RequestMethod.POST},produces="application/json;charset=UTF-8")
	@SystemControllerLog(description = "获取更多FAQ的评论")
	public String getMoreCommentFaq(HttpServletRequest request,HttpSession session){
		String username = (String) session.getAttribute("UserName");
		String userId = userMapper.getUserIdByName(username);
		int startnumber = Integer.parseInt(request.getParameter("startnumber"));
		JSONObject jsonObject = new JSONObject();
		if (username==null) {
			jsonObject.put("value", "0");
			String result = JsonUtil.toJsonString(jsonObject); 
			return result;
		}else{
			List<Personal2_FaqView> personal2_FaqViews = userService.getCommentFaq_More(userId,startnumber);
			jsonObject.put("faqView", personal2_FaqViews);
			jsonObject.put("value", "1");
			String result = JsonUtil.toJsonString(jsonObject);
			return result;
		}
	}
	
	/*
	 * zyq_personal2_ajax_获取问吧的问题
	 */
	@ResponseBody
	@RequestMapping(value={"/getpersonalCommunity"},method={org.springframework.web.bind.annotation.RequestMethod.POST},produces="application/json;charset=UTF-8")
	@SystemControllerLog(description = "获取问吧的问题")
	public String getpersonalCommunity(HttpServletRequest request,HttpSession session){
		String username = (String) session.getAttribute("UserName");
		String userId = request.getParameter("userId");
		JSONObject jsonObject = new JSONObject();
		if (username==null) {
			jsonObject.put("value", "0");
			String result = JsonUtil.toJsonString(jsonObject); 
			return result;
		}else{
			List<Personal2_CommunityView> personal2_CommunityViews = userService.getpersonalCommunity(userId);
			jsonObject.put("communityView", personal2_CommunityViews);
			jsonObject.put("value", "1");
			String result = JsonUtil.toJsonString(jsonObject); 
			return result;
		}
	}
	
	/*
	 * zyq_personal2_ajax_获取更多问吧的问题
	 */
	@ResponseBody
	@RequestMapping(value={"/getMoreCommunity1"},method={org.springframework.web.bind.annotation.RequestMethod.POST},produces="application/json;charset=UTF-8")
	@SystemControllerLog(description = "获取更多问吧的问题")
	public String getMoreCommunity1(HttpServletRequest request,HttpSession session){
		String username = (String) session.getAttribute("UserName");
		String userId = userMapper.getUserIdByName(username);
		int startnumber = Integer.parseInt(request.getParameter("startnumber"));
		JSONObject jsonObject = new JSONObject();
		if (username==null) {
			jsonObject.put("value", "0");
			String result = JsonUtil.toJsonString(jsonObject); 
			return result;
		}else{
			List<Personal2_CommunityView> personal2_CommunityViews = userService.getMoreCommunity(userId,startnumber);
			jsonObject.put("communityView", personal2_CommunityViews);
			jsonObject.put("value", "1");
			String result = JsonUtil.toJsonString(jsonObject); 
			return result;
		}
	}
	
	/*
	 * zyq_personal2_ajax_获取问吧的关注答案
	 */
	@ResponseBody
	@RequestMapping(value={"/getPayCommunity"},method={org.springframework.web.bind.annotation.RequestMethod.POST},produces="application/json;charset=UTF-8")
	@SystemControllerLog(description = "获取问吧的关注答案")
	public String getPayCommunity(HttpServletRequest request,HttpSession session){
		String username = (String) session.getAttribute("UserName");
		String userId = request.getParameter("userId");
		JSONObject jsonObject = new JSONObject();
		if (username==null) {
			jsonObject.put("value", "0");
			String result = JsonUtil.toJsonString(jsonObject); 
			return result;
		}else{
			List<Personal2_CommunityView> personal2_CommunityViews = userService.getPayCommunity(userId);
			jsonObject.put("communityView", personal2_CommunityViews);
			jsonObject.put("value", "1");
			String result = JsonUtil.toJsonString(jsonObject); 
			return result;
		}
	}
	
	/*
	 * zyq_personal2_ajax_获取更多问吧的关注答案
	 */
	@ResponseBody
	@RequestMapping(value={"/getMorePayCommunity"},method={org.springframework.web.bind.annotation.RequestMethod.POST},produces="application/json;charset=UTF-8")
	@SystemControllerLog(description = "获取更多问吧的关注答案")
	public String getMorePayCommunity(HttpServletRequest request,HttpSession session){
		String username = (String) session.getAttribute("UserName");
		String userId = userMapper.getUserIdByName(username);
		int startnumber = Integer.parseInt(request.getParameter("startnumber"));
		JSONObject jsonObject = new JSONObject();
		if (username==null) {
			jsonObject.put("value", "0");
			String result = JsonUtil.toJsonString(jsonObject); 
			return result;
		}else{
			List<Personal2_CommunityView> personal2_CommunityViews = userService.getMorePayCommunity(userId,startnumber);
			jsonObject.put("communityView", personal2_CommunityViews);
			jsonObject.put("value", "1");
			String result = JsonUtil.toJsonString(jsonObject); 
			return result;
		}
	}
	
	/*
	 * zyq_personal2_ajax_获取问吧我的回答
	 */
	@ResponseBody
	@RequestMapping(value={"/getReplyCommunity"},method={org.springframework.web.bind.annotation.RequestMethod.POST},produces="application/json;charset=UTF-8")
	@SystemControllerLog(description = "获取问吧我的回答")
	public String getReplyCommunity(HttpServletRequest request,HttpSession session){
		String username = (String) session.getAttribute("UserName");
		String userId = request.getParameter("userId");
		JSONObject jsonObject = new JSONObject();
		if (username==null) {
			jsonObject.put("value", "0");
			String result = JsonUtil.toJsonString(jsonObject); 
			return result;
		}else{
			List<Personal2_CommunityView> personal2_CommunityViews = userService.getReplyCommunity(userId);
			jsonObject.put("communityView", personal2_CommunityViews);
			jsonObject.put("value", "1");
			String result = JsonUtil.toJsonString(jsonObject); 
			return result;
		}
	}
	
	/*
	 * zyq_personal2_ajax_获取更多问吧的回答
	 */
	@ResponseBody
	@RequestMapping(value={"/getMoreReplyCommunity"},method={org.springframework.web.bind.annotation.RequestMethod.POST},produces="application/json;charset=UTF-8")
	@SystemControllerLog(description = "获取更多问吧的回答")
	public String getMoreReplyCommunity(HttpServletRequest request,HttpSession session){
		String username = (String) session.getAttribute("UserName");
		User userPersistences = userMapper.getUserInfo(username);
		JSONObject jsonObject = new JSONObject();
		int startnumber = Integer.parseInt(request.getParameter("startnumber"));
		if (username==null) {
			jsonObject.put("value", "0");
			String result = JsonUtil.toJsonString(jsonObject); 
			return result;
		}else{
			List<Personal2_CommunityView> personal2_CommunityViews = userService.getMoreReplyCommunity(userPersistences.getUSERID(),startnumber);
			jsonObject.put("communityView", personal2_CommunityViews);
			jsonObject.put("value", "1");
			String result = JsonUtil.toJsonString(jsonObject); 
			return result;
		}
	}
	
	/*
	 * zyq_personal2_ajax_获取关注列表
	 */
	@ResponseBody
	@RequestMapping(value={"/getPay"},method={org.springframework.web.bind.annotation.RequestMethod.POST},produces="application/json;charset=UTF-8")
	@SystemControllerLog(description = "获取关注列表")
	public String getPay(HttpServletRequest request,HttpSession session){
		String username = (String) session.getAttribute("UserName");
		String userId = request.getParameter("userId");
		JSONObject jsonObject = new JSONObject();
		if (username==null) {
			jsonObject.put("value", "0");
			String result = JsonUtil.toJsonString(jsonObject); 
			return result;
		}else{
			List<Personal2_PayView> personal2_PayViews = userService.getPay(userId);
			jsonObject.put("payView", personal2_PayViews);
			jsonObject.put("value", "1");
			String result = JsonUtil.toJsonString(jsonObject); 
			return result;
		}
	}
	
	/*
	 * zyq_personal2_ajax_获取被关注列表
	 */
	@ResponseBody
	@RequestMapping(value={"/getbePay"},method={org.springframework.web.bind.annotation.RequestMethod.POST},produces="application/json;charset=UTF-8")
	@SystemControllerLog(description = "获取被关注列表")
	public String getbePay(HttpServletRequest request,HttpSession session){
		String username = (String) session.getAttribute("UserName");
		String userId = request.getParameter("userId");
		JSONObject jsonObject = new JSONObject();
		if (username==null) {
			jsonObject.put("value", "0");
			String result = JsonUtil.toJsonString(jsonObject); 
			return result;
		}else{
			List<Personal2_PayView> personal2_PayViews = userService.getbePay(userId);
			jsonObject.put("bepayView", personal2_PayViews);
			jsonObject.put("value", "1");
			String result = JsonUtil.toJsonString(jsonObject); 
			return result;
		}
	}
	
	/*
	 * zyq_personal2_关注
	 */
	@ResponseBody
	@RequestMapping(value={"/savePay"},method={org.springframework.web.bind.annotation.RequestMethod.POST},produces="application/json;charset=UTF-8")
	@SystemControllerLog(description = "用户关注")
	public String savePay(HttpServletRequest request,HttpSession session){
		String username = (String) session.getAttribute("UserName");
		String touserId = request.getParameter("touserId");
		JSONObject jsonObject = new JSONObject();
		if (username==null) {
			jsonObject.put("value", "0");
			String result = JsonUtil.toJsonString(jsonObject); 
			return result;
		}else{
			String userId = userMapper.getUserIdByName(username);
			List<Pay> payPersistences = payMapper.getpayList(userId, touserId);
			if (payPersistences.size()==0) {
				userService.savePay(userId,touserId);
			}
			jsonObject.put("value", "1");
			String result = JsonUtil.toJsonString(jsonObject); 
			return result;
		}
	}
	
	/*
	 * zyq_personal2_取消关注
	 */
	@ResponseBody
	@RequestMapping(value={"/deletePay"},method={org.springframework.web.bind.annotation.RequestMethod.POST},produces="application/json;charset=UTF-8")
	@SystemControllerLog(description = "取消关注")
	public String deletePay(HttpServletRequest request,HttpSession session){
		String username = (String) session.getAttribute("UserName");
		String touserId = request.getParameter("touserId");
		JSONObject jsonObject = new JSONObject();
		if (username==null) {
			jsonObject.put("value", "0");
			String result = JsonUtil.toJsonString(jsonObject); 
			return result;
		}else{
			String userId = userMapper.getUserIdByName(username);
			List<Pay> payPersistences = payMapper.getpayList(userId, touserId);
			if (payPersistences.size()!=0) {
				payMapper.deletePay(userId,touserId);
			}
			List<Personal2_PayView> personal2_PayViews = userService.getPay(userId);
			jsonObject.put("payView", personal2_PayViews);
			jsonObject.put("value", "1");
			String result = JsonUtil.toJsonString(jsonObject); 
			return result;
		}
	}
}
