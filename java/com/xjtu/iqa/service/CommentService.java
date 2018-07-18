package com.xjtu.iqa.service;

import java.util.List;

import com.xjtu.iqa.vo.Faq1_UserActive;
import com.xjtu.iqa.vo.Faq3_CommentReplyView;
import com.xjtu.iqa.vo.Faq3_CommentView;
import com.xjtu.iqa.vo.Question2_CommunityReplayView;

public interface CommentService {
	/**
	 * question2_获得更多的回复
	 */
	List<Question2_CommunityReplayView> question2_CommunityReplayViews(String questionId, String answerId,
			Integer startnumber);

	/**
	 * question2_设为最佳答案
	 */
	void saveBestAnswer(String questionId, String answerId);

	/**
	 * faq1_查看活跃用户
	 */
	List<Faq1_UserActive> faq1_userActive();

	/**
	 * faq1_查看活跃用户_按周查询
	 */
	List<Faq1_UserActive> faq1_userActive_week();

	// 获取日期
	String getdate(int i);
	
	/**
	 * faq3_获得评论列表
	 */
	List<Faq3_CommentView> faq3_comment(String questionId,int startnumber);
	
	/**
	 * faq3_ajax_添加评论
	 */
	void addComment(String userid, String faqquestionid, String comment,String faquserid);
	
	/**
	 * question2_ajax_添加评论的回复
	 */
	void saveCommunityComment(String userid,String communityquestionId,String comment,String answerId);
	
	/**
	 * faq3_ajax_添加评论的回复
	 */
	void saveFaqComment(String userid,String faqquestionId,String comment,String commentId,String duo);
	
	/**
	 * faq3_获得更多的回复
	 */
	List<Faq3_CommentReplyView> faq3_CommentReplyViews(String commentId,int startnumber);
}
