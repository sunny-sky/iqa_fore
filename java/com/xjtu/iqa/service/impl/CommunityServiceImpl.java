package com.xjtu.iqa.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.xjtu.iqa.mapper.AgreeMapper;
import com.xjtu.iqa.mapper.CollectionMapper;
import com.xjtu.iqa.mapper.CommentMapper;
import com.xjtu.iqa.mapper.CommunityAnswerMapper;
import com.xjtu.iqa.mapper.CommunityQuestionMapper;
import com.xjtu.iqa.mapper.FaqClassifyMapper;
import com.xjtu.iqa.mapper.UserMapper;
import com.xjtu.iqa.po.Comment;
import com.xjtu.iqa.po.CommunityAnswer;
import com.xjtu.iqa.po.CommunityQuestion;
import com.xjtu.iqa.po.User;
import com.xjtu.iqa.service.CommunityService;
import com.xjtu.iqa.vo.Question2_CommunityReplayView;
import com.xjtu.iqa.vo.Question2_CommunityView;
import com.xjtu.iqa.vo.Question_CommunityView;

@Controller
@Transactional
public class CommunityServiceImpl implements CommunityService {
	@Autowired
	CommunityQuestionMapper communityQuestionMapper;
	@Autowired
	CommunityAnswerMapper communityAnswerMapper;
	@Autowired
	FaqClassifyMapper faqClassifyMapper;
	@Autowired
	UserMapper userMapper;
	@Autowired
	AgreeMapper agreeMapper;
	@Autowired
	CollectionMapper collectionMapper;
	@Autowired
	CommentMapper commentMapper;

