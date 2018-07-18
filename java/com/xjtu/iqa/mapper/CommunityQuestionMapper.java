package com.xjtu.iqa.mapper;

import com.xjtu.iqa.po.CommunityQuestion;
import com.xjtu.iqa.po.CommunityQuestionExample;
import java.util.List;

public interface CommunityQuestionMapper {
	int deleteByPrimaryKey(String COMMUNITYQUESTIONID);

	int insert(CommunityQuestion record);

	int insertSelective(CommunityQuestion record);

	List<CommunityQuestion> selectByExampleWithBLOBs(CommunityQuestionExample example);

	List<CommunityQuestion> selectByExample(CommunityQuestionExample example);

	CommunityQuestion selectByPrimaryKey(String COMMUNITYQUESTIONID);

	int updateByPrimaryKeySelective(CommunityQuestion record);

	int updateByPrimaryKeyWithBLOBs(CommunityQuestion record);

	int updateByPrimaryKey(CommunityQuestion record);

	// 非生成部分
	// 查看自己的论坛
	List<CommunityQuestion> notice_CommunityQuestion_Limit(String userid, int startNumber, int number);

	// 查看自己的论坛_time-limit
	List<CommunityQuestion> notice_CommunityQuestion_Limit_Time(String userid, int startNumber, int number,
			String time);

	// 时间倒序显示最新5条社区问题
	List<CommunityQuestion> question_getCommunity_isanswer(int startnumber);

	// ajax_question校验是否重复添加
	String question_iscurrent(String userid, String questiontitle);

	// 返回对应分类的全部问题
	List<CommunityQuestion> question_getCommunity(String classifyid);

	// 相关问题_返回对应分类的时间倒叙前5个问题
	List<CommunityQuestion> selectQuestionByClassifyId(String faqclassifyid);

	// 获取faqClassifyId分类号下的所有社区问题总数
	int questionSizeByClassifyId(String faqClassifyId);

	// 获取faqClassifyId分类号下的所有社区问题数_根据是否已有最佳答案来划分
	int questionSizeByClassifyIdLimit(String faqClassifyId, int isanswer);

	// 获取faqClassifyId分类号下的所有社区问题信息
	List<CommunityQuestion> question_getCommunity2(String classifyid, int isanswer);

	// question2_问题内容详情
	List<CommunityQuestion> question2_getCommunity(String questionId);

	// 查看问题号为 questionId 的提问者id
	String CommunityQuestion(String questionId);

	// question2_设为最佳答案
	void updateBestAnswer(String questionId, int isanswer);

	// 获取问题中心中所有没有最佳答案的问题信息_2017年11月6日09:20:07
	List<CommunityQuestion> problemInfo(int isanswer, int questionState);

	// 查看前10条待处理问题
	List<CommunityQuestion> problemInfo_limit(int isanswer, int questionState, int num);

	// 问题数量
	int problemCount(int isanswer, int questionState);

	// 更新社区问题状态_2017年11月12日18:38:02
	void updateCommunityQuestionState(String questionId, int questionState);

	// 根据是否有最佳答案获取社区问题信息
	List<CommunityQuestion> question_getCommunity2_isanswer(int startnumber, int isanswer);

	// notice_查询用户的提问 !!!未使用
	List<CommunityQuestion> notice_CommunityQuestion(String userid);

	// 获取当日待处理问题数
	int problemCount_time(int isanswer, int questionState, String time);

	int questionSize();

	int questionSizeLimit(int isanswer);
}