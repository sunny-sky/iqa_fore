package com.xjtu.iqa.mapper;

import com.xjtu.iqa.po.Computer;
import com.xjtu.iqa.po.ComputerExample;
import java.util.List;

public interface ComputerMapper {
    int deleteByPrimaryKey(String EQUIPMENTID);

    int insert(Computer record);

    int insertSelective(Computer record);

    List<Computer> selectByExample(ComputerExample example);

    Computer selectByPrimaryKey(String EQUIPMENTID);

    int updateByPrimaryKeySelective(Computer record);

    int updateByPrimaryKey(Computer record);
}