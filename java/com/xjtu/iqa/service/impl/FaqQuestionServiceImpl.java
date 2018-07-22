package com.xjtu.iqa.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xjtu.iqa.mapper.CommentMapper;
import com.xjtu.iqa.mapper.FaqAnswerMapper;
import com.xjtu.iqa.mapper.FaqClassifyMapper;
import com.xjtu.iqa.mapper.FaqQuestionMapper;
import com.xjtu.iqa.mapper.ShareMapper;
import com.xjtu.iqa.mapper.UserMapper;
import com.xjtu.iqa.po.FaqAnswer;
import com.xjtu.iqa.po.FaqQuestion;
import com.xjtu.iqa.po.Log;
import com.xjtu.iqa.po.User;
import com.xjtu.iqa.service.FaqQuestionService;
import com.xjtu.iqa.service.LogService;
import com.xjtu.iqa.vo.Faq2_faqContentView;
import com.xjtu.iqa.vo.Faq2_faqUserView;
import com.xjtu.iqa.vo.Faq3_faqAnswer;
import com.xjtu.iqa.vo.Faq3_faqContentView;
import com.xjtu.iqa.vo.Faq_CommendView;
import com.xjtu.iqa.vo.Faq_UserDynamics;

@Service
@Transactional
public class FaqQuestionServiceImpl implements FaqQuestionService {
	@Autowired
	FaqQuestionMapper faqQuestionMapper;
	@Autowired
	UserMapper userMapper;
	@Autowired
	ShareMapper shareMapper;
	@Autowired
	CommentMapper commentMapper;
	@Autowired
	LogService logService;
	@Autowired
	FaqClassifyMapper faqClassifyMapper;
	@Autowired
	FaqAnswerMapper faqAnswerMapper;

	/**
	 * FAQ页面_用户动态
	 */
	@Override
	public List<Faq_UserDynamics> userDynamics() {
		List<Faq_UserDynamics> userDynamics = new ArrayList<Faq_UserDynamics>();

		List<FaqQuestion> questionPersistences = faqQuestionMapper.faq_userDynamics(2, 5);

		for (FaqQuestion questionPersistence : questionPersistences) {
			Faq_UserDynamics faq_UserDynamics = new Faq_UserDynamics();

			faq_UserDynamics.setFaqId(questionPersistence.getFAQQUESTIONID());
			faq_UserDynamics.setFaqTitle(questionPersistence.getFAQTITLE());
			faq_UserDynamics.setTime(questionPersistence.getMODIFYTIME());

			if (questionPersistence.getMODIFYNUMBER().equals("1")) {
				faq_UserDynamics.setHow("发布");
			} else {
				faq_UserDynamics.setHow("修改");
			}

			// 根据用户Id获取用户信息
			User userPersistences = userMapper.getUserInfoById(questionPersistence.getUSERID());
			faq_UserDynamics.setUserId(userPersistences.getUSERID());
			faq_UserDynamics.setUserName(userPersistences.getUSERNAME());
			userDynamics.add(faq_UserDynamics);
		}
		return userDynamics;
	}

	// 有权限的角色分享社区问题
	@Override
	public void saveShare2(String userId, String faqquestionId) {
		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String time = format.format(date);
		shareMapper.saveShare2(UUID.randomUUID().toString(), userId, time, faqquestionId);
	}

	/**
	 * abstract:获取未登录用户推荐列表
	 */
	@Override
	public List<Faq_CommendView> faq_recommend_Limit(int faqstate, int startnum, int number) {
		// Faq_CommendView中信息不全、后续可补充 !!!分类图片
		List<Faq_CommendView> faq_CommendViews = new ArrayList<Faq_CommendView>();
		List<FaqQuestion> questionPersistences = faqQuestionMapper.faq_recommend_Limit(faqstate, startnum, number);
		for (FaqQuestion questionPersistence : questionPersistences) {
			Faq_CommendView faq_CommendView = new Faq_CommendView();
			faq_CommendView.setUserId(questionPersistence.getUSERID());
			faq_CommendView.setFAQQUESTIONID(questionPersistence.getFAQQUESTIONID());
			faq_CommendView.setFAQTITLE(questionPersistence.getFAQTITLE());
			faq_CommendView.setMODIFYTIME(questionPersistence.getMODIFYTIME());
			faq_CommendView.setFAQDESCRIPTION(questionPersistence.getFAQDESCRIPTION());
			faq_CommendView.setCOLLECTION(questionPersistence.getCOLLECTION());
			faq_CommendView.setSCAN(questionPersistence.getSCAN());

			int commentCount = commentMapper.commentInfo(questionPersistence.getFAQQUESTIONID());
			faq_CommendView.setCOMMENTSUM(commentCount);

			User userInfo = userMapper.getUserInfoById(questionPersistence.getUSERID());
			faq_CommendView.setFAQUSERNAME(userInfo.getUSERNAME());
			faq_CommendView.setFAQUSERIMAGE(userInfo.getAVATAR());
			faq_CommendViews.add(faq_CommendView);
		}
		return faq_CommendViews;
	}

