package com.xjtu.iqa.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;
import com.xjtu.iqa.annotation.SystemControllerLog;
import com.xjtu.iqa.mapper.RobotMapper;
import com.xjtu.iqa.mapper.TimeStampMapper;
import com.xjtu.iqa.mapper.UserMapper;
import com.xjtu.iqa.mapper.UserQuestionMapper;
import com.xjtu.iqa.po.Robot;
import com.xjtu.iqa.po.User;
import com.xjtu.iqa.service.FaqClassifyService;
import com.xjtu.iqa.service.RobotService;
import com.xjtu.iqa.service.UserQuestionService;
import com.xjtu.iqa.util.JsonUtil;
import com.xjtu.iqa.vo.robot_Chat;

@Controller
public class RobotController {
	@Autowired
	FaqClassifyService faqClassifyService;
	@Autowired
	RobotService robotService;
	@Autowired
	TimeStampMapper timeStampMapper;
	@Autowired
	RobotMapper robotMapper;
	@Autowired
	UserMapper userMapper;
	@Autowired
	UserQuestionMapper userQuestionMapper;
	@Autowired
	UserQuestionService userQuestionService;
	/*
	 * robot_分类
	 */
	@RequestMapping(value="robot",method=RequestMethod.GET)
	@SystemControllerLog(description = "robot_分类")
	public ModelAndView classifyName(HttpSession session,HttpServletRequest request){
		ModelAndView modelAndView = new ModelAndView("robot");
		String string = faqClassifyService.classify();
		modelAndView.addObject("string",string);

		String urlPath = request.getServletPath();
		session.setAttribute("urlPath", urlPath);
		return modelAndView;
	}
	
	@ResponseBody
	@RequestMapping(value={"/getRobotInfo"},method={org.springframework.web.bind.annotation.RequestMethod.GET},produces="text/plain;charset=UTF-8")
	@SystemControllerLog(description = "获取机器人信息")
	public String RobotInfo(HttpServletResponse response,HttpServletRequest request){
		long startTime = System.currentTimeMillis();//计算开始日期
		String path = request.getServletPath();		
		response.setContentType("application/json");
		response.setCharacterEncoding("utf-8");
		//获得机器人信息
		List<Robot> list = robotService.robotinfo();		
		String result = JsonUtil.toJsonString(list);		
		long executionTime = System.currentTimeMillis() - startTime;		
		//记录运行时间
		timeStampMapper.addTimeStamp(UUID.randomUUID().toString(),path,executionTime,startTime);
		return result;
	 }
	
	/**
	 * abstract:robot页面 点击“提问技巧”
	 */
	@ResponseBody
	@RequestMapping(value={"/questionSkill"},method={org.springframework.web.bind.annotation.RequestMethod.GET},produces="application/json;charset=UTF-8")
	@SystemControllerLog(description = "提问技巧")
	public String questionSkill(HttpSession session,HttpServletResponse response){
		response.setContentType("application/json");
		response.setCharacterEncoding("utf-8");

		String username = (String) session.getAttribute("UserName");
		JSONObject jsonObject = new JSONObject();
		
		//获取机器人信息
		List<Robot> robotPersistences = robotMapper.robotinfo();		
		jsonObject.put("robotInfo", robotPersistences);
		
		//用户名为空返回 0，不空返回 1
		if (username==null) {
			jsonObject.put("value", "0");
		}else {
			jsonObject.put("value", "1");
			//获取用户信息
			User userPersistences = userMapper.getUserInfo(username);
			List<User> robotUser = new ArrayList<>();
			robotUser.add(0, userPersistences);
			jsonObject.put("robotUser", robotUser);
		}
		String result = JsonUtil.toJsonString(jsonObject);
		return result;
	 }	
	
