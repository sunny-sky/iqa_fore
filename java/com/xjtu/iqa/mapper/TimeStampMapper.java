package com.xjtu.iqa.mapper;

import java.util.List;

import com.xjtu.iqa.po.TimeStamp;
import com.xjtu.iqa.po.TimeStampExample;

public interface TimeStampMapper {
	int deleteByPrimaryKey(String TIMEID);

	int insert(TimeStamp record);

	int insertSelective(TimeStamp record);

	List<TimeStamp> selectByExample(TimeStampExample example);

	TimeStamp selectByPrimaryKey(String TIMEID);

	int updateByPrimaryKeySelective(TimeStamp record);

	int updateByPrimaryKey(TimeStamp record);

	// 记录运行时间
	void addTimeStamp(String timeId, String path, long executionTime, long startTime);
}