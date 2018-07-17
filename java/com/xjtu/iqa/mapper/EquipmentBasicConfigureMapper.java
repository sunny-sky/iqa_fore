package com.xjtu.iqa.mapper;

import com.xjtu.iqa.po.EquipmentBasicConfigure;
import com.xjtu.iqa.po.EquipmentBasicConfigureExample;
import java.util.List;

public interface EquipmentBasicConfigureMapper {
    int deleteByPrimaryKey(String EQUIPMENTBASICCONFIGUREID);

    int insert(EquipmentBasicConfigure record);

    int insertSelective(EquipmentBasicConfigure record);

    List<EquipmentBasicConfigure> selectByExample(EquipmentBasicConfigureExample example);

    EquipmentBasicConfigure selectByPrimaryKey(String EQUIPMENTBASICCONFIGUREID);

    int updateByPrimaryKeySelective(EquipmentBasicConfigure record);

    int updateByPrimaryKey(EquipmentBasicConfigure record);
}