package com.xjtu.iqa.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xjtu.iqa.annotation.SystemControllerLog;
import com.xjtu.iqa.mapper.FaqClassifyMapper;
import com.xjtu.iqa.po.FaqClassify;
import com.xjtu.iqa.util.JsonUtil;

@Controller
public class ClassifyController {
	@Autowired
	FaqClassifyMapper faqClassifyMapper;
	/*
	 * faq、faq1_右侧的第一级分类
	 */
	@ResponseBody
	@RequestMapping(value={"/getFirstLevel"},method={org.springframework.web.bind.annotation.RequestMethod.GET},produces="text/plain;charset=UTF-8")
	@SystemControllerLog(description = "faq、faq1_右侧的第一级分类")
	public  String search(HttpServletResponse response){
		response.setContentType("application/json");
		response.setCharacterEncoding("utf-8");
		List<FaqClassify> classifyPersistences = faqClassifyMapper.FirstClassify_robot();
		if (classifyPersistences == null || classifyPersistences.size()==0) {
			return null;
		}			
		String result = JsonUtil.toJsonString(classifyPersistences);
		System.out.println(result);
		return result;
	 }
	
	/*
	 * ajax获取第二级分类
	 */
	@ResponseBody
	@RequestMapping(value={"/getSecondLevel"},method={org.springframework.web.bind.annotation.RequestMethod.GET},produces="text/plain;charset=UTF-8")
	@SystemControllerLog(description = "faq、faq1_获取第二级分类")
	public  String faq1_ClassifyName(String classifyId,HttpServletResponse response){
		response.setContentType("application/json");
		response.setCharacterEncoding("utf-8");
		//获取分类信息
		List<FaqClassify> classifyPersistences = faqClassifyMapper.SecondClassify_robot2(classifyId);
		if (classifyPersistences == null || classifyPersistences.size()==0) {
			return null;
		}			
		String result = JsonUtil.toJsonString(classifyPersistences);
		return result;
	 }
}
