package com.xjtu.iqa.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.xjtu.iqa.NLP.Segmentation_ansj;
import com.xjtu.iqa.mapper.FaqAnswerMapper;
import com.xjtu.iqa.mapper.FaqQuestionMapper;
import com.xjtu.iqa.mapper.RobotMapper;
import com.xjtu.iqa.po.FaqAnswer;
import com.xjtu.iqa.po.FaqAnswerExample;
import com.xjtu.iqa.po.FaqQuestion;
import com.xjtu.iqa.po.FaqQuestionExample;
import com.xjtu.iqa.po.Robot;
import com.xjtu.iqa.service.FaqQuestionService;
import com.xjtu.iqa.service.RobotService;
import com.xjtu.iqa.vo.robot_Chat;

@Controller
@Transactional
public class RobotServiceImpl implements RobotService {
	@Autowired
	FaqQuestionService faqQuestionService;
	@Autowired
	FaqQuestionMapper faqQuestionMapper;
	@Autowired
	FaqAnswerMapper faqAnswerMapper;
	@Autowired
	RobotMapper robotMapper;
	/**
	 * robot_ajax获取机器人信息
	 */
	@Override
	public List<Robot> robotinfo(){
		List<Robot> list = robotMapper.robotinfo();
		return list;
	}
	
	/**
	 * robot_ajax_和机器人聊天
	 */
	@Override
	public List<robot_Chat> getRobotAnswer(String comment) throws Exception {
		List<robot_Chat> robot_Chats = Segmentation_ansj.robot_Chats(comment);	
		System.out.println("robot_Chats的大小："+robot_Chats.size());
		List<robot_Chat> list = new ArrayList<robot_Chat>();
		if (robot_Chats.size()==0) {
			
		}else if (robot_Chats.size()==1) {
			robot_Chat robot_Chat = new robot_Chat();
			System.out.println("机器人提问问题号："+robot_Chats.get(0).getQuestionId());
			robot_Chat.setQuestionId(robot_Chats.get(0).getQuestionId());
			List<FaqAnswer> answerPersistences = faqAnswerMapper.getAnswerByQuestionId(robot_Chats.get(0).getQuestionId());
			robot_Chat.setAnswerId(answerPersistences.get(0).getFAQANSWERID());
			robot_Chat.setAnswer(answerPersistences.get(0).getFAQCONTENT());
			list.add(robot_Chat);
		}else if (robot_Chats.size()>6) {
			robot_Chats = ListSort(robot_Chats);
			for(int i=0;i<6;i++){
				if (i==0) {
					robot_Chat robot_Chat = new robot_Chat();
					robot_Chat.setQuestionId(robot_Chats.get(0).getQuestionId());
					List<FaqAnswer> answerPersistences = faqAnswerMapper.getAnswerByQuestionId(robot_Chats.get(0).getQuestionId());
					robot_Chat.setAnswerId(answerPersistences.get(0).getFAQANSWERID());
					robot_Chat.setAnswer(answerPersistences.get(0).getFAQCONTENT());
					list.add(robot_Chat);
				}else {
					//其余内容做推送
					robot_Chat robot_Chat = new robot_Chat();
					robot_Chat.setQuestionId(robot_Chats.get(i).getQuestionId());
					System.out.println("问题id是："+robot_Chats.get(i).getQuestionId());
					List<FaqQuestion> questionPersistences = faqQuestionMapper.faq3_faqcontent(robot_Chats.get(i).getQuestionId(),2);
					
					robot_Chat.setQuestion(questionPersistences.get(0).getFAQTITLE());
					System.out.println("questionPersistences.get(0).getFAQTITLE():"+questionPersistences.get(0).getFAQTITLE());
					list.add(robot_Chat);
				}
				System.out.println("循环次数："+i);
			}
		}else {
			robot_Chats = ListSort(robot_Chats);
			for (int i = 0; i <robot_Chats.size() ; i++) {
				if (i==0) {
					robot_Chat robot_Chat = new robot_Chat();
					robot_Chat.setQuestionId(robot_Chats.get(0).getQuestionId());
					List<FaqAnswer> answerPersistences = faqAnswerMapper.getAnswerByQuestionId(robot_Chats.get(0).getQuestionId());
					robot_Chat.setAnswer(answerPersistences.get(0).getFAQCONTENT());
					list.add(robot_Chat);
				}else {
					robot_Chat robot_Chat = new robot_Chat();
					robot_Chat.setQuestionId(robot_Chats.get(i).getQuestionId());
					List<FaqQuestion> questionPersistences = faqQuestionMapper.faq3_faqcontent(robot_Chats.get(i).getQuestionId(),2);
					robot_Chat.setQuestion(questionPersistences.get(0).getFAQTITLE());
					list.add(robot_Chat);
				}
			}
		}
		return list;
	}
	
	//对按余弦相似度进行排序
	private List<robot_Chat> ListSort(List<robot_Chat> list){
		Collections.sort(list,new Comparator<robot_Chat>() {
			@Override
			public int compare(robot_Chat o1, robot_Chat o2) {
				double number1 = o1.getValue();
				double number2 = o2.getValue();
				if (number1<number2) {
					return 1;
				}else if (number1>number2) {
					return -1;
				}else {
					return 0;
				}
			}
		});
		return list;
	}
	
	@Override
	public List<robot_Chat> getRobotAnswerEasy(String comment) throws Exception{
		FaqQuestionExample example = new FaqQuestionExample();
		example.createCriteria().andFAQKEYWORDSLike(comment);
//		example.setOrderByClause("FAQQUESTIONID desc");
		List<FaqQuestion> faqs = faqQuestionMapper.selectByExample(example);
		List<robot_Chat> robotChats = new ArrayList<robot_Chat>();
		if(0 != faqs.size()){

			String fqid = faqs.get(0).getFAQQUESTIONID();
			robotChats.get(0).setQuestionId(fqid);
			robotChats.get(0).setQuestion(faqs.get(0).getFAQTITLE());
			
			
			FaqAnswerExample faexample = new FaqAnswerExample();
			faexample.createCriteria().andFAQQUESTIONIDEqualTo(fqid);
			faexample.setOrderByClause("FAQANSWERID desc");
			List<FaqAnswer> fas = faqAnswerMapper.selectByExample(faexample);
			
			robotChats.get(0).setAnswerId(fas.get(0).getFAQANSWERID());
			robotChats.get(0).setAnswer(fas.get(0).getFAQCONTENT());
		}
//		}else{
//			robotChats.setAnswer("未找到答案");
//			robotChats.setAnswerId("00000000-0000-0000-0000-000000000000");
//			robotChats.setQuestionId("0");
//			robotChats.setQuestion("未找到类似问题");
//		}
		return robotChats;
	}
}
