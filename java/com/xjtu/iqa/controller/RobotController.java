package com.xjtu.iqa.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.xjtu.iqa.annotation.SystemControllerLog;
import com.xjtu.iqa.service.FaqClassifyService;

@Controller
public class RobotController {
	@Autowired
	FaqClassifyService faqClassifyService;
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
}
