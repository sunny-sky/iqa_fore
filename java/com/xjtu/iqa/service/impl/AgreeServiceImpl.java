package com.xjtu.iqa.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xjtu.iqa.mapper.AgreeMapper;
import com.xjtu.iqa.mapper.CommunityAnswerMapper;
import com.xjtu.iqa.mapper.UserMapper;
import com.xjtu.iqa.service.AgreeService;

@Service
@Transactional
public class AgreeServiceImpl implements AgreeService {
	@Autowired
	UserMapper userMapper;
	@Autowired
	CommunityAnswerMapper communityAnswerMapper;
	@Autowired
	AgreeMapper agreeMapper;

	@Override
	public void saveAgree(String username,String communityanswerId){
		String userId = userMapper.getUserIdByName(username);	
		Date date = new Date();
	    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	    String time = format.format(date);
	    //查找问题答案用户Id
	    String toUserId = communityAnswerMapper.getUserIdByAnswerId(communityanswerId);
	    
	    //判断这个赞是否为自己的
	    int isnotice = 0;
	    if (userId.equals(toUserId)) {
			isnotice = 0;
		}else {
			isnotice = 1;
		}
	    agreeMapper.saveAgree(UUID.randomUUID().toString(),communityanswerId,userId,toUserId,time,isnotice);
	}
}