	/*
	 * zyq_question_问题展示 从 startnumber 开始加载 type类型【待解决、已解决、全部】的
	 * classifyname【具体知识库分类】的 5条记录
	 */
	@Override
	public List<Question_CommunityView> Question_CommunityView(String username, int startnumber, String type,
			String classifyname) {
		List<Question_CommunityView> question_CommunityViews = new ArrayList<Question_CommunityView>();
		if (classifyname.equals("all")) {
			if (type.equals("all")) {// 展示全部问题
				// 时间倒序显示最新5条社区问题
				List<CommunityQuestion> communityQuestionPersistences = communityQuestionMapper
						.question_getCommunity_isanswer(startnumber);

				for (CommunityQuestion communityQuestionPersistence : communityQuestionPersistences) {
					// 获取问题评论总数
					List<CommunityAnswer> communityAnswerPersistences = communityAnswerMapper
							.question_CommunityAnswer(communityQuestionPersistence.getCOMMUNITYQUESTIONID());
					String communityNumber = Integer.toString(communityAnswerPersistences.size());

					// 判断是否有最佳答案
					List<CommunityAnswer> list = communityAnswerMapper
							.question_iscurrentAnswer(communityQuestionPersistence.getCOMMUNITYQUESTIONID(), 1);
					if (list.size() == 0) {
						String classifyName = faqClassifyMapper
								.getClassifyNameById(communityQuestionPersistence.getCLASSIFYID());
						// zzl_无最佳答案_基本信息
						Question_CommunityView question_CommunityView = new Question_CommunityView();
						// 社区问题基本信息
						communityBasicInfo(communityQuestionPersistence, communityNumber, classifyName,
								question_CommunityView);
						question_CommunityViews.add(question_CommunityView);
					} else {
						// zzl_有最佳答案_基本信息
						String classifyName = faqClassifyMapper
								.getClassifyNameById(communityQuestionPersistence.getCLASSIFYID());
						Question_CommunityView question_CommunityView = new Question_CommunityView();
						// 社区问题基本信息
						communityBasicInfo(communityQuestionPersistence, communityNumber, classifyName,
								question_CommunityView);

						// zzl_最佳答案专有显示
						question_CommunityView.setAnswer(list.get(0).getCONTENT());
						List<CommunityAnswer> list2 = communityAnswerMapper
								.question_iscurrentAnswer(communityQuestionPersistence.getCOMMUNITYQUESTIONID(), 1);
						int agreeCount = agreeMapper.getAgreeSizeByAnswerId(list2.get(0).getCOMMUNITYANSWERID());
						question_CommunityView.setLikesNumber(Integer.toString(agreeCount));

						// 最佳答案用户信息
						List<User> userPersistences = userMapper.getUserInfoById(list.get(0).getUSERID());
						userInfo(question_CommunityView, userPersistences);

						// zzl_用户点评
						int answerCount = communityAnswerMapper.answerSizeByUserId(userPersistences.get(0).getUSERID());
						question_CommunityView.setTotalCommunityNumber(Integer.toString(answerCount));

						// zzl_用户点赞
						int likeCount = agreeMapper.getAgreebyUserId(userPersistences.get(0).getUSERID());
						question_CommunityView.setTotalLikesNumber(Integer.toString(likeCount));
						if (username != null) {
							String agreeId = agreeMapper.getAgree(username,
									communityAnswerPersistences.get(0).getCOMMUNITYANSWERID());
							// 判断是否点赞
							if (agreeId == null) {
								question_CommunityView.setIsLike("0");
							} else {
								question_CommunityView.setIsLike("1");
							}
						}
						question_CommunityViews.add(question_CommunityView);
					}
				}
			} else if (type.equals("2")) {// 展示未有答案的问题
				List<CommunityQuestion> communityQuestionPersistences = communityQuestionMapper
						.question_getCommunity2_isanswer(startnumber, 0);
				for (CommunityQuestion communityQuestionPersistence : communityQuestionPersistences) {
					// 获取评论数
					List<CommunityAnswer> communityAnswerPersistences = communityAnswerMapper
							.question_CommunityAnswer(communityQuestionPersistence.getCOMMUNITYQUESTIONID());
					String communityNumber = Integer.toString(communityAnswerPersistences.size());
					String classifyName = faqClassifyMapper
							.getClassifyNameById(communityQuestionPersistence.getCLASSIFYID());

					Question_CommunityView question_CommunityView = new Question_CommunityView();
					// 社区问题基本信息
					communityBasicInfo(communityQuestionPersistence, communityNumber, classifyName,
							question_CommunityView);

					question_CommunityViews.add(question_CommunityView);

				}
			} else if (type.equals("1")) {// 展示已解决的问题
				List<CommunityQuestion> communityQuestionPersistences = communityQuestionMapper
						.question_getCommunity2_isanswer(startnumber, 1);
				for (CommunityQuestion communityQuestionPersistence : communityQuestionPersistences) {
					// 获取评论数
					List<CommunityAnswer> communityAnswerPersistences = communityAnswerMapper
							.question_CommunityAnswer(communityQuestionPersistence.getCOMMUNITYQUESTIONID());
					String communityNumber = Integer.toString(communityAnswerPersistences.size());
					// 获取最佳答案信息
					List<CommunityAnswer> list = communityAnswerMapper
							.question_iscurrentAnswer(communityQuestionPersistence.getCOMMUNITYQUESTIONID(), 1);
					String classifyName = faqClassifyMapper
							.getClassifyNameById(communityQuestionPersistence.getCLASSIFYID());

					Question_CommunityView question_CommunityView = new Question_CommunityView();
					// 社区问题基本信息
					communityBasicInfo(communityQuestionPersistence, communityNumber, classifyName,
							question_CommunityView);
					if (list.size() != 0) {
						question_CommunityView.setAnswer(list.get(0).getCONTENT());

						// zzl_点赞
						List<CommunityAnswer> list2 = communityAnswerMapper
								.question_iscurrentAnswer(communityQuestionPersistence.getCOMMUNITYQUESTIONID(), 1);
						if (list2.size() != 0) {
							int agreeCount = agreeMapper.getAgreeSizeByAnswerId(list2.get(0).getCOMMUNITYANSWERID());
							question_CommunityView.setLikesNumber(Integer.toString(agreeCount));
						}

						// 获取用户信息
						List<User> userPersistences = userMapper.getUserInfoById(list.get(0).getUSERID());
						userInfo(question_CommunityView, userPersistences);

						// zzl_用户点评
						int answerCount = communityAnswerMapper.answerSizeByUserId(userPersistences.get(0).getUSERID());
						question_CommunityView.setTotalCommunityNumber(Integer.toString(answerCount));

						// zzl_用户点赞
						int likeCount = agreeMapper.getAgreebyUserId(userPersistences.get(0).getUSERID());
						question_CommunityView.setTotalLikesNumber(Integer.toString(likeCount));
					}
					if (username != null) {
						String agreeId = agreeMapper.getAgree(username,
								communityAnswerPersistences.get(0).getCOMMUNITYANSWERID());
						// 判断是否点赞
						if (agreeId == null) {
							question_CommunityView.setIsLike("0");
						} else {
							question_CommunityView.setIsLike("1");
						}
					}
					question_CommunityViews.add(question_CommunityView);
				}
			}
		} else {
			// zzl_分类显示
			// List<ClassifyPersistence> classifyPersistences =
			// faqClassifyMapper.spider_ClassifyListByName(classifyname, "0");
			String classifyId = faqClassifyMapper.getClassifyIdByName(classifyname, "0");
			if (type.equals("all")) {// 展示全部问题
				List<CommunityQuestion> communityQuestionPersistences = communityQuestionMapper
						.question_getCommunity(classifyId);
				for (CommunityQuestion communityQuestionPersistence : communityQuestionPersistences) {
					// 获取评论数
					List<CommunityAnswer> communityAnswerPersistences = communityAnswerMapper
							.question_CommunityAnswer(communityQuestionPersistence.getCOMMUNITYQUESTIONID());
					String communityNumber = Integer.toString(communityAnswerPersistences.size());

					// 判断是否有最佳答案
					List<CommunityAnswer> list = communityAnswerMapper
							.question_iscurrentAnswer(communityQuestionPersistence.getCOMMUNITYQUESTIONID(), 1);
					Question_CommunityView question_CommunityView = new Question_CommunityView();
					String classifyName = classifyname;
					// 社区问题基本信息
					communityBasicInfo(communityQuestionPersistence, communityNumber, classifyName,
							question_CommunityView);
					if (list.size() != 0) {
						question_CommunityView.setAnswer(list.get(0).getCONTENT());

						// 获取用户信息
						List<User> userPersistences = userMapper.getUserInfoById(list.get(0).getUSERID());
						userInfo(question_CommunityView, userPersistences);

						// zzl_用户点评
						int answerCount = communityAnswerMapper.answerSizeByUserId(userPersistences.get(0).getUSERID());
						question_CommunityView.setTotalCommunityNumber(Integer.toString(answerCount));

						// zzl_用户点赞
						int likeCount = agreeMapper.getAgreebyUserId(userPersistences.get(0).getUSERID());
						question_CommunityView.setTotalLikesNumber(Integer.toString(likeCount));

						// zzl_点赞
						List<CommunityAnswer> list2 = communityAnswerMapper
								.question_iscurrentAnswer(communityQuestionPersistence.getCOMMUNITYQUESTIONID(), 1);
						int agreeCount = agreeMapper.getAgreeSizeByAnswerId(list2.get(0).getCOMMUNITYANSWERID());
						question_CommunityView.setLikesNumber(Integer.toString(agreeCount));

						if (username != null) {
							String agreeId = agreeMapper.getAgree(username,
									communityAnswerPersistences.get(0).getCOMMUNITYANSWERID());
							// 判断是否点赞
							if (agreeId == null) {
								question_CommunityView.setIsLike("0");
							} else {
								question_CommunityView.setIsLike("1");
							}
						}
					}
					question_CommunityViews.add(question_CommunityView);
				}
			} else if (type.equals("2")) {// 展示未有答案的问题
				List<CommunityQuestion> communityQuestionPersistences = communityQuestionMapper
						.question_getCommunity2(classifyId, 0);
				for (CommunityQuestion communityQuestionPersistence : communityQuestionPersistences) {
					// 获取评论数
					List<CommunityAnswer> communityAnswerPersistences = communityAnswerMapper
							.question_CommunityAnswer(communityQuestionPersistence.getCOMMUNITYQUESTIONID());
					String communityNumber = Integer.toString(communityAnswerPersistences.size());
					String classifyName = classifyname;

					Question_CommunityView question_CommunityView = new Question_CommunityView();
					// 社区问题基本信息
					communityBasicInfo(communityQuestionPersistence, communityNumber, classifyName,
							question_CommunityView);
					question_CommunityViews.add(question_CommunityView);

				}
			} else if (type.equals("1")) {// 展示已回答的问题
				List<CommunityQuestion> communityQuestionPersistences = communityQuestionMapper
						.question_getCommunity2(classifyId, 1);
				for (CommunityQuestion communityQuestionPersistence : communityQuestionPersistences) {
					// 获取最佳答案信息
					List<CommunityAnswer> list = communityAnswerMapper
							.question_iscurrentAnswer(communityQuestionPersistence.getCOMMUNITYQUESTIONID(), 1);

					// 获取评论数
					List<CommunityAnswer> communityAnswerPersistences = communityAnswerMapper
							.question_CommunityAnswer(communityQuestionPersistence.getCOMMUNITYQUESTIONID());
					String communityNumber = Integer.toString(communityAnswerPersistences.size());
					String classifyName = classifyname;
					// zzl_有最佳答案
					Question_CommunityView question_CommunityView = new Question_CommunityView();
					// 社区问题基本信息
					communityBasicInfo(communityQuestionPersistence, communityNumber, classifyName,
							question_CommunityView);

					question_CommunityView.setAnswer(list.get(0).getCONTENT());
					// zzl_点赞
					List<CommunityAnswer> list2 = communityAnswerMapper
							.question_iscurrentAnswer(communityQuestionPersistence.getCOMMUNITYQUESTIONID(), 1);
					int agreeCount = agreeMapper.getAgreeSizeByAnswerId(list2.get(0).getCOMMUNITYANSWERID());
					question_CommunityView.setLikesNumber(Integer.toString(agreeCount));

					// 获取用户信息
					List<User> userPersistences = userMapper.getUserInfoById(list.get(0).getUSERID());
					userInfo(question_CommunityView, userPersistences);

					// zzl_用户点评
					int answerCount = communityAnswerMapper.answerSizeByUserId(userPersistences.get(0).getUSERID());
					question_CommunityView.setTotalCommunityNumber(Integer.toString(answerCount));

					// zzl_用户点赞
					int likeCount = agreeMapper.getAgreebyUserId(userPersistences.get(0).getUSERID());
					question_CommunityView.setTotalLikesNumber(Integer.toString(likeCount));

					if (username != null) {
						String agreeId = agreeMapper.getAgree(username,
								communityAnswerPersistences.get(0).getCOMMUNITYANSWERID());
						// 判断是否点赞
						if (agreeId == null) {
							question_CommunityView.setIsLike("0");
						} else {
							question_CommunityView.setIsLike("1");
						}
					}
					question_CommunityViews.add(question_CommunityView);
				}
			}
		}

		return question_CommunityViews;
	}

