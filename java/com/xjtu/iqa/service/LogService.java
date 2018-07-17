package com.xjtu.iqa.service;

import java.util.List;

import com.xjtu.iqa.po.Log;

public interface LogService {
	/**
	 * 保存日志
	 */
	void insertLog(Log myLog);
	
	/**
	 * abstract:获取用户日志
	 */
	List<Log> getLogs(String userid);
}
