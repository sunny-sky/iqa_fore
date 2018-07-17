package com.xjtu.iqa.mapper;

import com.xjtu.iqa.po.DataDictionary;
import com.xjtu.iqa.po.DataDictionaryExample;
import java.util.List;

public interface DataDictionaryMapper {
    int deleteByPrimaryKey(String DATADICTIONARYID);

    int insert(DataDictionary record);

    int insertSelective(DataDictionary record);

    List<DataDictionary> selectByExample(DataDictionaryExample example);

    DataDictionary selectByPrimaryKey(String DATADICTIONARYID);

    int updateByPrimaryKeySelective(DataDictionary record);

    int updateByPrimaryKey(DataDictionary record);
}