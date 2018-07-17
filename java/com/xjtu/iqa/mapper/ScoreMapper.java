package com.xjtu.iqa.mapper;

import com.xjtu.iqa.po.Score;
import com.xjtu.iqa.po.ScoreExample;
import java.util.List;

public interface ScoreMapper {
    int deleteByPrimaryKey(String SCOREID);

    int insert(Score record);

    int insertSelective(Score record);

    List<Score> selectByExample(ScoreExample example);

    Score selectByPrimaryKey(String SCOREID);

    int updateByPrimaryKeySelective(Score record);

    int updateByPrimaryKey(Score record);
}