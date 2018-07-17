package com.xjtu.iqa.mapper;

import com.xjtu.iqa.po.Collection;
import com.xjtu.iqa.po.CollectionExample;
import java.util.List;

public interface CollectionMapper {
    int deleteByPrimaryKey(String COLLECTIONID);

    int insert(Collection record);

    int insertSelective(Collection record);

    List<Collection> selectByExample(CollectionExample example);

    Collection selectByPrimaryKey(String COLLECTIONID);

    int updateByPrimaryKeySelective(Collection record);

    int updateByPrimaryKey(Collection record);
}