	/**
	 * abstract:获取已登录用户推荐列表
	 * 
	 * @param j
	 * @param startnumber
	 */
	@Override
	public List<Faq_CommendView> user_recommend_Limit(String userid, int state, int startnum, int num) {
		// Faq_CommendView中信息不全、后续可补充
		List<Faq_CommendView> faq_CommendViews = new ArrayList<Faq_CommendView>();
		List<Log> logPersistences = logService.getLogs(userid);
		int i;
		for (i = 0; i < logPersistences.size(); i++) {
			String log = logPersistences.get(i).getURL();
			if (log.indexOf("/faq3.html?q=") != -1) {
				String a[] = log.split("=");
				String questionId = a[a.length - 1];
				String faq_classifyId = faqQuestionMapper.faq3_faqclassifyId(questionId);
				String parentId = faqClassifyMapper.faq_parentId(faq_classifyId);
				List<FaqQuestion> questionPersistences = faqQuestionMapper.questionView(parentId, state, startnum, num);
				for (FaqQuestion questionPersistence : questionPersistences) {
					Faq_CommendView faq_CommendView = new Faq_CommendView();
					faq_CommendView.setFAQQUESTIONID(questionPersistence.getFAQQUESTIONID());
					faq_CommendView.setFAQTITLE(questionPersistence.getFAQTITLE());
					faq_CommendView.setMODIFYTIME(questionPersistence.getMODIFYTIME());
					;
					faq_CommendView.setFAQDESCRIPTION(questionPersistence.getFAQDESCRIPTION());
					faq_CommendView.setCOLLECTION(questionPersistence.getCOLLECTION());
					faq_CommendView.setSCAN(questionPersistence.getSCAN());
					int commentCount = commentMapper.commentInfo(questionPersistence.getFAQQUESTIONID());
					faq_CommendView.setCOMMENTSUM(commentCount);
					User userInfo = userMapper.getUserInfoById(questionPersistence.getUSERID());
					faq_CommendView.setFAQUSERNAME(userInfo.getUSERNAME());
					faq_CommendView.setFAQUSERIMAGE(userInfo.getAVATAR());
					faq_CommendViews.add(faq_CommendView);
				}
				break;
			}
		}
		if (i == logPersistences.size()) {
			// zzl_用户首次登录时还没有log记录_依旧用faq_recommend_Limit推荐
			List<FaqQuestion> questionPersistences = faqQuestionMapper.faq_recommend_Limit(2, startnum, 5);
			for (FaqQuestion questionPersistence : questionPersistences) {
				Faq_CommendView faq_CommendView = new Faq_CommendView();
				faq_CommendView.setFAQQUESTIONID(questionPersistence.getFAQQUESTIONID());
				faq_CommendView.setFAQTITLE(questionPersistence.getFAQTITLE());
				faq_CommendView.setCOLLECTION(questionPersistence.getCOLLECTION());
				faq_CommendView.setSCAN(questionPersistence.getSCAN());
				faq_CommendView.setMODIFYTIME(questionPersistence.getMODIFYTIME());
				;
				faq_CommendView.setFAQDESCRIPTION(questionPersistence.getFAQDESCRIPTION());
				int commentCount = commentMapper.commentInfo(questionPersistence.getFAQQUESTIONID());
				faq_CommendView.setCOMMENTSUM(commentCount);
				User userInfo = userMapper.getUserInfoById(questionPersistence.getUSERID());
				faq_CommendView.setFAQUSERNAME(userInfo.getUSERNAME());
				faq_CommendView.setFAQUSERIMAGE(userInfo.getAVATAR());
				faq_CommendViews.add(faq_CommendView);
			}
		}
		return faq_CommendViews;
	}

	/**
	 * abstract:FAQ的增加
	 */
	@Override
	public void saveFAQ2(String userId, String title, String keywords, String subspecialCategoryId, String description,
			String faqcontent) {
		// 保存faq问题
		FaqQuestion questionPersistence = new FaqQuestion();
		String questionid = UUID.randomUUID().toString();
		questionPersistence.setFAQQUESTIONID(questionid);
		questionPersistence.setFAQTITLE(title);
		questionPersistence.setFAQDESCRIPTION(description);
		questionPersistence.setFAQCLASSIFYID(subspecialCategoryId);
		questionPersistence.setFAQKEYWORDS(keywords);
		questionPersistence.setCOLLECTION("0");
		questionPersistence.setSCAN("0");
		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String time = format.format(date);
		questionPersistence.setMODIFYTIME(time);
		questionPersistence.setMODIFYNUMBER("1");
		// 待审核为1
		questionPersistence.setFAQSTATE(1);
		questionPersistence.setUSERID(userId);
		faqQuestionMapper.insert(questionPersistence);

		FaqAnswer answerPersistence = new FaqAnswer();
		answerPersistence.setFAQANSWERID(UUID.randomUUID().toString());
		answerPersistence.setFAQQUESTIONID(questionid);
		answerPersistence.setFAQCONTENT(faqcontent);
		answerPersistence.setUSERID(userId);
		faqAnswerMapper.insert(answerPersistence);
	}

