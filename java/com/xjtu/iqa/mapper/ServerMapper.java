package com.xjtu.iqa.mapper;

import com.xjtu.iqa.po.Server;
import com.xjtu.iqa.po.ServerExample;
import java.util.List;

public interface ServerMapper {
    int deleteByPrimaryKey(String EQUIPMENTID);

    int insert(Server record);

    int insertSelective(Server record);

    List<Server> selectByExample(ServerExample example);

    Server selectByPrimaryKey(String EQUIPMENTID);

    int updateByPrimaryKeySelective(Server record);

    int updateByPrimaryKey(Server record);
}