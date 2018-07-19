package com.xjtu.iqa.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xjtu.iqa.mapper.CommentMapper;
import com.xjtu.iqa.mapper.CommunityAnswerMapper;
import com.xjtu.iqa.mapper.CommunityQuestionMapper;
import com.xjtu.iqa.mapper.FaqAnswerMapper;
import com.xjtu.iqa.mapper.ItMapper;
import com.xjtu.iqa.mapper.UserMapper;
import com.xjtu.iqa.po.Comment;
import com.xjtu.iqa.po.It;
import com.xjtu.iqa.po.User;
import com.xjtu.iqa.service.CommentService;
import com.xjtu.iqa.vo.Faq1_UserActive;
import com.xjtu.iqa.vo.Faq2_faqUserView;
import com.xjtu.iqa.vo.Faq3_CommentReplyView;
import com.xjtu.iqa.vo.Faq3_CommentView;
import com.xjtu.iqa.vo.Question2_CommunityReplayView;

@Service
@Transactional
public class CommentServiceImpl implements CommentService{
	@Autowired
	UserMapper userMapper;
	@Autowired
	CommunityAnswerMapper communityAnswerMapper;
	@Autowired
	CommunityQuestionMapper communityQuestionMapper;
	@Autowired
	ItMapper itMapper;
	@Autowired
	FaqAnswerMapper faqAnswerMapper;
	@Autowired
	CommentMapper commentMapper;
	/**
	 * question2_获得更多的回复
	 */
	@Override
	public List<Question2_CommunityReplayView> question2_CommunityReplayViews(String questionId,String answerId,Integer startnumber){
		List<Question2_CommunityReplayView> question2_CommunityReplayViews = new ArrayList<Question2_CommunityReplayView>();
		List<Comment> commentPersistences = commentMapper.question2_getMoreComment(questionId, answerId, startnumber);
		for(Comment commentPersistence:commentPersistences){
			Question2_CommunityReplayView question2_CommunityReplayView = new Question2_CommunityReplayView();
			question2_CommunityReplayView.setCommunity(commentPersistence.getCOMMENTCONTENT());
			question2_CommunityReplayView.setTime(commentPersistence.getCOMMENTTIME());
			List<User> userPersistences = userMapper.getUserInfoById(commentPersistence.getUSERID());
			question2_CommunityReplayView.setUserImage(userPersistences.get(0).getAVATAR());
			question2_CommunityReplayView.setUserName(userPersistences.get(0).getUSERNAME());
			question2_CommunityReplayViews.add(question2_CommunityReplayView);
		}
		return question2_CommunityReplayViews;
	}
	
	/**
	 * question2_设为最佳答案
	 */
	@Override
	public void saveBestAnswer(String questionId,String answerId) {
		//更新社区答案ISBESTANSWER字段
		communityAnswerMapper.saveBestAnswer(answerId,1);
		//更新社区问题ISANSWER字段 = 1
		communityQuestionMapper.updateBestAnswer(questionId,1);
	}
	
	/**
	 * faq1_查看活跃用户
	 */
	@Override
	public List<Faq1_UserActive> faq1_userActive() {
		List<Faq1_UserActive> faq1_UserActives = new ArrayList<Faq1_UserActive>();
  	    Date date=new Date();
  	    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
  	    String time = format.format(date);
		List<Comment> commentPersistences = commentMapper.faq1_userActive(time);
		for(Comment commentPersistence:commentPersistences){
			Faq1_UserActive faq1_UserActive = new Faq1_UserActive();
			faq1_UserActive.setUserId(commentPersistence.getUSERID());
			List<User> userPersistences = userMapper.getUserInfoById(commentPersistence.getUSERID());
			faq1_UserActive.setUserImage(userPersistences.get(0).getAVATAR());
			List<It> itPersistences = itMapper.IT(commentPersistence.getUSERID());
			if (itPersistences.size()!=0) {
				faq1_UserActive.setWork(itPersistences.get(0).getGOODWORK());
			}
			faq1_UserActive.setUserName(userPersistences.get(0).getUSERNAME());
			faq1_UserActive.setFaqNumber(commentPersistence.getNUM());
			faq1_UserActives.add(faq1_UserActive);
		}
		return faq1_UserActives;
	}
	
