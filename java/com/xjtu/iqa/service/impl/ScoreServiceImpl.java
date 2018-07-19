package com.xjtu.iqa.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xjtu.iqa.mapper.ScoreMapper;
import com.xjtu.iqa.po.Score;
import com.xjtu.iqa.service.ScoreService;
@Service
@Transactional
public class ScoreServiceImpl implements ScoreService{
	@Autowired
	ScoreMapper scoreMapper;
	/**
	 * zyq_faq3_ajax_评分
	 */
	@Override
	public void saveFAQscore(String FAQquestionId,String userId,float score){
    	Date date=new Date();
    	SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    	String time = format.format(date);   	
    	Score scorePersistence = new Score();
    	scorePersistence.setSCOREID(UUID.randomUUID().toString());
    	scorePersistence.setUSERID(userId);
    	scorePersistence.setFAQQUESTIONID(FAQquestionId);
    	scorePersistence.setSCORE(score); 	
    	scorePersistence.setTIME(time);
    	scoreMapper.insert(scorePersistence);
	}
}
