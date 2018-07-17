package com.xjtu.iqa.service;

import java.util.List;

import com.xjtu.iqa.vo.Faq2_faqContentView;
import com.xjtu.iqa.vo.Faq3_faqContentView;
import com.xjtu.iqa.vo.Faq_CommendView;
import com.xjtu.iqa.vo.Faq_UserDynamics;

public interface FaqQuestionService {
	/**
	 * FAQ页面_用户动态
	 */
	List<Faq_UserDynamics> userDynamics();

	// 有权限的角色分享社区问题
	void saveShare2(String userId, String faqquestionId);

	/**
	 * abstract:获取未登录用户推荐列表
	 */
	List<Faq_CommendView> faq_recommend_Limit(int faqstate, int startnum, int number);
	
	/**
	 * abstract:获取已登录用户推荐列表
	 * @param j 
	 * @param startnumber 
	 */
	List<Faq_CommendView> user_recommend_Limit(String userid, int state,int startnum,  int num);
	
	/**
	 * abstract:FAQ的增加
	 */
	void saveFAQ2(String userId, String title, String keywords, String subspecialCategoryId,String description, String faqcontent);
	
	/**
	 * abstract:推荐知识_根据收藏量推荐前4个
	 */
	List<Faq_CommendView> faqInfo(String faqParentId);
	
	/**
	 * faq2_知识列表
	 */
	List<Faq2_faqContentView> faqlist_faq2(String ClassifyId,int pageNow);
	
	/**
	 * faq3_知识内容
	 */
	List<Faq3_faqContentView> faq3_faqcontent(String QuestionId);
	
	/**
	 *	faq浏览量+1
	 */
	void updateFAQScan(String questionId);
	
	/**
	 * faq3_ajax_分享的增加
	 */
	void saveShare(String userId,String faqquestionId);
}