	/**
	 * faq1_查看活跃用户_按周查询
	 */
	@Override
	public List<Faq1_UserActive> faq1_userActive_week() {
		List<Faq1_UserActive> faq1_UserActives = new ArrayList<Faq1_UserActive>();
  	    Date date=new Date();

  	    Calendar c = Calendar.getInstance();
  	    c.setTime(date);
  	    c.add(Calendar.DAY_OF_MONTH, 1);
  	    
  	    Date tomorrow = c.getTime();
  	    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
  	    String time = format.format(tomorrow);  	    
  	    String time2 = getdate(-7);
		List<Comment> commentPersistences = commentMapper.faq1_userActiveWeek(time,time2);
		for(Comment commentPersistence:commentPersistences){
			Faq1_UserActive faq1_UserActive = new Faq1_UserActive();
			faq1_UserActive.setUserId(commentPersistence.getUSERID());
			List<User> userPersistences = userMapper.getUserInfoById(commentPersistence.getUSERID());
			faq1_UserActive.setUserImage(userPersistences.get(0).getAVATAR());
			List<It> itPersistences = itMapper.IT(commentPersistence.getUSERID());
			if (itPersistences.size()!=0) {
				faq1_UserActive.setWork(itPersistences.get(0).getGOODWORK());
			}
			faq1_UserActive.setUserName(userPersistences.get(0).getUSERNAME());
			faq1_UserActive.setFaqNumber(commentPersistence.getNUM());
			faq1_UserActives.add(faq1_UserActive);
		}
		return faq1_UserActives;
	}
	
	//获取日期
	@Override
	public String getdate(int i){ // //获取前后日期 i为正数 向后推迟i天，负数时向前提前i天
		 Date dat = null;
		 Calendar cd = Calendar.getInstance();
		 cd.add(Calendar.DATE, i);
		 dat = cd.getTime();
		 SimpleDateFormat dformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		 String time = dformat.format(dat);
		 return time;
	 }
	
	/**
	 * faq3_获得评论列表
	 */
	@Override
	public List<Faq3_CommentView> faq3_comment(String questionId,int startnumber) {
		List<Faq3_CommentView> faq3_CommentViews = new ArrayList<Faq3_CommentView>();
		List<Comment> commentPersistences = commentMapper.getCommentMore(questionId,startnumber,"0");
		for(Comment commentPersistence : commentPersistences){
			//获取用户信息
			List<Faq2_faqUserView> faq2_faqUserViews = new ArrayList<Faq2_faqUserView>();
			List<User> userPersistences = userMapper.getUserInfoById(commentPersistence.getUSERID());
			for(User userPersistence:userPersistences){
				Faq2_faqUserView userView = new Faq2_faqUserView(userPersistence);
				faq2_faqUserViews.add(userView);
			}
			
			//获取faq3评论回复信息
			List<Faq3_CommentReplyView> faq3_CommentReplyViews = new ArrayList<Faq3_CommentReplyView>();			
			List<Comment> commentPersistences2 = commentMapper.faq3_getCommentReply_Limit(commentPersistence.getCOMMENTID(),0);
			for(Comment commentPersistence2:commentPersistences2){
				Faq3_CommentReplyView faq3_CommentReplyView = new Faq3_CommentReplyView();
				faq3_CommentReplyView.setCommentId(commentPersistence2.getCOMMENTID());
				faq3_CommentReplyView.setParrentId(commentPersistence2.getCOMMENTPARENTID());				
				String username = userMapper.getUserNameById(commentPersistence2.getUSERID());
				faq3_CommentReplyView.setUserName(username);
				//获取父评论信息
				List<Comment> commentPersistences3 = commentMapper.faq3_getCommentInfoById(commentPersistence2.getCOMMENTPARENTID());
				if (commentPersistences3.get(0).getCOMMENTPARENTID().equals("0")&&commentPersistence2.getTOUSERID()==null) {
					faq3_CommentReplyView.setToUserName(null);
				}else {
					String toUsername = userMapper.getUserNameById(commentPersistence2.getTOUSERID());					
					faq3_CommentReplyView.setToUserName(toUsername);
				}								
				faq3_CommentReplyView.setTime(commentPersistence2.getCOMMENTTIME());
				faq3_CommentReplyView.setComment(commentPersistence2.getCOMMENTCONTENT());						
				faq3_CommentReplyViews.add(faq3_CommentReplyView);
			}		
			int commentTotalnumber = commentMapper.faq3_getCommentReply(commentPersistence.getCOMMENTID());			
			Faq3_CommentView faq3_CommentView = new Faq3_CommentView(commentPersistence);
			faq3_CommentView.setCommentId(commentPersistence.getCOMMENTID());
			faq3_CommentView.setCommentNumber(Integer.toString(commentTotalnumber));
			faq3_CommentView.setUserViews(faq2_faqUserViews);
			faq3_CommentView.setReplyViews(faq3_CommentReplyViews);			
			faq3_CommentViews.add(faq3_CommentView);
		}
		return faq3_CommentViews;
	}
	
