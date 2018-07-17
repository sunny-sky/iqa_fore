package com.xjtu.iqa.controller;

import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.xjtu.iqa.annotation.SystemControllerLog;
import com.xjtu.iqa.mapper.TimeStampMapper;
import com.xjtu.iqa.mapper.UserMapper;
import com.xjtu.iqa.po.FaqPicture;
import com.xjtu.iqa.po.TimeStamp;
import com.xjtu.iqa.service.FaqPictureService;
import com.xjtu.iqa.service.FaqQuestionService;
import com.xjtu.iqa.vo.Faq_CommendView;
import com.xjtu.iqa.vo.Faq_UserDynamics;

@Controller
public class FaqController {
	@Autowired
	FaqQuestionService faqQuestionService;
	@Autowired
	UserMapper userMapper;
	@Autowired
	FaqPictureService faqPictureService;
	@Autowired
	TimeStampMapper timeStampMapper;

	@RequestMapping(value = "faq", method = RequestMethod.GET)
	@SystemControllerLog(description = "faq首页面")
	public ModelAndView faq(HttpSession session, HttpServletRequest request, String q) {
		long startTime = System.currentTimeMillis();// 计算开始日期
		String path = request.getServletPath();

		String username = (String) session.getAttribute("UserName");
		ModelAndView mv = new ModelAndView("faq");
		String urlPath = "";

		if (request.getQueryString() == null) {
			urlPath = request.getServletPath();
		} else {
			urlPath = request.getServletPath() + "?" + request.getQueryString().toString();
		}

		// 查询所有用户发表知识的状态
		List<Faq_UserDynamics> userDynamics = faqQuestionService.userDynamics();
		session.setAttribute("urlPath", urlPath);

		// faq推荐栏
		List<FaqPicture> faqPicList = faqPictureService.faqPicture(1, 3);

		if (username == null) {
			// zzl未登录用户获取推荐faq_2017年9月14日21:43:52
			int startnum = 0;
			List<Faq_CommendView> faqlists = faqQuestionService.faq_recommend_Limit(2, startnum, 5);
			mv.addObject("faqlists", faqlists);
			mv.addObject("faqlistSize", faqlists.size());
		} else {
			// zzl_已登录用户获取推荐faq_2017年9月14日21:43:52
			String userId = userMapper.getUserIdByName(username);
			int startnum = 0;
			List<Faq_CommendView> faqlists = faqQuestionService.user_recommend_Limit(userId, 2, startnum, 5);
			mv.addObject("faqlists", faqlists);
			mv.addObject("faqlistSize", faqlists.size());
		}
		mv.addObject("userDynamics", userDynamics);
		mv.addObject("faqPicList", faqPicList);

		long executionTime = System.currentTimeMillis() - startTime;
		// 记录运行时间
		TimeStamp ts = new TimeStamp();
		ts.setTIMEID(UUID.randomUUID().toString());
		ts.setNAME(path);
		ts.setTIME(Long.toString(executionTime));
		ts.setBEGINTIME(Long.toString(startTime));
		timeStampMapper.insert(ts);
		
		return mv;
	}

}
