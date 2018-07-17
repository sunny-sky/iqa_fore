package com.xjtu.iqa.mapper;

import com.xjtu.iqa.po.BasicConfigure;
import com.xjtu.iqa.po.BasicConfigureExample;
import java.util.List;

public interface BasicConfigureMapper {
    int deleteByPrimaryKey(String BASICCONFIGURE);

    int insert(BasicConfigure record);

    int insertSelective(BasicConfigure record);

    List<BasicConfigure> selectByExample(BasicConfigureExample example);

    BasicConfigure selectByPrimaryKey(String BASICCONFIGURE);

    int updateByPrimaryKeySelective(BasicConfigure record);

    int updateByPrimaryKey(BasicConfigure record);
}