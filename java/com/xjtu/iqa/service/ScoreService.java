package com.xjtu.iqa.service;

public interface ScoreService {
	/**
	 * faq3_ajax_评分
	 */
	void saveFAQscore(String FAQquestionId,String userId,float score);
}
