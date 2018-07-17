package com.xjtu.iqa.mapper;

import com.xjtu.iqa.po.CurrentConfigure;
import com.xjtu.iqa.po.CurrentConfigureExample;
import java.util.List;

public interface CurrentConfigureMapper {
    int deleteByPrimaryKey(String CURRENTCONFIGUREID);

    int insert(CurrentConfigure record);

    int insertSelective(CurrentConfigure record);

    List<CurrentConfigure> selectByExample(CurrentConfigureExample example);

    CurrentConfigure selectByPrimaryKey(String CURRENTCONFIGUREID);

    int updateByPrimaryKeySelective(CurrentConfigure record);

    int updateByPrimaryKey(CurrentConfigure record);
}