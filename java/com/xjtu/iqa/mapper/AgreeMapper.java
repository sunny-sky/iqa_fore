package com.xjtu.iqa.mapper;

import com.xjtu.iqa.po.Agree;
import com.xjtu.iqa.po.AgreeExample;
import java.util.List;

public interface AgreeMapper {
    int deleteByPrimaryKey(String AGREEID);

    int insert(Agree record);

    int insertSelective(Agree record);

    List<Agree> selectByExample(AgreeExample example);

    Agree selectByPrimaryKey(String AGREEID);

    int updateByPrimaryKeySelective(Agree record);

    int updateByPrimaryKey(Agree record);
}