package com.xjtu.iqa.mapper;

import java.util.List;

import com.xjtu.iqa.po.UserQuestion;
import com.xjtu.iqa.po.UserQuestionExample;

public interface UserQuestionMapper {
	int deleteByPrimaryKey(String USERQUESTIONID);

	int insert(UserQuestion record);

	int insertSelective(UserQuestion record);

	List<UserQuestion> selectByExample(UserQuestionExample example);

	UserQuestion selectByPrimaryKey(String USERQUESTIONID);

	int updateByPrimaryKeySelective(UserQuestion record);

	int updateByPrimaryKey(UserQuestion record);

	// 查看是否已填写过满意度
	String getQuertionInfo(String questionId);

	// 更新已处理的状态
	void updateRobotAnswerState(String questionId, int questionState);

	// zzl_获取应答表中问题对应的知识库答案id_2017年11月4日21:31:49
	String getFaqAnswerIdByQuestionId(String userQuestionId);
}