	/**
	 * faq3_ajax_添加评论
	 */
	@Override
	public void addComment(String userid, String faqquestionid, String comment,String faquserid) {		
		Date date=new Date();
	    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	    String time = format.format(date);
	    //查看是否回答自己的FAQ
	    String answerUserId = faqAnswerMapper.findUserIdByFAQQuestionId(faqquestionid);
	    int isnotice = 0;
	    if (userid.equals(answerUserId)) {
			isnotice = 0;
		}else {
			isnotice = 1;
		}
		commentMapper.saveComment(UUID.randomUUID().toString(),faqquestionid,null,userid,comment,time,"0",isnotice,faquserid);
	}
	
	/**
	 * question2_ajax_添加评论的回复
	 */
	@Override
	public void saveCommunityComment(String userid,String communityquestionId,String comment,String answerId){
		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	    String time = format.format(date);
	    //查看是否回复了自己的评论
	    String answerUserId = communityAnswerMapper.getUserIdByAnswerId(answerId);
	    int isnotice = 0;
	    if (userid.equals(answerUserId)) {
			isnotice = 0;
		}else {
			isnotice = 1;
		}
	    commentMapper.saveComment(UUID.randomUUID().toString(), null, communityquestionId, userid, comment, time, answerId,isnotice,null);
	}
	
	/**
	 * faq3_ajax_添加评论的回复
	 */
	@Override
	public void saveFaqComment(String userid,String faqquestionId,String comment,String commentId,String duo){
		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	    String time = format.format(date);
	    //查看是否回复了自己的评论
	    String commentUserId = commentMapper.faq3_getUserIdByCommentId(commentId);
	    int isnotice = 0;
	    if (userid.equals(commentUserId)) {
			isnotice = 0;
		}else {
			isnotice = 1;
		}
	    if (duo.equals("1")) {
	    	//二级回复记录回复用户commentUserId
	    	commentMapper.saveComment(UUID.randomUUID().toString(), faqquestionId, null, userid, comment, time, commentId,isnotice,commentUserId);
		}else {
			commentMapper.saveComment(UUID.randomUUID().toString(), faqquestionId, null, userid, comment, time, commentId,isnotice,null);
		}
	}
	
	/**
	 * faq3_获得更多的回复
	 */
	@Override
	public List<Faq3_CommentReplyView> faq3_CommentReplyViews(String commentId,int startnumber){
		List<Faq3_CommentReplyView> faq3_CommentReplyViews = new ArrayList<Faq3_CommentReplyView>();
		List<Comment> commentPersistences = commentMapper.faq3_getCommentReply_Limit(commentId, startnumber);
		for(Comment commentPersistence:commentPersistences){
			Faq3_CommentReplyView faq3_CommentReplyView = new Faq3_CommentReplyView();
			faq3_CommentReplyView.setCommentId(commentPersistence.getCOMMENTID());
			faq3_CommentReplyView.setParrentId(commentPersistence.getCOMMENTPARENTID());
			String username = userMapper.getUserNameById(commentPersistence.getUSERID());
			faq3_CommentReplyView.setUserName(username);
			if (commentPersistence.getTOUSERID()!=null) {
				String toUsername = userMapper.getUserNameById(commentPersistence.getTOUSERID());
				faq3_CommentReplyView.setToUserName(toUsername);
			}			
			faq3_CommentReplyView.setTime(commentPersistence.getCOMMENTTIME());
			faq3_CommentReplyView.setComment(commentPersistence.getCOMMENTCONTENT());			
			faq3_CommentReplyViews.add(faq3_CommentReplyView);
		}
		return faq3_CommentReplyViews;
	}
}