	/**
	 * abstract:推荐知识_根据收藏量推荐前4个
	 */
	@Override
	public List<Faq_CommendView> faqInfo(String faqParentId) {
		List<Faq_CommendView> faq_CommendViews = new ArrayList<Faq_CommendView>();
		List<FaqQuestion> questionPersistences = faqQuestionMapper.faqInfo_limit(faqParentId);
		for (FaqQuestion questionPersistence : questionPersistences) {
			Faq_CommendView faq_CommendView = new Faq_CommendView();
			faq_CommendView.setFAQQUESTIONID(questionPersistence.getFAQQUESTIONID());
			faq_CommendView.setFAQTITLE(questionPersistence.getFAQTITLE());
			faq_CommendView.setFAQDESCRIPTION(questionPersistence.getFAQDESCRIPTION());
			faq_CommendViews.add(faq_CommendView);
		}
		return faq_CommendViews;
	}

	/**
	 * faq2_知识列表
	 */
	@Override
	public List<Faq2_faqContentView> faqlist_faq2(String ClassifyId, int pageNow) {
		List<Faq2_faqContentView> faq2Views = new ArrayList<Faq2_faqContentView>();
		// 每次获取一页5条信息
		List<FaqQuestion> questionPersistences = faqQuestionMapper.faq2_faqlist(ClassifyId, 2, pageNow, 5);
		for (FaqQuestion questionPersistence : questionPersistences) {
			List<Faq2_faqUserView> user_faq2Views = new ArrayList<Faq2_faqUserView>();
			String userId = faqQuestionMapper.findUserIdByQuestionId(questionPersistence.getFAQQUESTIONID());
			User userPersistences = userMapper.getUserInfoById(userId);

			Faq2_faqUserView user_faq2View = new Faq2_faqUserView(userPersistences);
			user_faq2Views.add(user_faq2View);
			
			Faq2_faqContentView faq2View = new Faq2_faqContentView(questionPersistence);
			faq2View.setuList(user_faq2Views);
			int commentCount = commentMapper.commentInfo(questionPersistence.getFAQQUESTIONID());
			faq2View.setCommentNumber(commentCount);
			faq2Views.add(faq2View);
		}
		return faq2Views;
	}

	/**
	 * faq3_知识内容
	 */
	@Override
	public List<Faq3_faqContentView> faq3_faqcontent(String QuestionId) {
		List<Faq3_faqContentView> faq3Views = new ArrayList<Faq3_faqContentView>();
		List<FaqQuestion> faqPersistences = faqQuestionMapper.faq3_faqcontent(QuestionId, 2);
		for (FaqQuestion faqPersistence : faqPersistences) {
			List<Faq2_faqUserView> user_faq2Views = new ArrayList<Faq2_faqUserView>();
			List<Faq3_faqAnswer> faq3_faqAnswers = new ArrayList<Faq3_faqAnswer>();
			String userId = faqQuestionMapper.findUserIdByQuestionId(faqPersistence.getFAQQUESTIONID());
			User userPersistences = userMapper.getUserInfoById(userId);
			List<FaqAnswer> answerPersistences = faqAnswerMapper.getAnswerByQuestionId(QuestionId);

			Faq2_faqUserView user_faq2View = new Faq2_faqUserView(userPersistences);
			user_faq2Views.add(user_faq2View);
		
			for (FaqAnswer answerPersistence : answerPersistences) {
				Faq3_faqAnswer faq3_faqAnswer = new Faq3_faqAnswer(answerPersistence);
				faq3_faqAnswers.add(faq3_faqAnswer);
			}
			Faq3_faqContentView faq3View = new Faq3_faqContentView(faqPersistence);
			faq3View.setQuestionId(QuestionId);
			faq3View.setuList(user_faq2Views);
			faq3View.setFaqAnswers(faq3_faqAnswers);
			faq3Views.add(faq3View);
		}
		return faq3Views;
	}

	/**
	 * faq浏览量+1
	 */
	@Override
	public void updateFAQScan(String questionId) {
		String scan = faqQuestionMapper.getFaqScan(questionId);
		int faqScan = Integer.parseInt(scan);
		faqScan++;
		faqQuestionMapper.updateFAQScan(questionId, Integer.toString(faqScan));
	}

	/**
	 * faq3_ajax_分享的增加
	 */
	@Override
	public void saveShare(String userId, String faqquestionId) {
		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String time = format.format(date);
		shareMapper.saveShare(UUID.randomUUID().toString(), userId, time, faqquestionId);
	}
}
