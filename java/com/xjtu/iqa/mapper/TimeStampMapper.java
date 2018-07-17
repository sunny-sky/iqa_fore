package com.xjtu.iqa.mapper;

import com.xjtu.iqa.po.TimeStamp;
import com.xjtu.iqa.po.TimeStampExample;
import java.util.List;

public interface TimeStampMapper {
    int deleteByPrimaryKey(String TIMEID);

    int insert(TimeStamp record);

    int insertSelective(TimeStamp record);

    List<TimeStamp> selectByExample(TimeStampExample example);

    TimeStamp selectByPrimaryKey(String TIMEID);

    int updateByPrimaryKeySelective(TimeStamp record);

    int updateByPrimaryKey(TimeStamp record);
}