package com.xjtu.iqa.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xjtu.iqa.mapper.LogMapper;
import com.xjtu.iqa.po.Log;
import com.xjtu.iqa.po.LogExample;
import com.xjtu.iqa.service.LogService;

@Service
@Transactional
public class LogServiceImpl implements LogService{
	@Autowired
	LogMapper logMapper;
	/**
	 * 保存日志
	 */
	@Override
	public void insertLog(Log myLog) {
		logMapper.insert(myLog);		
	}
	
	/**
	 * abstract:获取用户日志
	 */
	@Override
	public List<Log> getLogs(String userid) {
		LogExample example =new LogExample();
        example.createCriteria().andUSERIDEqualTo(userid);
        example.setOrderByClause("id desc");  
        List<Log> logs =logMapper.selectByExample(example);
		
		return logs;
	}
}
