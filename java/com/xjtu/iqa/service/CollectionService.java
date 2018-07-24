package com.xjtu.iqa.service;

public interface CollectionService {
	/**
	 * question2_ajax_添加收藏
	 * @param username
	 * @param communityanswerId
	 */
	void saveCollection(String username,String communityanswerId);

	/**
	 * faq3_ajax_添加收藏
	 * @param userId
	 * @param questionId
	 */
	void saveCollection2(String userId,String questionId);
}
