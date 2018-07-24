package com.xjtu.iqa.service;

public interface UserQuestionService {
	/**
	 * abstract:记录用户提问记录
	 */
	void addUserQuestion(String questionId,String username, String comment, String from);
	
	/**
	 * 用户满意度
	 */
	void addUserSaticfaction(String questionId, String answerId, int saticfaction);
}
