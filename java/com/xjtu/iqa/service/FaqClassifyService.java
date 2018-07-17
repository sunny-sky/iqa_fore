package com.xjtu.iqa.service;

import java.util.List;

import com.xjtu.iqa.po.FaqClassify;
import com.xjtu.iqa.vo.Faq1_ClassifyView;

public interface FaqClassifyService {
	/**
	 * robot-分类
	 */ 
	String classify();
	
	/**
	 * 标题转义
	 */
	String zhuanyi(String string);
	
	/**
	 * faq1_下面4栏推荐_按照浏览量
	 */
	List<Faq1_ClassifyView> faq1_ClassifyView(String parentId);
	
	/**
	 * 获取该分类的父分类信息
	 */
	List<FaqClassify> faq2_classify(String ClassifyId);
	
	/**
	 * 获取该分类的信息
	 */
	List<FaqClassify> faq2_classify2(String ClassifyId);
}
