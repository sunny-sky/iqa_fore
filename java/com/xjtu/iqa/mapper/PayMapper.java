package com.xjtu.iqa.mapper;

import java.util.List;

import com.xjtu.iqa.po.Pay;
import com.xjtu.iqa.po.PayExample;

public interface PayMapper {
	int deleteByPrimaryKey(String PAYID);

	int insert(Pay record);

	int insertSelective(Pay record);

	List<Pay> selectByExample(PayExample example);

	Pay selectByPrimaryKey(String PAYID);

	int updateByPrimaryKeySelective(Pay record);

	int updateByPrimaryKey(Pay record);

	// 查找关注的对象
	List<Pay> payList_Limit(String userid, int startNumber, int number);

	// 查找关注的对象_时间限制 ！！！
	List<Pay> payList_time_Limit(String userid, String time, int startNumber, int number);

	// 查找关注的对象_时间段限制
	List<Pay> payList_time_Limit_Time(String userid, String time, int startNumber, int number, String time2);

	// personal3_关注、被关注
	List<Pay> payList(String userid);

	// 查看被关注对象信息
	List<Pay> bepayList(String beuserid);

	// personal2_查看关注列表
	List<Pay> getpayList(String userId, String touserId);

	// 获取关注人数
	int payListSize(String userid);

	// 粉丝数
	int bepayListSize(String beuserid);

	// personal2_取消关注
	void deletePay(String userId, String touserId);
}