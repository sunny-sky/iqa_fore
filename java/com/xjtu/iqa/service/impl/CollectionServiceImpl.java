package com.xjtu.iqa.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xjtu.iqa.mapper.CollectionMapper;
import com.xjtu.iqa.mapper.CommunityAnswerMapper;
import com.xjtu.iqa.mapper.FaqAnswerMapper;
import com.xjtu.iqa.mapper.UserMapper;
import com.xjtu.iqa.service.CollectionService;

@Service
@Transactional
public class CollectionServiceImpl implements CollectionService {
	@Autowired
	UserMapper userMapper;
	@Autowired
	CommunityAnswerMapper communityAnswerMapper;
	@Autowired
	CollectionMapper collectionMapper;
	@Autowired
	FaqAnswerMapper faqAnswerMapper;
	
	@Override
	public void saveCollection(String username,String communityanswerId){
		String userId = userMapper.getUserIdByName(username);
		Date date=new Date();
	    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	    String time = format.format(date);
	    //判断是否为自己收藏
	    String communityAnswerUserId = communityAnswerMapper.getUserIdByAnswerId(communityanswerId);
	    int isnotice = 0;
	    if(userId.equals(communityAnswerUserId)){
	    	isnotice = 0;
	    }else {
			isnotice = 1;
		}
	    collectionMapper.saveCollection(UUID.randomUUID().toString(),communityanswerId,userId,time,isnotice);
	}
	
	@Override
	public void saveCollection2(String userId,String questionId){
		Date date=new Date();
	    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	    String time = format.format(date);
	    //判断是否为自己收藏
	    String faqAnswerUserId = faqAnswerMapper.findUserIdByFAQQuestionId(questionId);
	    int isnotice = 0;
	    if(userId.equals(faqAnswerUserId)){
	    	isnotice = 0;
	    	collectionMapper.saveCollection2(UUID.randomUUID().toString(),questionId,userId,time,isnotice);
	    }else {
			isnotice = 1;
			collectionMapper.saveCollection2(UUID.randomUUID().toString(),questionId,userId,time,isnotice);
		}
	}
}
