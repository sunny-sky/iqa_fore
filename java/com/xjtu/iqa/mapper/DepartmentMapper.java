package com.xjtu.iqa.mapper;

import com.xjtu.iqa.po.Department;
import com.xjtu.iqa.po.DepartmentExample;
import java.util.List;

public interface DepartmentMapper {
    int deleteByPrimaryKey(String DEPARTMENTID);

    int insert(Department record);

    int insertSelective(Department record);

    List<Department> selectByExample(DepartmentExample example);

    Department selectByPrimaryKey(String DEPARTMENTID);

    int updateByPrimaryKeySelective(Department record);

    int updateByPrimaryKey(Department record);
}