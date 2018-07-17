package com.xjtu.iqa.mapper;

import com.xjtu.iqa.po.RolePermission;
import com.xjtu.iqa.po.RolePermissionExample;
import java.util.List;

public interface RolePermissionMapper {
    int deleteByPrimaryKey(String ROLEPERMISSIONID);

    int insert(RolePermission record);

    int insertSelective(RolePermission record);

    List<RolePermission> selectByExample(RolePermissionExample example);

    RolePermission selectByPrimaryKey(String ROLEPERMISSIONID);

    int updateByPrimaryKeySelective(RolePermission record);

    int updateByPrimaryKey(RolePermission record);
}