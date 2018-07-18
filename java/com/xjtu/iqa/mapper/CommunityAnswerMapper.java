package com.xjtu.iqa.mapper;

import com.xjtu.iqa.po.CommunityAnswer;
import com.xjtu.iqa.po.CommunityAnswerExample;
import java.util.List;

public interface CommunityAnswerMapper {
    int deleteByPrimaryKey(String COMMUNITYANSWERID);

    int insert(CommunityAnswer record);

    int insertSelective(CommunityAnswer record);

    List<CommunityAnswer> selectByExampleWithBLOBs(CommunityAnswerExample example);

    List<CommunityAnswer> selectByExample(CommunityAnswerExample example);

    CommunityAnswer selectByPrimaryKey(String COMMUNITYANSWERID);

    int updateByPrimaryKeySelective(CommunityAnswer record);

    int updateByPrimaryKeyWithBLOBs(CommunityAnswer record);

    int updateByPrimaryKey(CommunityAnswer record);
    
 // question_问题展示
 	List<CommunityAnswer> question_CommunityAnswer(String communityquestionId);

 	// 获取社区问题回复数
 	int question_CommunityAnswerCount(String communityquestionid);

 	// question_判断问题是否有最佳答案
 	List<CommunityAnswer> question_iscurrentAnswer(String questionid, int isbest);

 	// 查找最佳问题的最佳答案id
 	String findAnswerIdFromBestAnswer(String questionId, int isbestAnswer);

 	// 查找问题答案用户Id
 	String getUserIdByAnswerId(String communityanswerId);

 	// question_问题展示_byAnswerID
 	List<CommunityAnswer> question_CommunityAnswerId(String communityanswerId);

 	// question2_ajax_设置为最佳答案
 	void saveBestAnswer(String answerId, int isbest);

 	// 当前用户回复总数
 	int answerSizeByUserId(String userid);

 	// question_获取用户点评论详情
 	List<CommunityAnswer> question_CommunityAnswer_userId(String userid);

 	// 查看用户被点赞数量
 	int getCommunityAnswerLike(String userId);

 	// question_问题展示_other
 	List<CommunityAnswer> question_CommunityAnswer_other(String communityquestionId, int startNumber);

 	// question_判断评论是否重复提交
 	String question_IsCommunityAnswer(String userid, String content, String questionId);

 	// personal2_查看问题的回答
 	List<CommunityAnswer> personal2_ReplyCommunity(String userId, int startNumber, int number);

 	// notice_查看评论是否通知 !!!未使用
 	List<CommunityAnswer> notice_CommunityAnswer(String communityquestionid, int isnotice);
}