	// 用户信息
	private void userInfo(Question_CommunityView question_CommunityView,
			List<User> userPersistences) {
		question_CommunityView.setUserId(userPersistences.get(0).getUSERID());
		question_CommunityView.setUserImage(userPersistences.get(0).getAVATAR());
		question_CommunityView.setUserName(userPersistences.get(0).getUSERNAME());
		question_CommunityView.setSignature(userPersistences.get(0).getUSERSIGNATURE());
	}

	// 社区问题基本信息
	private void communityBasicInfo(CommunityQuestion communityQuestionPersistence,
			String communityNumber, String classifyName, Question_CommunityView question_CommunityView) {
		question_CommunityView.setCommunityId(communityQuestionPersistence.getCOMMUNITYQUESTIONID());
		question_CommunityView.setCommunityTitle(communityQuestionPersistence.getTITLE());
		question_CommunityView.setCommunityQuestion(communityQuestionPersistence.getCONTENT());
		question_CommunityView.setTime(communityQuestionPersistence.getTIME());
		question_CommunityView.setClassifyName(classifyName);
		question_CommunityView.setCommunityNumber(communityNumber);
	}

	/**
	 * author:zzl abstract:保存问题 data:2017年9月22日14:39:58
	 */
	@Override
	public void savaCommunityQuestion(String username, String title, String content, String classifyId) {
		String userId = userMapper.getUserIdByName(username);
		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String time = format.format(date);
		CommunityQuestion communityQuestion = new CommunityQuestion();
		communityQuestion.setCOMMUNITYQUESTIONID(UUID.randomUUID().toString());
		communityQuestion.setTIME(time);
		communityQuestion.setTITLE(title);
		communityQuestion.setCONTENT(content);
		communityQuestion.setCLASSIFYID(classifyId);
		communityQuestion.setUSERID(userId);
		communityQuestion.setSCAN("0");
		communityQuestion.setQUESTIONSTATE(0);
		communityQuestion.setISANSWER(0);
		communityQuestionMapper.insert(communityQuestion);
	}