	/*
	 * robot_ajax_和机器人聊天
	 */
	@ResponseBody
	@RequestMapping(value={"/chatWithRobot"},method={org.springframework.web.bind.annotation.RequestMethod.POST},produces="application/json;charset=UTF-8")
	@SystemControllerLog(description = "与机器人聊天")
	public String ChatWithRobot(HttpServletRequest request, HttpSession session) throws Exception{
		long startTime = System.currentTimeMillis();//计算开始日期
		String path = request.getServletPath();	
				
		//记录前台用户提问
		String comment = request.getParameter("comment");
		String from = request.getParameter("from");
		String username = (String) session.getAttribute("UserName");
		String questionId = UUID.randomUUID().toString();

		//zzl_记录用户提问记录_2017年10月22日11:23:00
		userQuestionService.addUserQuestion(questionId,username,comment,from);
		JSONObject jsonObject = new JSONObject();
		List<robot_Chat> rb = robotService.getRobotAnswerEasy(comment);
		String answerId;
		if(rb.size()==0){
			answerId = "00000000-0000-0000-0000-000000000000";
		}else{
			answerId = rb.get(0).getAnswerId();
		}
		
		List<Robot> robot = robotMapper.robotinfo();
		jsonObject.put("value", "1");
		jsonObject.put("robotChat", rb);
		jsonObject.put("robotInfo", robot);
		jsonObject.put("questionId", questionId);
		jsonObject.put("answerId", answerId);
		
		if(null != username){
			User user = userMapper.getUserInfo(username);
			List<User> robotUser = new ArrayList<>();
			robotUser.add(0, user);
			jsonObject.put("robotUser", robotUser);
		}else{
			List<User> robotUser = new ArrayList<>();
			jsonObject.put("robotUser", robotUser);
		}
		
		String result = JsonUtil.toJsonString(jsonObject);
		long executionTime = System.currentTimeMillis() - startTime;
		//记录运行时间
		timeStampMapper.addTimeStamp(UUID.randomUUID().toString(),path,executionTime,startTime);
		System.out.println(result);
		return result;
		/*暂用模糊搜索代替
		 * long startTime = System.currentTimeMillis();//计算开始日期
		String path = request.getServletPath();	
				
		//记录前台用户提问
		String comment = request.getParameter("comment");
		String from = request.getParameter("from");
		String username = (String) session.getAttribute("UserName");
		String questionId = UUID.randomUUID().toString();
		
		//zzl_记录用户提问记录_2017年10月22日11:23:00
		userQuestionService.addUserQuestion(questionId,username,comment,from);
		JSONObject jsonObject = new JSONObject();
		String answerId;
		List<robot_Chat> robot_Chats;
		if(null == robotService.getRobotAnswer(comment)){
			answerId = "00000000-0000-0000-0000-000000000000";
			robot_Chats = null;
		}else{
		//获取问题的答案
			robot_Chats = robotService.getRobotAnswer(comment);
		
		
//		if (robot_Chats.size()==0) {
//			answerId = "00000000-0000-0000-0000-000000000000";
//		}else {
			answerId = robot_Chats.get(0).getAnswerId();
		}
		
		//获取机器人信息，如欢迎语及不理解时的话语
		List<Robot> robotPersistences = robotMapper.robotinfo();		
		jsonObject.put("value", "1");
		//robotChat为推荐问题答案
		jsonObject.put("robotChat", robot_Chats);
		jsonObject.put("robotInfo", robotPersistences);
		jsonObject.put("questionId", questionId);
		jsonObject.put("answerId", answerId);
		
		if (username!=null) {
			User userPersistences = userMapper.getUserInfo(username);
			jsonObject.put("robotUser", userPersistences);
		}else {
			List<User> userPersistences = new ArrayList<User>();
			jsonObject.put("robotUser", userPersistences);
		}
		String result = JsonUtil.toJsonString(jsonObject);
		long executionTime = System.currentTimeMillis() - startTime;
		//记录运行时间
		timeStampMapper.addTimeStamp(UUID.randomUUID().toString(),path,executionTime,startTime);
		return result;*/
	}
	
	/**
	 * abstract:robot页面 回复对用户有帮助
	 */
	@ResponseBody
	@RequestMapping(value={"/beHelpful"},method={org.springframework.web.bind.annotation.RequestMethod.GET},produces="application/json;charset=UTF-8")
	@SystemControllerLog(description = "用户对回复满意")
	public String beHelpful(HttpSession session,HttpServletResponse response,HttpServletRequest request){
		String answerId = request.getParameter("answerId");
		String questionId = request.getParameter("questionId");		
		if (answerId == null) {
			answerId = "00000000-0000-0000-0000-000000000000";
		}		
		response.setContentType("application/json");
		response.setCharacterEncoding("utf-8");
		String username = (String) session.getAttribute("UserName");
		JSONObject jsonObject = new JSONObject();
		
		//获取机器人信息
		List<Robot> robotPersistences = robotMapper.robotinfo();
		jsonObject.put("robotInfo", robotPersistences);
	
		//查看是否已填写过满意度
		String robotAnswerId = userQuestionMapper.getQuertionInfo(questionId);
		
		if (robotAnswerId==null) {
			/*
			 * 用户满意SATICFACTION置为 1 
			 * 用户名为空value返回 0，不空返回 1
			 */
			if (username==null) {
				userQuestionService.addUserSaticfaction(questionId,answerId,1);
				jsonObject.put("value", "0");
			}else {
				User userPersistences = userMapper.getUserInfo(username);
				jsonObject.put("robotUser", userPersistences);
				userQuestionService.addUserSaticfaction(questionId, answerId, 1);
				jsonObject.put("value", "1");
			}
		}else {
			jsonObject.put("value", "2");
		}		
		String result = JsonUtil.toJsonString(jsonObject);
		return result;
	 }
	
	/**
	 * abstract:用户不满意回复
	 */
	@ResponseBody
	@RequestMapping(value={"/NoHelpful"},method={org.springframework.web.bind.annotation.RequestMethod.GET},produces="application/json;charset=UTF-8")
	@SystemControllerLog(description = "用户对回复不满意")
	public String NoHelpful(HttpSession session,HttpServletResponse response,HttpServletRequest request){
		String answerId = request.getParameter("answerId");
		String questionId = request.getParameter("questionId");
		if (answerId == null) {
			answerId = "00000000-0000-0000-0000-000000000000";
		}

		response.setContentType("application/json");
		response.setCharacterEncoding("utf-8");

		String username = (String) session.getAttribute("UserName");
		JSONObject jsonObject = new JSONObject();
		
		//获取机器人信息
		List<Robot> robotPersistences = robotMapper.robotinfo();
		jsonObject.put("robotInfo", robotPersistences);
		
		//查看是否已填写过满意度
		String robotAnswerId = userQuestionMapper.getQuertionInfo(questionId);
		
		if (robotAnswerId ==null) {
			/*
			 * 用户不满意SATICFACTION置为 0 
			 * 用户名为空value返回 0，不空返回 1
			 */
			if (username==null) {
				userQuestionService.addUserSaticfaction(questionId,answerId,0);
				jsonObject.put("value", "0");
			}else {
				//获取用户信息
				User userPersistences = userMapper.getUserInfo(username);
				jsonObject.put("robotUser", userPersistences);

				userQuestionService.addUserSaticfaction(questionId,answerId,0);
				jsonObject.put("value", "1");
			}
		}else {
			jsonObject.put("value", "2");
		}		
		String result = JsonUtil.toJsonString(jsonObject);
		return result;
	 }	
}
