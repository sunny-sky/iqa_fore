package com.xjtu.iqa.mapper;

import java.util.List;

import com.xjtu.iqa.po.It;
import com.xjtu.iqa.po.ItExample;

public interface ItMapper {
	int deleteByPrimaryKey(String USERID);

	int insert(It record);

	int insertSelective(It record);

	List<It> selectByExample(ItExample example);

	It selectByPrimaryKey(String USERID);

	int updateByPrimaryKeySelective(It record);

	int updateByPrimaryKey(It record);

	// personal2_查看运维人员
	List<It> IT(String userid);
}