	/*
	 * zyq_question2_问题展示_最佳答案的展示
	 */
	@Override
	public Question2_CommunityView question2_CommunityViews_best(String username, String questionId) {
		// 查找COMMUNITYQUESTIONID=questionId 且 ISBESTANSWER='1'的答案_即最佳答案
		List<CommunityAnswer> communityAnswerPersistences = communityAnswerMapper
				.question_iscurrentAnswer(questionId, 1);
		Question2_CommunityView question2_CommunityView = new Question2_CommunityView();
		if (communityAnswerPersistences.size() != 0) {

			question2_CommunityView.setAnswerId(communityAnswerPersistences.get(0).getCOMMUNITYANSWERID());
			question2_CommunityView.setAnswer(communityAnswerPersistences.get(0).getCONTENT());

			// 获取用户信息
			List<User> userPersistences = userMapper
					.getUserInfoById(communityAnswerPersistences.get(0).getUSERID());
			question2_CommunityView.setUserImage(userPersistences.get(0).getAVATAR());
			question2_CommunityView.setUserName(userPersistences.get(0).getUSERNAME());
			question2_CommunityView.setUserId(userPersistences.get(0).getUSERID());
			question2_CommunityView.setSignature(userPersistences.get(0).getUSERSIGNATURE());

			List<Question2_CommunityReplayView> question2_CommunityReplayViews = new ArrayList<Question2_CommunityReplayView>();

			// 查看最佳答案的评论_一次显示5条信息
			List<Comment> commentPersistences = commentMapper.question2_getComment_Limit(
					communityAnswerPersistences.get(0).getCOMMUNITYQUESTIONID(),
					communityAnswerPersistences.get(0).getCOMMUNITYANSWERID());
			for (Comment commentPersistence : commentPersistences) {
				Question2_CommunityReplayView question2_CommunityReplayView = new Question2_CommunityReplayView();
				// 获取问题答案回复用户信息
				List<User> userPersistences2 = userMapper.getUserInfoById(commentPersistence.getUSERID());

				question2_CommunityReplayView.setCommentId(commentPersistence.getCOMMENTID());
				question2_CommunityReplayView.setUserName(userPersistences2.get(0).getUSERNAME());
				question2_CommunityReplayView.setUserImage(userPersistences2.get(0).getAVATAR());
				question2_CommunityReplayView.setCommunity(commentPersistence.getCOMMENTCONTENT());
				question2_CommunityReplayView.setTime(commentPersistence.getCOMMENTTIME());

				// 如果回复人不为空
				if (commentPersistence.getTOUSERID() != null) {
					// 获取此用户回复的用户信息
					String toUserName = userMapper.getUserNameById(commentPersistence.getTOUSERID());
					question2_CommunityReplayView.setTouserName("@" + toUserName);
				}
				question2_CommunityReplayViews.add(question2_CommunityReplayView);
			}

			// 获取最佳答案点赞数
			int agreeCount = agreeMapper
					.getAgreeSizeByAnswerId(communityAnswerPersistences.get(0).getCOMMUNITYANSWERID());
			String likeNumber = Integer.toString(agreeCount);
			question2_CommunityView.setLikesNumber(likeNumber);

			// 查看最佳答案的总评论数
			int commentNumber = commentMapper.question2_getComment(
					communityAnswerPersistences.get(0).getCOMMUNITYQUESTIONID(),
					communityAnswerPersistences.get(0).getCOMMUNITYANSWERID());
			String communityNumber = Integer.toString(commentNumber);
			question2_CommunityView.setCommunityNumber(communityNumber);

			question2_CommunityView.setTime(communityAnswerPersistences.get(0).getTIME());

			// 查看username对communityanswerId的点赞
			String agreeId = agreeMapper.getAgree(username, communityAnswerPersistences.get(0).getCOMMUNITYANSWERID());
			// 判断是否点赞
			if (agreeId == null) {
				question2_CommunityView.setIsLike("0");
			} else {
				question2_CommunityView.setIsLike("1");
			}
			// 判断是否被收藏
			String collectionId = collectionMapper.getCollection(username,
					communityAnswerPersistences.get(0).getCOMMUNITYANSWERID());
			if (collectionId == null) {
				question2_CommunityView.setIsCollection("0");
			} else {
				question2_CommunityView.setIsCollection("1");
			}

			question2_CommunityView.setReplay(question2_CommunityReplayViews);

			// 当前用户回答总数
			int answerSize = communityAnswerMapper.answerSizeByUserId(communityAnswerPersistences.get(0).getUSERID());
			question2_CommunityView.setTotalAnswer(Integer.toString(answerSize));

			// 查看用户被点赞数量
			int totalLikes = communityAnswerMapper
					.getCommunityAnswerLike(communityAnswerPersistences.get(0).getUSERID());
			question2_CommunityView.setTotalLikes(Integer.toString(totalLikes));

			question2_CommunityView
					.setIsBestAnswer(Integer.toString(communityAnswerPersistences.get(0).getISBESTANSWER()));

		}
		return question2_CommunityView;
	}

