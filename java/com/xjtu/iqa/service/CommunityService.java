package com.xjtu.iqa.service;

import java.util.List;

import com.xjtu.iqa.vo.Question2_CommunityView;
import com.xjtu.iqa.vo.Question_CommunityView;

public interface CommunityService {
	/*
	 * zyq_question_问题展示 从 startnumber 开始加载 type类型【待解决、已解决、全部】的
	 * classifyname【具体知识库分类】的 5条记录
	 */
	List<Question_CommunityView> Question_CommunityView(String username,int startnumber,String type,String classifyname);

	/**
	 * 
	 * abstract:保存问题
	 * 
	 */
	void savaCommunityQuestion(String username,String title,String content,String classifyId);
	
	/*
	 * question2_问题展示_最佳答案的展示
	 */
	Question2_CommunityView question2_CommunityViews_best(String username,String questionId);
	
	/*
	 * question2_问题展示_除了最佳答案其他
	 */
	List<Question2_CommunityView> question2_CommunityViews_other(String username,String questionId,int startNumber);
	
	/*
	 * ajax_question2回复的增加
	 */
	void saveReplyQuestion(String userId,String content,String questionId);
	
}
