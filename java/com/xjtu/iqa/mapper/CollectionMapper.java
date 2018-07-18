package com.xjtu.iqa.mapper;

import java.util.List;

import com.xjtu.iqa.po.Collection;
import com.xjtu.iqa.po.CollectionExample;

public interface CollectionMapper {
	int deleteByPrimaryKey(String COLLECTIONID);

	int insert(Collection record);

	int insertSelective(Collection record);

	List<Collection> selectByExample(CollectionExample example);

	Collection selectByPrimaryKey(String COLLECTIONID);

	int updateByPrimaryKeySelective(Collection record);

	int updateByPrimaryKey(Collection record);

	// question2_ajax_查看收藏Id
	String getCollection(String userid, String answerId);

	// question2_ajax_添加收藏
	void saveCollection(String collectionid, String communityanswerId, String userid, String time, int isnotice);

	// faq3_ajax_查看收藏Id
	String getCollection2(String userId, String questionId);

	// faq3_ajax_添加收藏
	void saveCollection2(String collectionid, String questionId, String userid, String time, int isnotice);

	// question2_faq3_删除收藏
	void deleteCollection(String collectionid);

	// 获取faq问题收藏总数
	int getCollectionFaqCount(String faqquestionid);

	// personal2_ajax_获取收藏FAQ
	List<Collection> getCollectionFaq(String userid, int startNumber, int number);

	// personal2_ajax_获取问吧的关注答案
	List<Collection> personal2_PayCommunity_Limit(String userId, int startNumber, int number);
}