	/*
	 * zyq_question2_问题展示_除了最佳答案其他
	 */
	@Override
	public List<Question2_CommunityView> question2_CommunityViews_other(String username, String questionId,
			int startNumber) {
		List<Question2_CommunityView> question2_CommunityViews = new ArrayList<Question2_CommunityView>();
		List<CommunityAnswer> communityAnswerPersistences = communityAnswerMapper
				.question_CommunityAnswer_other(questionId, startNumber);
		for (CommunityAnswer communityAnswerPersistence : communityAnswerPersistences) {
			Question2_CommunityView question2_CommunityView = new Question2_CommunityView();

			question2_CommunityView.setAnswerId(communityAnswerPersistence.getCOMMUNITYANSWERID());
			question2_CommunityView.setAnswer(communityAnswerPersistence.getCONTENT());

			// 获取用户信息
			List<User> userPersistences = userMapper.getUserInfoById(communityAnswerPersistence.getUSERID());
			question2_CommunityView.setUserImage(userPersistences.get(0).getAVATAR());
			question2_CommunityView.setUserName(userPersistences.get(0).getUSERNAME());
			question2_CommunityView.setUserId(userPersistences.get(0).getUSERID());
			question2_CommunityView.setSignature(userPersistences.get(0).getUSERSIGNATURE());

			question2_CommunityView.setTime(communityAnswerPersistence.getTIME());

			List<Question2_CommunityReplayView> question2_CommunityReplayViews = new ArrayList<Question2_CommunityReplayView>();

			// 查看评论数
			List<Comment> commentPersistences = commentMapper.question2_getComment_Limit(
					communityAnswerPersistence.getCOMMUNITYQUESTIONID(),
					communityAnswerPersistence.getCOMMUNITYANSWERID());
			for (Comment commentPersistence : commentPersistences) {
				Question2_CommunityReplayView question2_CommunityReplayView = new Question2_CommunityReplayView();
				// 获取用户信息
				List<User> userPersistences2 = userMapper.getUserInfoById(commentPersistence.getUSERID());
				question2_CommunityReplayView.setCommentId(commentPersistence.getCOMMENTID());
				question2_CommunityReplayView.setUserName(userPersistences2.get(0).getUSERNAME());
				question2_CommunityReplayView.setUserImage(userPersistences2.get(0).getAVATAR());
				question2_CommunityReplayView.setCommunity(commentPersistence.getCOMMENTCONTENT());
				question2_CommunityReplayView.setTime(commentPersistence.getCOMMENTTIME());
				question2_CommunityReplayView.setUserId(userPersistences2.get(0).getUSERID());

				if (commentPersistence.getTOUSERID() != null) {
					String toUserName = userMapper.getUserNameById(commentPersistence.getTOUSERID());
					question2_CommunityReplayView.setTouserName("@" + toUserName);
				}
				question2_CommunityReplayViews.add(question2_CommunityReplayView);
			}

			// 获取评论数
			int commentPersistences2 = commentMapper.question2_getComment(
					communityAnswerPersistence.getCOMMUNITYQUESTIONID(),
					communityAnswerPersistence.getCOMMUNITYANSWERID());
			String communityNumber = Integer.toString(commentPersistences2);
			question2_CommunityView.setCommunityNumber(communityNumber);

			// 获取点赞数
			int agreeCount = agreeMapper.getAgreeSizeByAnswerId(communityAnswerPersistence.getCOMMUNITYANSWERID());
			String likeNumber = Integer.toString(agreeCount);
			String agreeId = agreeMapper.getAgree(username, communityAnswerPersistence.getCOMMUNITYANSWERID());
			// 判断是否点赞
			if (agreeId == null) {
				question2_CommunityView.setIsLike("0");
			} else {
				question2_CommunityView.setIsLike("1");
			}
			// 判断是否被收藏
			String collectionId = collectionMapper.getCollection(username,
					communityAnswerPersistence.getCOMMUNITYANSWERID());
			if (collectionId == null) {
				question2_CommunityView.setIsCollection("0");
			} else {
				question2_CommunityView.setIsCollection("1");
			}
			question2_CommunityView.setLikesNumber(likeNumber);
			question2_CommunityView.setReplay(question2_CommunityReplayViews);
			// 查看用户回答数量
			int answerCount = communityAnswerMapper.answerSizeByUserId(communityAnswerPersistence.getUSERID());
			// 查看用户被点赞数量
			int totalLikes = communityAnswerMapper.getCommunityAnswerLike(communityAnswerPersistence.getUSERID());
			question2_CommunityView.setTotalLikes(Integer.toString(totalLikes));
			question2_CommunityView.setTotalAnswer(Integer.toString(answerCount));
			question2_CommunityView.setIsBestAnswer(Integer.toString(communityAnswerPersistence.getISBESTANSWER()));
			question2_CommunityViews.add(question2_CommunityView);

		}
		return question2_CommunityViews;
	}

