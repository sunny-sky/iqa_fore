package com.xjtu.iqa.mapper;

import java.util.List;

import com.xjtu.iqa.po.Agree;
import com.xjtu.iqa.po.AgreeExample;

public interface AgreeMapper {
	int deleteByPrimaryKey(String AGREEID);

	int insert(Agree record);

	int insertSelective(Agree record);

	List<Agree> selectByExample(AgreeExample example);

	Agree selectByPrimaryKey(String AGREEID);

	int updateByPrimaryKeySelective(Agree record);

	int updateByPrimaryKey(Agree record);

	// question2_通过社区答案Id和用户Id获取agreeId
	String getAgree(String communityanswerId, String userid);

	// question2_对于答案点赞

	void saveAgree(String agreeid, String communityanswerId, String userid, String touserid, String time, int isnotice);

	// question2_取消点赞
	void deleteAgree(String agreeid);

	// 获取社区答案点赞个数
	int getAgreeSizeByAnswerId(String communityanswerId);

	//  question_查看用户点赞
	int getAgreebyUserId(String userid);
}