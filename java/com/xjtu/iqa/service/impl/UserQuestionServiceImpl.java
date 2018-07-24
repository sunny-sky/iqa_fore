package com.xjtu.iqa.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xjtu.iqa.mapper.FaqQuestionMapper;
import com.xjtu.iqa.mapper.RobotAnswerMapper;
import com.xjtu.iqa.mapper.UserMapper;
import com.xjtu.iqa.mapper.UserQuestionMapper;
import com.xjtu.iqa.po.RobotAnswer;
import com.xjtu.iqa.po.UserQuestion;
import com.xjtu.iqa.service.UserQuestionService;

@Service
@Transactional
public class UserQuestionServiceImpl implements UserQuestionService {
	@Autowired
	FaqQuestionMapper faqQuestionMapper;
	@Autowired
	UserMapper userMapper;
	@Autowired
	UserQuestionMapper userQuestionMapper;
	@Autowired
	RobotAnswerMapper robotAnswerMapper;
	/**
	 * abstract:记录用户提问记录
	 */
	@Override
	public void addUserQuestion(String questionId,String username, String comment, String from) {
		UserQuestion userQuestionPersistence = new UserQuestion();
		userQuestionPersistence.setUSERQUESTIONID(questionId);
		userQuestionPersistence.setQUESTIONTITLE(comment);
		Date date=new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = format.format(date);
        userQuestionPersistence.setQUESTIONTIME(time);        
        int isFaq;
        if (from.equals("fromFaq")) {
        	isFaq = 1;
		}else {
			boolean qList = faqQuestionMapper.getFaqQuestion(comment);		        
			    //isFaq = 0;不是faq
			if (qList== false) {
				isFaq = 0;
			}else {
				isFaq = 1;
			}
		}
        userQuestionPersistence.setISFAQ(isFaq);     
        String userId;
		if(username == null){
			userId = "00000000-0000-0000-0000-000000000000";
		}else {			
			userId = userMapper.getUserIdByName(username);
		}
		userQuestionPersistence.setUSERID(userId);
		//添加用户问题记录
		userQuestionMapper.insert(userQuestionPersistence);
	}

	/**
	 * 用户满意度
	 */
	@Override
	public void addUserSaticfaction(String questionId, String answerId, int saticfaction) {
		RobotAnswer robotAnswerPersistence = new RobotAnswer();
		robotAnswerPersistence.setROBOTANSWERID(UUID.randomUUID().toString());
		robotAnswerPersistence.setUSERQUESTIONID(questionId);
		robotAnswerPersistence.setFAQANSWERID(answerId);
		robotAnswerPersistence.setSATICFACTION(saticfaction);
		robotAnswerPersistence.setQUESTIONSTATE(0);
		robotAnswerMapper.insert(robotAnswerPersistence);
	}
}