	/*
	 * zyq_ajax_question2回复的增加
	 */
	@Override
	public void saveReplyQuestion(String userId, String content, String questionId) {
		CommunityAnswer communityAnswerPersistence = new CommunityAnswer();
		communityAnswerPersistence.setCOMMUNITYANSWERID(UUID.randomUUID().toString());
		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String time = format.format(date);
		communityAnswerPersistence.setTIME(time);
		communityAnswerPersistence.setCONTENT(content);
		communityAnswerPersistence.setISBESTANSWER(0);
		communityAnswerPersistence.setCOMMUNITYQUESTIONID(questionId);
		communityAnswerPersistence.setUSERID(userId);

		// 查看问题号为 questionId 的提问者id
		String questionUserId = communityQuestionMapper.CommunityQuestion(questionId);

		int isnotice = 0;
		// 判断是否为自己回复; 如果当前登录用户id = 问题号为questionId的用户id，则isnotice = 0;
		// 即自己回复自己置isnotice = 0;
		if (userId.equals(questionUserId)) {
			isnotice = 0;
		} else {
			isnotice = 1;
		}
		communityAnswerPersistence.setISNOTICE(isnotice);
		// question2回复保存至数据库
		communityAnswerMapper.insert(communityAnswerPersistence);
	}
}
