package com.xjtu.iqa.mapper;

import com.xjtu.iqa.po.CurrentEquipment;
import com.xjtu.iqa.po.CurrentEquipmentExample;
import java.util.List;

public interface CurrentEquipmentMapper {
    int deleteByPrimaryKey(String EQUIPMENTID);

    int insert(CurrentEquipment record);

    int insertSelective(CurrentEquipment record);

    List<CurrentEquipment> selectByExample(CurrentEquipmentExample example);

    CurrentEquipment selectByPrimaryKey(String EQUIPMENTID);

    int updateByPrimaryKeySelective(CurrentEquipment record);

    int updateByPrimaryKey(CurrentEquipment record);
}