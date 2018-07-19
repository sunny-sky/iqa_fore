package com.xjtu.iqa.mapper;

import java.util.List;

import com.xjtu.iqa.po.Robot;
import com.xjtu.iqa.po.RobotExample;

public interface RobotMapper {
	int deleteByPrimaryKey(String ROBOTID);

	int insert(Robot record);

	int insertSelective(Robot record);

	List<Robot> selectByExample(RobotExample example);

	Robot selectByPrimaryKey(String ROBOTID);

	int updateByPrimaryKeySelective(Robot record);

	int updateByPrimaryKey(Robot record);

	// robot_ajax获取机器人信息
	List<Robot> robotinfo();
}