package com.xjtu.iqa.mapper;

import com.xjtu.iqa.po.It;
import com.xjtu.iqa.po.ItExample;
import java.util.List;

public interface ItMapper {
    int deleteByPrimaryKey(String USERID);

    int insert(It record);

    int insertSelective(It record);

    List<It> selectByExample(ItExample example);

    It selectByPrimaryKey(String USERID);

    int updateByPrimaryKeySelective(It record);

    int updateByPrimaryKey(It record);
}