package com.xjtu.iqa.service.impl;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xjtu.iqa.mapper.CollectionMapper;
import com.xjtu.iqa.mapper.CommentMapper;
import com.xjtu.iqa.mapper.CommunityAnswerMapper;
import com.xjtu.iqa.mapper.CommunityQuestionMapper;
import com.xjtu.iqa.mapper.FaqAnswerMapper;
import com.xjtu.iqa.mapper.FaqClassifyMapper;
import com.xjtu.iqa.mapper.FaqQuestionMapper;
import com.xjtu.iqa.mapper.ItMapper;
import com.xjtu.iqa.mapper.PayMapper;
import com.xjtu.iqa.mapper.ShareMapper;
import com.xjtu.iqa.mapper.UserMapper;
import com.xjtu.iqa.po.Collection;
import com.xjtu.iqa.po.Comment;
import com.xjtu.iqa.po.CommunityAnswer;
import com.xjtu.iqa.po.CommunityQuestion;
import com.xjtu.iqa.po.FaqAnswer;
import com.xjtu.iqa.po.FaqClassify;
import com.xjtu.iqa.po.FaqQuestion;
import com.xjtu.iqa.po.It;
import com.xjtu.iqa.po.Pay;
import com.xjtu.iqa.po.Share;
import com.xjtu.iqa.po.User;
import com.xjtu.iqa.service.UserService;
import com.xjtu.iqa.util.MD5;
import com.xjtu.iqa.vo.Personal2_CommunityView;
import com.xjtu.iqa.vo.Personal2_FaqView;
import com.xjtu.iqa.vo.Personal2_PayView;
import com.xjtu.iqa.vo.Personal2_indexList;


@Service
@Transactional
public class UserServiceImpl implements UserService{
	@Autowired
	UserMapper userMapper; 
	@Autowired
	FaqQuestionMapper faqQuestionMapper;
	@Autowired
	CommunityQuestionMapper communityQuestionMapper;
	@Autowired
	FaqClassifyMapper faqClassifyMapper;
	@Autowired
	PayMapper payMapper;
	@Autowired
	ItMapper itMapper;
	@Autowired
	ShareMapper shareMapper;
	@Autowired
	FaqAnswerMapper faqAnswerMapper;
	@Autowired
	CommentMapper commentMapper;
	@Autowired
	CollectionMapper collectionMapper;
	@Autowired
	CommunityAnswerMapper communityAnswerMapper;
	
	//login_ajax_注册
	@Override
	public void login_register(String name,String password) throws NoSuchAlgorithmException, UnsupportedEncodingException{
		UUID uuid = UUID.randomUUID();
    	Date date=new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String createTime = format.format(date);
		password = MD5.EncoderByMd5(password);		
		String userimage = "images/user.png";
		
		/*USERSTATE = 0表明用户待审核;USERSTATE = 1通过审核*/		 
		userMapper.login_register(uuid.toString(),name,password,1,createTime,userimage);
	}
	
	//判断用户是否登录
	@Override
	public boolean isLogin(String username, String password) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		String password1 = MD5.EncoderByMd5(password);
		System.out.println(password1);
		//判断用户是否登录
		Boolean loginUser = userMapper.isLogin(username, password1);
		return loginUser;
	}

	//获取登录用户信息	
	@Override
	public User loginUserInfo(String username) {
		User loginUser = userMapper.getUserInfo(username);
		return loginUser;
	}
	
	/**
     * zyq_personal2_展示自己的主页
     */
	@Override
	public List<Personal2_indexList> personal2_indexList(String username) {
		List<Personal2_indexList> personal2_indexLists = new ArrayList<Personal2_indexList>();		
		User userPersistences = userMapper.getUserInfo(username);
		//查看自己的知识库_每次查看5条
		List<FaqQuestion> qList = faqQuestionMapper.personal2_faq_Limit(userPersistences.getUSERID(),2,0,5);		
		if (qList.size()!=0) {
			for(FaqQuestion questionPersistence:qList){
				Personal2_indexList personal2_indexList = new Personal2_indexList();
				
				personal2_indexList.setUserId(userPersistences.getUSERID());
				personal2_indexList.setUserName(userPersistences.getUSERNAME());
				personal2_indexList.setUserImage(userPersistences.getAVATAR());				
				//判断是创建知识还是修改知识	!!!
				boolean isNew = faqQuestionMapper.personal2_Ismodify(questionPersistence.getFAQQUESTIONID(),"1");								
				if (isNew == false) {
					personal2_indexList.setHow("创建了知识");
				}else{
					personal2_indexList.setHow("修改了知识");
				}
				personal2_indexList.setQuestionId(questionPersistence.getFAQQUESTIONID());
				personal2_indexList.setTitle(questionPersistence.getFAQTITLE());
				personal2_indexList.setContent(questionPersistence.getFAQDESCRIPTION());
				personal2_indexList.setTime(questionPersistence.getMODIFYTIME());
				personal2_indexLists.add(personal2_indexList);
			}
		}
		
		//查看自己的论坛
		List<CommunityQuestion> cList = communityQuestionMapper.notice_CommunityQuestion_Limit(userPersistences.getUSERID(),0,5);		
		if (cList.size()!=0) {
			for(CommunityQuestion communityFaqQuestion:cList){
				Personal2_indexList personal2_indexList = new Personal2_indexList();
				
				personal2_indexList.setUserId(userPersistences.getUSERID());
				personal2_indexList.setUserName(userPersistences.getUSERNAME());
				personal2_indexList.setUserImage(userPersistences.getAVATAR());
				personal2_indexList.setHow("在问吧提问");
				personal2_indexList.setQuestionId(communityFaqQuestion.getCOMMUNITYQUESTIONID());
				personal2_indexList.setTitle(communityFaqQuestion.getTITLE());
				personal2_indexList.setContent(communityFaqQuestion.getCONTENT());
				personal2_indexList.setTime(communityFaqQuestion.getTIME());
				
				//通过classifyId获取分类信息
				List<FaqClassify> classifyPersistences = faqClassifyMapper.getInfoById(communityFaqQuestion.getCLASSIFYID());				
				personal2_indexList.setFrom(classifyPersistences.get(0).getFAQCLASSIFYNAME());				
				personal2_indexList.setFromImage(classifyPersistences.get(0).getFAQCLASSIFYIMAGE());
				personal2_indexLists.add(personal2_indexList);
			}
		}
		
		//查找关注的对象
		List<Pay> payPersistences = payMapper.payList_Limit(userPersistences.getUSERID(),0,5);
		if(payPersistences.size()!=0){
			for(Pay payPersistence:payPersistences){
				//获取被关注对象信息
				User userPersistences2 = userMapper.getUserInfoById(payPersistence.getBEPAYUSERID());

				Personal2_indexList personal2_indexList = new Personal2_indexList();
				personal2_indexList.setUserId(userPersistences.getUSERID());
				personal2_indexList.setUserName(userPersistences.getUSERNAME());
				personal2_indexList.setUserImage(userPersistences.getAVATAR());
				personal2_indexList.setHow("关注了用户");
				personal2_indexList.setTouserId(userPersistences2.getUSERID());
				personal2_indexList.setTouserName(userPersistences2.getUSERNAME());
				personal2_indexList.setTouserImage(userPersistences2.getAVATAR());
				personal2_indexList.setTouserSex(userPersistences2.getGENDER());
				personal2_indexList.setTouserAddress(userPersistences2.getUSERADDRESS());
				List<It> itPersistences = itMapper.IT(userPersistences2.getUSERID());
				if (itPersistences.size()!=0) {
					personal2_indexList.setTouserJob(itPersistences.get(0).getGOODWORK());
				}
				personal2_indexList.setTime(payPersistence.getTIME());
				personal2_indexLists.add(personal2_indexList);
	
			}
		}
		
		//查找出被关注的对象
		List<Pay> payPersistences1 = payMapper.bepayList(userPersistences.getUSERID());
		if (payPersistences1.size()!=0) {
			for(Pay payPersistence:payPersistences1){
				//找出关注对象信息
				User userPersistences2 = userMapper.getUserInfoById(payPersistence.getPAYUSERID());

				//查看关注的人专注了who
				//查看是否关注
				List<Pay> list = payMapper.getpayList(userPersistences.getUSERID(), userPersistences2.getUSERID());
				if (list.size()!=0) {
					//关注
					List<Pay> payPersistences2 = payMapper.payList_time_Limit(userPersistences2.getUSERID(),list.get(0).getTIME(),0,5);
					for(Pay payPersistence2:payPersistences2){
						Personal2_indexList personal2_indexList = new Personal2_indexList();
						personal2_indexList.setUserId(userPersistences2.getUSERID());
						personal2_indexList.setUserName(userPersistences2.getUSERNAME());
						personal2_indexList.setUserImage(userPersistences2.getAVATAR());
						personal2_indexList.setHow("关注了用户");
						User userPersistences3 = userMapper.getUserInfoById(payPersistence.getBEPAYUSERID());
						if (null != userPersistences3 ) {
							personal2_indexList.setTouserId(userPersistences3.getUSERID());
							personal2_indexList.setTouserName(userPersistences3.getUSERNAME());
							personal2_indexList.setTouserImage(userPersistences3.getAVATAR());
							personal2_indexList.setTouserSex(userPersistences3.getGENDER());
							personal2_indexList.setTouserAddress(userPersistences3.getUSERADDRESS());
						}
						List<It> itPersistences = itMapper.IT(userPersistences3.getUSERID());
						if (itPersistences.size()!=0) {
							personal2_indexList.setTouserJob(itPersistences.get(0).getGOODWORK());
						}
						personal2_indexList.setTime(payPersistence2.getTIME());
						personal2_indexLists.add(personal2_indexList);
						
					}
					
					
					//查看分享的FAQ信息
					List<Share> sharePersistences = shareMapper.getShareList_FAQ_Limit(userPersistences.getUSERID(),0,5);
					for(Share sharePersistence:sharePersistences){
						Personal2_indexList personal2_indexList = new Personal2_indexList();
						personal2_indexList.setUserId(userPersistences.getUSERID());
						personal2_indexList.setUserName(userPersistences.getUSERNAME());
						personal2_indexList.setUserImage(userPersistences.getAVATAR());
						personal2_indexList.setHow("推荐了知识");
						List<FaqQuestion> questionPersistences = faqQuestionMapper.faq3_faqcontent(sharePersistence.getFAQQUESTIONID(),2);
						if (questionPersistences.size()!=0) {
							personal2_indexList.setQuestionId(questionPersistences.get(0).getFAQQUESTIONID());
							personal2_indexList.setTitle(questionPersistences.get(0).getFAQTITLE());
							personal2_indexList.setContent(questionPersistences.get(0).getFAQDESCRIPTION());
						}
						personal2_indexList.setTime(sharePersistence.getTIME());
						personal2_indexLists.add(personal2_indexList);
					}
					
					//查看分享的Community信息
					List<Share> sharePersistences2 = shareMapper.getShareList_community_Limit(userPersistences.getUSERID(),0,5);
					for(Share sharePersistence2:sharePersistences2){
						Personal2_indexList personal2_indexList = new Personal2_indexList();
						personal2_indexList.setUserId(userPersistences.getUSERID());
						personal2_indexList.setUserName(userPersistences.getUSERNAME());
						personal2_indexList.setUserImage(userPersistences.getAVATAR());
						personal2_indexList.setHow("推荐了问题");
						List<CommunityQuestion> communityFaqQuestions = communityQuestionMapper.question2_getCommunity(sharePersistence2.getCOMMUNITYQUESTIONID());
						if (communityFaqQuestions.size()!=0) {
							personal2_indexList.setQuestionId(communityFaqQuestions.get(0).getCOMMUNITYQUESTIONID());
							personal2_indexList.setTitle(communityFaqQuestions.get(0).getTITLE());
							personal2_indexList.setContent(communityFaqQuestions.get(0).getCONTENT());
							List<FaqClassify> classifyPersistences = faqClassifyMapper.getInfoById(communityFaqQuestions.get(0).getCLASSIFYID());
							personal2_indexList.setFrom(classifyPersistences.get(0).getFAQCLASSIFYNAME());
							personal2_indexList.setFromImage(classifyPersistences.get(0).getFAQCLASSIFYIMAGE());
						}
						personal2_indexList.setTime(sharePersistence2.getTIME());
						personal2_indexLists.add(personal2_indexList);

					}
				}
			}
		}
		List<Personal2_indexList> list = ListSort(personal2_indexLists);
		return list;
	}
	
	/*
	 * zyq_personal2_ajax_获取更多的个人主页信息
	 */
	@Override
	public List<Personal2_indexList> personal2_indexList_Limit(String username, String time1, String time2,String time3, String time11, String time22, String time33) {
		List<Personal2_indexList> personal2_indexLists = new ArrayList<Personal2_indexList>();
		User userPersistences = userMapper.getUserInfo(username);
		//查看自己的知识库
		List<FaqQuestion> qList = faqQuestionMapper.personal2_faq_Limit_Time(userPersistences.getUSERID(),0,5,time2);
		if (qList.size()!=0) {
			for(FaqQuestion questionPersistence:qList){
				Personal2_indexList personal2_indexList = new Personal2_indexList();
				personal2_indexList.setUserId(userPersistences.getUSERID());
				personal2_indexList.setUserName(userPersistences.getUSERNAME());
				personal2_indexList.setUserImage(userPersistences.getAVATAR());
				//判断是创建知识还是修改知识
				boolean isNew = faqQuestionMapper.personal2_Ismodify(questionPersistence.getFAQQUESTIONID(),"1");			
				if (isNew == false) {
					personal2_indexList.setHow("创建了知识");
				}else{
					personal2_indexList.setHow("修改了知识");
				}
				personal2_indexList.setQuestionId(questionPersistence.getFAQQUESTIONID());
				personal2_indexList.setTitle(questionPersistence.getFAQTITLE());
				personal2_indexList.setContent(questionPersistence.getFAQDESCRIPTION());
				personal2_indexList.setTime(questionPersistence.getMODIFYTIME());
				personal2_indexLists.add(personal2_indexList);
			}
		}
		//查看自己的论坛
		List<CommunityQuestion> cList = communityQuestionMapper.notice_CommunityQuestion_Limit_Time(userPersistences.getUSERID(),0,5,time3);
		if (cList.size()!=0) {
			for(CommunityQuestion communityFaqQuestion:cList){
				Personal2_indexList personal2_indexList = new Personal2_indexList();
				personal2_indexList.setUserId(userPersistences.getUSERID());
				personal2_indexList.setUserName(userPersistences.getUSERNAME());
				personal2_indexList.setUserImage(userPersistences.getAVATAR());
				personal2_indexList.setHow("在问吧提问");
				personal2_indexList.setQuestionId(communityFaqQuestion.getCOMMUNITYQUESTIONID());
				personal2_indexList.setTitle(communityFaqQuestion.getTITLE());
				personal2_indexList.setContent(communityFaqQuestion.getCONTENT());
				personal2_indexList.setTime(communityFaqQuestion.getTIME());
				List<FaqClassify> classifyPersistences = faqClassifyMapper.getInfoById(communityFaqQuestion.getCLASSIFYID());
				personal2_indexList.setFrom(classifyPersistences.get(0).getFAQCLASSIFYNAME());
				personal2_indexList.setFromImage(classifyPersistences.get(0).getFAQCLASSIFYIMAGE());
				personal2_indexLists.add(personal2_indexList);
			}
		}
		//查找关注的对象
		List<Pay> payPersistences = payMapper.payList_time_Limit(userPersistences.getUSERID(),time1,0,5);
		if(payPersistences.size()!=0){
			for(Pay payPersistence:payPersistences){
				User userPersistences2 = userMapper.getUserInfoById(payPersistence.getBEPAYUSERID());

				Personal2_indexList personal2_indexList = new Personal2_indexList();
				personal2_indexList.setUserId(userPersistences.getUSERID());
				personal2_indexList.setUserName(userPersistences.getUSERNAME());
				personal2_indexList.setUserImage(userPersistences.getAVATAR());
				personal2_indexList.setHow("关注了用户");
				personal2_indexList.setTouserId(userPersistences2.getUSERID());
				personal2_indexList.setTouserName(userPersistences2.getUSERNAME());
				personal2_indexList.setTouserImage(userPersistences2.getAVATAR());
				personal2_indexList.setTouserSex(userPersistences2.getGENDER());
				personal2_indexList.setTouserAddress(userPersistences2.getUSERADDRESS());
				List<It> itPersistences = itMapper.IT(userPersistences2.getUSERID());
				if (itPersistences.size()!=0) {
					personal2_indexList.setTouserJob(itPersistences.get(0).getGOODWORK());
				}
				personal2_indexList.setTime(payPersistence.getTIME());
				personal2_indexLists.add(personal2_indexList);

			}
		}
		//查找出关注的对象
		List<Pay> payPersistences1 = payMapper.bepayList(userPersistences.getUSERID());
		if (payPersistences1.size()!=0) {
			for(Pay payPersistence:payPersistences1){
				User userPersistences2 = userMapper.getUserInfoById(payPersistence.getPAYUSERID());

				//查看关注的人专注了who
				List<Pay> list = payMapper.getpayList(userPersistences.getUSERID(), userPersistences.getUSERID());
				if (list.size()!=0) {
					List<Pay> payPersistences2 = payMapper.payList_time_Limit_Time(userPersistences.getUSERID(),list.get(0).getTIME(),0,5,time11);
					for(Pay payPersistence2:payPersistences2){
						Personal2_indexList personal2_indexList = new Personal2_indexList();
						personal2_indexList.setUserId(userPersistences2.getUSERID());
						personal2_indexList.setUserName(userPersistences2.getUSERNAME());
						personal2_indexList.setUserImage(userPersistences2.getAVATAR());
						personal2_indexList.setHow("关注了用户");
						User userPersistences3 = userMapper.getUserInfoById(payPersistence.getBEPAYUSERID());
						if (null != userPersistences3) {
							personal2_indexList.setTouserId(userPersistences3.getUSERID());
							personal2_indexList.setTouserName(userPersistences3.getUSERNAME());
							personal2_indexList.setTouserImage(userPersistences3.getAVATAR());
							personal2_indexList.setTouserSex(userPersistences3.getGENDER());
							personal2_indexList.setTouserAddress(userPersistences3.getUSERADDRESS());
						}
						List<It> itPersistences = itMapper.IT(userPersistences3.getUSERID());
						if (itPersistences.size()!=0) {
							personal2_indexList.setTouserJob(itPersistences.get(0).getGOODWORK());
						}
						personal2_indexList.setTime(payPersistence2.getTIME());
						personal2_indexLists.add(personal2_indexList);
						
					}
					
					
					//查看分享的FAQ信息
					List<Share> sharePersistences = shareMapper.getShareList_FAQ_Limit_Time(userPersistences.getUSERID(),0,5,time22);
					for(Share sharePersistence:sharePersistences){
						Personal2_indexList personal2_indexList = new Personal2_indexList();
						personal2_indexList.setUserId(userPersistences.getUSERID());
						personal2_indexList.setUserName(userPersistences.getUSERNAME());
						personal2_indexList.setUserImage(userPersistences.getAVATAR());
						personal2_indexList.setHow("推荐了知识");
						List<FaqQuestion> questionPersistences = faqQuestionMapper.faq3_faqcontent(sharePersistence.getFAQQUESTIONID(),2);
						if (questionPersistences.size()!=0) {
							personal2_indexList.setQuestionId(questionPersistences.get(0).getFAQQUESTIONID());
							personal2_indexList.setTitle(questionPersistences.get(0).getFAQTITLE());
							personal2_indexList.setContent(questionPersistences.get(0).getFAQDESCRIPTION());
						}
						personal2_indexList.setTime(sharePersistence.getTIME());
						personal2_indexLists.add(personal2_indexList);
					}
					//查看分享的Community信息
					List<Share> sharePersistences2 = shareMapper.getShareList_community_Limit_Time(userPersistences.getUSERID(),0,5,time33);
					for(Share sharePersistence2:sharePersistences2){
						Personal2_indexList personal2_indexList = new Personal2_indexList();
						personal2_indexList.setUserId(userPersistences.getUSERID());
						personal2_indexList.setUserName(userPersistences.getUSERNAME());
						personal2_indexList.setUserImage(userPersistences.getAVATAR());
						personal2_indexList.setHow("推荐了问题");
						List<CommunityQuestion> communityFaqQuestions = communityQuestionMapper.question2_getCommunity(sharePersistence2.getCOMMUNITYQUESTIONID());
						if (communityFaqQuestions.size()!=0) {
							personal2_indexList.setQuestionId(communityFaqQuestions.get(0).getCOMMUNITYQUESTIONID());
							personal2_indexList.setTitle(communityFaqQuestions.get(0).getTITLE());
							personal2_indexList.setContent(communityFaqQuestions.get(0).getCONTENT());
							List<FaqClassify> classifyPersistences = faqClassifyMapper.getInfoById(communityFaqQuestions.get(0).getCLASSIFYID());
							personal2_indexList.setFrom(classifyPersistences.get(0).getFAQCLASSIFYNAME());
							personal2_indexList.setFromImage(classifyPersistences.get(0).getFAQCLASSIFYIMAGE());
						}
						personal2_indexList.setTime(sharePersistence2.getTIME());
						personal2_indexLists.add(personal2_indexList);

					}
				}
			}
		}
		List<Personal2_indexList> list = ListSort(personal2_indexLists);
		return list;
	}
	
	//对list里面的元素进行time的排序
	private List<Personal2_indexList> ListSort(List<Personal2_indexList> list){
		Collections.sort(list,new Comparator<Personal2_indexList>() {
			@Override
			public int compare(Personal2_indexList o1, Personal2_indexList o2) {
				SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				try {
					Date dt1 = format.parse(o1.getTime());
					Date dt2 = format.parse(o2.getTime());
					if (dt1.getTime()<dt2.getTime()) {
						return 1;
					}else if (dt1.getTime()>dt2.getTime()) {
						return -1;
					}else {
						return 0;
					}
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return 0;
			}
		});
		return list;
	}	
	
	/**
	 * zyq_personal2_ajax_获取知识库列表
	 */
	@Override
	public List<Personal2_FaqView> getpersonalFaq(String userId) {
		List<Personal2_FaqView> personal2_FaqViews = new ArrayList<Personal2_FaqView>();
		List<FaqQuestion> questionPersistences = faqQuestionMapper.personal2_faq_Limit(userId,2,0,5);
		System.out.println("知识库大小："+questionPersistences.size());
		for(FaqQuestion questionPersistence:questionPersistences){
			Personal2_FaqView personal2_FaqView = new Personal2_FaqView();
			personal2_FaqView.setFaqId(questionPersistence.getFAQQUESTIONID());
			personal2_FaqView.setTitle(questionPersistence.getFAQTITLE());
			List<FaqAnswer> answerPersistences = faqAnswerMapper.getAnswerByQuestionId(questionPersistence.getFAQQUESTIONID());
			if (answerPersistences.size()!=0) {
				personal2_FaqView.setContent(answerPersistences.get(0).getFAQCONTENT());				
				String username = userMapper.getUserNameById(answerPersistences.get(0).getUSERID());
				personal2_FaqView.setUsername(username);			
				personal2_FaqView.setUserId(answerPersistences.get(0).getUSERID());
			}			
			personal2_FaqView.setTime(questionPersistence.getMODIFYTIME());			
			personal2_FaqView.setScanNumber(questionPersistence.getSCAN());
			personal2_FaqView.setCollectionNumber(questionPersistence.getCOLLECTION());
			
			//查看有多少评论及回复
			int commentCount = commentMapper.commentInfo(questionPersistence.getFAQQUESTIONID());
			personal2_FaqView.setCommentNumber(Integer.toString(commentCount));
			if (questionPersistences.size()==5) {
				personal2_FaqView.setIsMore("1");
			}else {
				personal2_FaqView.setIsMore("0");
			}
			personal2_FaqViews.add(personal2_FaqView);
		}
		return personal2_FaqViews;
	}
	
	/**
	 * zyq_personal2_ajax_获取更多的知识库列表
	 */
	@Override
	public List<Personal2_FaqView> getpersonalFaq_More(String userId,int startnumber) {
		List<Personal2_FaqView> personal2_FaqViews = new ArrayList<Personal2_FaqView>();
		List<FaqQuestion> questionPersistences = faqQuestionMapper.personal2_faq_Limit(userId,2,startnumber,5);
		for(FaqQuestion questionPersistence:questionPersistences){
			Personal2_FaqView personal2_FaqView = new Personal2_FaqView();
			personal2_FaqView.setFaqId(questionPersistence.getFAQQUESTIONID());
			personal2_FaqView.setTitle(questionPersistence.getFAQTITLE());
			List<FaqAnswer> answerPersistences = faqAnswerMapper.getAnswerByQuestionId(questionPersistence.getFAQQUESTIONID());
			if (answerPersistences.size()!=0) {
				personal2_FaqView.setContent(answerPersistences.get(0).getFAQCONTENT());				
				String username = userMapper.getUserNameById(answerPersistences.get(0).getUSERID());
				personal2_FaqView.setUsername(username);
				personal2_FaqView.setUserId(answerPersistences.get(0).getUSERID());
			}
			personal2_FaqView.setTime(questionPersistence.getMODIFYTIME());			
			personal2_FaqView.setScanNumber(questionPersistence.getSCAN());
			int faqCollectionCount = collectionMapper.getCollectionFaqCount(questionPersistence.getFAQQUESTIONID());
			personal2_FaqView.setCollectionNumber(Integer.toString(faqCollectionCount));			
			//查看有多少评论及回复
			int commentCount = commentMapper.commentInfo(questionPersistence.getFAQQUESTIONID());
			personal2_FaqView.setCommentNumber(Integer.toString(commentCount));
			if (questionPersistences.size()==5) {
				personal2_FaqView.setIsMore("1");
			}
			personal2_FaqViews.add(personal2_FaqView);
		}
		return personal2_FaqViews;
	}
	
	/**
	 * zyq_personal2_ajax_获取收藏FAQ
	 */
	@Override
	public List<Personal2_FaqView> getCollectionFaq(String userid) {
		List<Personal2_FaqView> personal2_FaqViews = new ArrayList<Personal2_FaqView>();
		List<Collection> collectionPersistences = collectionMapper.getCollectionFaq(userid,0,5);
		for(Collection collectionPersistence:collectionPersistences){
			Personal2_FaqView personal2_FaqView = new Personal2_FaqView();
			personal2_FaqView.setFaqId(collectionPersistence.getFAQQUESTIONID());
			List<FaqQuestion> questionPersistences = faqQuestionMapper.faq3_faqcontent(collectionPersistence.getFAQQUESTIONID(),2);
			if (questionPersistences.size()!=0) {
				personal2_FaqView.setTitle(questionPersistences.get(0).getFAQTITLE());
				List<FaqAnswer> answerPersistences = faqAnswerMapper.getAnswerByQuestionId(questionPersistences.get(0).getFAQQUESTIONID());
				personal2_FaqView.setContent(answerPersistences.get(0).getFAQCONTENT());
				String username = userMapper.getUserNameById(answerPersistences.get(0).getUSERID());
				personal2_FaqView.setUsername(username);
				personal2_FaqView.setUserId(answerPersistences.get(0).getUSERID());
				personal2_FaqView.setTime(questionPersistences.get(0).getMODIFYTIME());			
				personal2_FaqView.setScanNumber(questionPersistences.get(0).getSCAN());
				int faqCollectionCount = collectionMapper.getCollectionFaqCount(questionPersistences.get(0).getFAQQUESTIONID());
				personal2_FaqView.setCollectionNumber(Integer.toString(faqCollectionCount));				
				int commentCount = commentMapper.commentInfo(questionPersistences.get(0).getFAQQUESTIONID());
				personal2_FaqView.setCommentNumber(Integer.toString(commentCount));
				if (collectionPersistences.size()==5) {
					personal2_FaqView.setIsMore("1");
				}else{
					personal2_FaqView.setIsMore("0");
				}
				personal2_FaqViews.add(personal2_FaqView);
			}
		}
		return personal2_FaqViews;
	}
	
	/**
	 * zyq_personal2_ajax_获取更多的收藏FAQ
	 */
	@Override
	public List<Personal2_FaqView> getCollectionFaq_More(String userid,int startnumber) {
		List<Personal2_FaqView> personal2_FaqViews = new ArrayList<Personal2_FaqView>();
		List<Collection> collectionPersistences = collectionMapper.getCollectionFaq(userid,startnumber,5);
		for(Collection collectionPersistence:collectionPersistences){
			Personal2_FaqView personal2_FaqView = new Personal2_FaqView();
			personal2_FaqView.setFaqId(collectionPersistence.getFAQQUESTIONID());
			List<FaqQuestion> questionPersistences = faqQuestionMapper.faq3_faqcontent(collectionPersistence.getFAQQUESTIONID(),2);
			if (questionPersistences.size()!=0) {
				personal2_FaqView.setTitle(questionPersistences.get(0).getFAQTITLE());
				List<FaqAnswer> answerPersistences = faqAnswerMapper.getAnswerByQuestionId(questionPersistences.get(0).getFAQQUESTIONID());
				personal2_FaqView.setContent(answerPersistences.get(0).getFAQCONTENT());
				String username = userMapper.getUserNameById(answerPersistences.get(0).getUSERID());
				personal2_FaqView.setUsername(username);
				personal2_FaqView.setUserId(answerPersistences.get(0).getUSERID());
				personal2_FaqView.setTime(questionPersistences.get(0).getMODIFYTIME());				
				personal2_FaqView.setScanNumber(questionPersistences.get(0).getSCAN());
				int faqCollectionCount = collectionMapper.getCollectionFaqCount(questionPersistences.get(0).getFAQQUESTIONID());
				personal2_FaqView.setCollectionNumber(Integer.toString(faqCollectionCount));
				int commentCount = commentMapper.commentInfo(questionPersistences.get(0).getFAQQUESTIONID());
				personal2_FaqView.setCommentNumber(Integer.toString(commentCount));
				if (collectionPersistences.size()==5) {
					personal2_FaqView.setIsMore("1");
				}else{
					personal2_FaqView.setIsMore("0");
				}
				personal2_FaqViews.add(personal2_FaqView);
			}
		}
		return personal2_FaqViews;
	}
	
	/**
	 * zyq_personal2_ajax_获取FAQ的评论
	 */
	@Override
	public List<Personal2_FaqView> getCommentFaq(String userid) {
		List<Personal2_FaqView> personal2_FaqViews = new ArrayList<Personal2_FaqView>();
		List<Comment> commentPersistences = commentMapper.personal2_getFaqComment_Limit(userid,"0",0,5);
		for(Comment commentPersistence:commentPersistences){
			Personal2_FaqView personal2_FaqView = new Personal2_FaqView();
			personal2_FaqView.setFaqId(commentPersistence.getFAQQUESTIONID());
			List<FaqQuestion> questionPersistences = faqQuestionMapper.faq3_faqcontent(commentPersistence.getFAQQUESTIONID(),2);
			if (questionPersistences.size()!=0) {
				personal2_FaqView.setTitle(questionPersistences.get(0).getFAQTITLE());
				List<FaqAnswer> answerPersistences = faqAnswerMapper.getAnswerByQuestionId(questionPersistences.get(0).getFAQQUESTIONID());
				personal2_FaqView.setContent(answerPersistences.get(0).getFAQCONTENT());
				String username = userMapper.getUserNameById(answerPersistences.get(0).getUSERID());
				personal2_FaqView.setUsername(username);
				personal2_FaqView.setUserId(answerPersistences.get(0).getUSERID());
				personal2_FaqView.setTime(questionPersistences.get(0).getMODIFYTIME());
				personal2_FaqView.setScanNumber(questionPersistences.get(0).getSCAN());				
				int faqCollectionCount = collectionMapper.getCollectionFaqCount(questionPersistences.get(0).getFAQQUESTIONID());
				personal2_FaqView.setCollectionNumber(Integer.toString(faqCollectionCount));			
				int commentCount = commentMapper.commentInfo(questionPersistences.get(0).getFAQQUESTIONID());
				personal2_FaqView.setCommentNumber(Integer.toString(commentCount));
				if (commentPersistences.size()==5) {
					personal2_FaqView.setIsMore("1");
				}else{
					personal2_FaqView.setIsMore("0");
				}
				
				personal2_FaqView.setReplyId(commentPersistence.getCOMMENTID());
				personal2_FaqView.setReply(commentPersistence.getCOMMENTCONTENT());
				personal2_FaqView.setIsreply("我的评论");
				personal2_FaqView.setReplytime(commentPersistence.getCOMMENTTIME());				
				int faqcommentCount = commentMapper.faq3_getCommentCountById(commentPersistence.getCOMMENTPARENTID());
				personal2_FaqView.setReplyNumber(Integer.toString(faqcommentCount));
				personal2_FaqView.setParentId(commentPersistence.getCOMMENTID());				
				personal2_FaqViews.add(personal2_FaqView);
			}
		}
		return personal2_FaqViews;
	}
	
	/**
	 * zyq_personal2_ajax_获取更多FAQ的评论
	 */
	@Override
	public List<Personal2_FaqView> getCommentFaq_More(String userid, int startnumber) {
		List<Personal2_FaqView> personal2_FaqViews = new ArrayList<Personal2_FaqView>();
		List<Comment> commentPersistences = commentMapper.personal2_getFaqComment_Limit(userid,"0",startnumber,5);
		for(Comment commentPersistence:commentPersistences){
			Personal2_FaqView personal2_FaqView = new Personal2_FaqView();
			personal2_FaqView.setFaqId(commentPersistence.getFAQQUESTIONID());
			List<FaqQuestion> questionPersistences = faqQuestionMapper.faq3_faqcontent(commentPersistence.getFAQQUESTIONID(),2);
			if (questionPersistences.size()!=0) {
				personal2_FaqView.setTitle(questionPersistences.get(0).getFAQTITLE());
				List<FaqAnswer> answerPersistences = faqAnswerMapper.getAnswerByQuestionId(questionPersistences.get(0).getFAQQUESTIONID());
				personal2_FaqView.setContent(answerPersistences.get(0).getFAQCONTENT());
				String username = userMapper.getUserNameById(answerPersistences.get(0).getUSERID());
				personal2_FaqView.setUsername(username);
				personal2_FaqView.setUserId(answerPersistences.get(0).getUSERID());
				personal2_FaqView.setTime(questionPersistences.get(0).getMODIFYTIME());
				personal2_FaqView.setScanNumber(questionPersistences.get(0).getSCAN());				
				int faqcollectionCount = collectionMapper.getCollectionFaqCount(questionPersistences.get(0).getFAQQUESTIONID());
				personal2_FaqView.setCollectionNumber(Integer.toString(faqcollectionCount));
				int commentCount = commentMapper.commentInfo(questionPersistences.get(0).getFAQQUESTIONID());
				personal2_FaqView.setCommentNumber(Integer.toString(commentCount));
				if (commentPersistences.size()==5) {
					personal2_FaqView.setIsMore("1");
				}else{
					personal2_FaqView.setIsMore("0");
				}
				
				personal2_FaqView.setReplyId(commentPersistence.getCOMMENTID());
				personal2_FaqView.setReply(commentPersistence.getCOMMENTCONTENT());
				personal2_FaqView.setIsreply("我的评论");
				personal2_FaqView.setReplytime(commentPersistence.getCOMMENTTIME());				
				int faqcommentCount = commentMapper.faq3_getCommentCountById(commentPersistence.getCOMMENTPARENTID());
				personal2_FaqView.setReplyNumber(Integer.toString(faqcommentCount));
				personal2_FaqView.setParentId(commentPersistence.getCOMMENTID());
				
				personal2_FaqViews.add(personal2_FaqView);
			}
		}
		return personal2_FaqViews;
	}
	
	/**
	 * zyq_personal2_ajax_获取问吧的问题
	 */
	@Override
	public List<Personal2_CommunityView> getpersonalCommunity(String userId) {
		List<Personal2_CommunityView> personal2_CommunityViews = new ArrayList<Personal2_CommunityView>();
		List<CommunityQuestion> communityFaqQuestions = communityQuestionMapper.notice_CommunityQuestion_Limit(userId, 0, 5);
		for(CommunityQuestion communityFaqQuestion:communityFaqQuestions){
			Personal2_CommunityView personal2_CommunityView = new Personal2_CommunityView();
			personal2_CommunityView.setClassifyId(communityFaqQuestion.getCLASSIFYID());
			List<FaqClassify> classifyPersistences = faqClassifyMapper.getInfoById(communityFaqQuestion.getCLASSIFYID());
			personal2_CommunityView.setClassifyName(classifyPersistences.get(0).getFAQCLASSIFYNAME());
			personal2_CommunityView.setClassifyImage(classifyPersistences.get(0).getFAQCLASSIFYIMAGE());	
			personal2_CommunityView.setTitle(communityFaqQuestion.getTITLE());
			personal2_CommunityView.setQuestionId(communityFaqQuestion.getCOMMUNITYQUESTIONID());
			personal2_CommunityView.setTime(communityFaqQuestion.getTIME());			
			int communityAnswerCount = communityAnswerMapper.question_CommunityAnswerCount(communityFaqQuestion.getCOMMUNITYQUESTIONID());
			personal2_CommunityView.setAnswerNumber(Integer.toString(communityAnswerCount));
			if (communityFaqQuestions.size()==5) {
				personal2_CommunityView.setIsMore("1");
			}else{
				personal2_CommunityView.setIsMore("0");
			}
			personal2_CommunityViews.add(personal2_CommunityView);
		}
		return personal2_CommunityViews;
	}
	
	/**
	 * zyq_personal2_ajax_获取更多问吧的问题
	 */
	@Override
	public List<Personal2_CommunityView> getMoreCommunity(String userid, int startnumber) {
		List<Personal2_CommunityView> personal2_CommunityViews = new ArrayList<Personal2_CommunityView>();
		List<CommunityQuestion> communityFaqQuestions = communityQuestionMapper.notice_CommunityQuestion_Limit(userid, startnumber, 5);
		for(CommunityQuestion communityFaqQuestion:communityFaqQuestions){
			Personal2_CommunityView personal2_CommunityView = new Personal2_CommunityView();
			personal2_CommunityView.setClassifyId(communityFaqQuestion.getCLASSIFYID());
			List<FaqClassify> classifyPersistences = faqClassifyMapper.getInfoById(communityFaqQuestion.getCLASSIFYID());
			personal2_CommunityView.setClassifyImage(classifyPersistences.get(0).getFAQCLASSIFYIMAGE());
			personal2_CommunityView.setClassifyName(classifyPersistences.get(0).getFAQCLASSIFYNAME());
			personal2_CommunityView.setTitle(communityFaqQuestion.getTITLE());
			personal2_CommunityView.setQuestionId(communityFaqQuestion.getCOMMUNITYQUESTIONID());
			personal2_CommunityView.setTime(communityFaqQuestion.getTIME());		
			int communityAnswerCount = communityAnswerMapper.question_CommunityAnswerCount(communityFaqQuestion.getCOMMUNITYQUESTIONID());
			personal2_CommunityView.setAnswerNumber(Integer.toString(communityAnswerCount));
			if (communityFaqQuestions.size()==5) {
				personal2_CommunityView.setIsMore("1");
			}else{
				personal2_CommunityView.setIsMore("0");
			}
			personal2_CommunityViews.add(personal2_CommunityView);
		}
		return personal2_CommunityViews;
	}
	
	/**
	 * zyq_personal2_ajax_获取问吧的关注_答案
	 */
	@Override
	public List<Personal2_CommunityView> getPayCommunity(String userId) {
		List<Personal2_CommunityView> personal2_CommunityViews = new ArrayList<Personal2_CommunityView>();
		List<Collection> collectionPersistences = collectionMapper.personal2_PayCommunity_Limit(userId,0,5);
		for(Collection collectionPersistence:collectionPersistences){
			Personal2_CommunityView personal2_CommunityView = new Personal2_CommunityView();
			List<CommunityAnswer> communityFaqAnswers = communityAnswerMapper.question_CommunityAnswerId(collectionPersistence.getCOMMUNITYANSWERID());
			List<CommunityQuestion> communityFaqQuestions = communityQuestionMapper.question2_getCommunity(communityFaqAnswers.get(0).getCOMMUNITYQUESTIONID());
			personal2_CommunityView.setClassifyId(communityFaqQuestions.get(0).getCLASSIFYID());
			List<FaqClassify> classifyPersistences = faqClassifyMapper.getInfoById(communityFaqQuestions.get(0).getCLASSIFYID());
			personal2_CommunityView.setClassifyImage(classifyPersistences.get(0).getFAQCLASSIFYIMAGE());
			personal2_CommunityView.setClassifyName(classifyPersistences.get(0).getFAQCLASSIFYNAME());
			personal2_CommunityView.setTitle(communityFaqQuestions.get(0).getTITLE());			
			personal2_CommunityView.setQuestionId(communityFaqAnswers.get(0).getCOMMUNITYQUESTIONID());
			if (collectionPersistences.size()==5) {
				personal2_CommunityView.setIsMore("1");
			}else{
				personal2_CommunityView.setIsMore("0");
			}
			
			personal2_CommunityView.setContent(communityFaqAnswers.get(0).getCONTENT());
			int commentTotalnumber = commentMapper.faq3_getCommentReply(communityFaqAnswers.get(0).getCOMMUNITYANSWERID());
			personal2_CommunityView.setReplyNumber(Integer.toString(commentTotalnumber));
			personal2_CommunityView.setReplyTime(communityFaqAnswers.get(0).getTIME());			
			
			personal2_CommunityViews.add(personal2_CommunityView);
		}
		return personal2_CommunityViews;
	}
	
	/**
	 * zyq_personal2_ajax_获取更多问吧的关注答案
	 */
	@Override
	public List<Personal2_CommunityView> getMorePayCommunity(String userid, int startnumber) {
		List<Personal2_CommunityView> personal2_CommunityViews = new ArrayList<Personal2_CommunityView>();
		List<Collection> collectionPersistences = collectionMapper.personal2_PayCommunity_Limit(userid,startnumber,5);
		for(Collection collectionPersistence:collectionPersistences){
			Personal2_CommunityView personal2_CommunityView = new Personal2_CommunityView();
			List<CommunityAnswer> communityFaqAnswers = communityAnswerMapper.question_CommunityAnswerId(collectionPersistence.getCOMMUNITYANSWERID());
			List<CommunityQuestion> communityFaqQuestions = communityQuestionMapper.question2_getCommunity(communityFaqAnswers.get(0).getCOMMUNITYQUESTIONID());
			personal2_CommunityView.setClassifyId(communityFaqQuestions.get(0).getCLASSIFYID());
			List<FaqClassify> classifyPersistences = faqClassifyMapper.getInfoById(communityFaqQuestions.get(0).getCLASSIFYID());
			personal2_CommunityView.setClassifyName(classifyPersistences.get(0).getFAQCLASSIFYNAME());
			personal2_CommunityView.setClassifyImage(classifyPersistences.get(0).getFAQCLASSIFYIMAGE());
			personal2_CommunityView.setTitle(communityFaqQuestions.get(0).getTITLE());
			personal2_CommunityView.setQuestionId(communityFaqAnswers.get(0).getCOMMUNITYQUESTIONID());
			if (collectionPersistences.size()==5) {
				personal2_CommunityView.setIsMore("1");
			}else{
				personal2_CommunityView.setIsMore("0");
			}
			
			personal2_CommunityView.setContent(communityFaqAnswers.get(0).getCONTENT());
			int commentTotalnumber = commentMapper.faq3_getCommentReply(communityFaqAnswers.get(0).getCOMMUNITYANSWERID());
			personal2_CommunityView.setReplyNumber(Integer.toString(commentTotalnumber));
			personal2_CommunityView.setReplyTime(communityFaqAnswers.get(0).getTIME());
			personal2_CommunityViews.add(personal2_CommunityView);
		}
		return personal2_CommunityViews;
	}
	
	/**
	 * zyq_personal2_ajax_获取问吧我的回答
	 */
	@Override
	public List<Personal2_CommunityView> getReplyCommunity(String userId) {
		List<Personal2_CommunityView> personal2_CommunityViews = new ArrayList<Personal2_CommunityView>();
		//查看评论
		List<CommunityAnswer> communityFaqAnswers = communityAnswerMapper.personal2_ReplyCommunity(userId,0,5);
		for(CommunityAnswer communityFaqAnswer:communityFaqAnswers){
			Personal2_CommunityView personal2_CommunityView = new Personal2_CommunityView();
			List<CommunityQuestion> communityFaqQuestions = communityQuestionMapper.question2_getCommunity(communityFaqAnswer.getCOMMUNITYQUESTIONID());
			personal2_CommunityView.setClassifyId(communityFaqQuestions.get(0).getCLASSIFYID());
			List<FaqClassify> classifyPersistences = faqClassifyMapper.getInfoById(communityFaqQuestions.get(0).getCLASSIFYID());
			personal2_CommunityView.setClassifyName(classifyPersistences.get(0).getFAQCLASSIFYNAME());
			personal2_CommunityView.setClassifyImage(classifyPersistences.get(0).getFAQCLASSIFYIMAGE());
			personal2_CommunityView.setTitle(communityFaqQuestions.get(0).getTITLE());		
			personal2_CommunityView.setQuestionId(communityFaqAnswer.getCOMMUNITYQUESTIONID());
			if (communityFaqAnswers.size()==5) {
				personal2_CommunityView.setIsMore("1");
			}else{
				personal2_CommunityView.setIsMore("0");
			}
			
			personal2_CommunityView.setIsreply("0");			
			personal2_CommunityView.setContent(communityFaqAnswer.getCONTENT());
			int commentTotalnumber = commentMapper.faq3_getCommentReply(communityFaqAnswers.get(0).getCOMMUNITYANSWERID());
			personal2_CommunityView.setReplyNumber(Integer.toString(commentTotalnumber));
			personal2_CommunityView.setReplyTime(communityFaqAnswer.getTIME());			
			personal2_CommunityViews.add(personal2_CommunityView);
		}
		return personal2_CommunityViews;
	}
	
	/**
	 * zyq_personal2_ajax_获取更多问吧的回答
	 */
	@Override
	public List<Personal2_CommunityView> getMoreReplyCommunity(String userid,int startNumber) {
		List<Personal2_CommunityView> personal2_CommunityViews = new ArrayList<Personal2_CommunityView>();
		//查看评论
		List<CommunityAnswer> communityFaqAnswers = communityAnswerMapper.personal2_ReplyCommunity(userid,startNumber,5);
		for(CommunityAnswer communityFaqAnswer:communityFaqAnswers){
			Personal2_CommunityView personal2_CommunityView = new Personal2_CommunityView();
			List<CommunityQuestion> communityFaqQuestions = communityQuestionMapper.question2_getCommunity(communityFaqAnswer.getCOMMUNITYQUESTIONID());
			personal2_CommunityView.setClassifyId(communityFaqQuestions.get(0).getCLASSIFYID());
			List<FaqClassify> classifyPersistences = faqClassifyMapper.getInfoById(communityFaqQuestions.get(0).getCLASSIFYID());
			personal2_CommunityView.setClassifyName(classifyPersistences.get(0).getFAQCLASSIFYNAME());
			personal2_CommunityView.setClassifyImage(classifyPersistences.get(0).getFAQCLASSIFYIMAGE());
			personal2_CommunityView.setTitle(communityFaqQuestions.get(0).getTITLE());
			personal2_CommunityView.setQuestionId(communityFaqAnswer.getCOMMUNITYQUESTIONID());
			if (communityFaqAnswers.size()==5) {
				personal2_CommunityView.setIsMore("1");
			}else{
				personal2_CommunityView.setIsMore("0");
			}
			
			personal2_CommunityView.setIsreply("0");			
			personal2_CommunityView.setContent(communityFaqAnswer.getCONTENT());
			int commentTotalnumber = commentMapper.faq3_getCommentReply(communityFaqAnswers.get(0).getCOMMUNITYANSWERID());
			personal2_CommunityView.setReplyNumber(Integer.toString(commentTotalnumber));
			personal2_CommunityView.setReplyTime(communityFaqAnswer.getTIME());
			
			personal2_CommunityViews.add(personal2_CommunityView);
		}
		return personal2_CommunityViews;
	}
	
	/**
	 * zyq_personal2_ajax_获取关注
	 */
	@Override
	public List<Personal2_PayView> getPay(String userId){
		List<Personal2_PayView> personal2_PayViews = new ArrayList<Personal2_PayView>();
		List<Pay> payPersistences2 = payMapper.payList(userId);
		for(Pay payPersistence:payPersistences2){
			Personal2_PayView personal2_PayView = new Personal2_PayView();
			//获取被关注用户信息
			User userPersistences = userMapper.getUserInfoById(payPersistence.getBEPAYUSERID());			
			personal2_PayView.setUserId(userPersistences.getUSERID());
			personal2_PayView.setUserName(userPersistences.getUSERNAME());
			personal2_PayView.setUserImage(userPersistences.getAVATAR());
			//关注人数
			int payCount = payMapper.payListSize(userPersistences.getUSERID());
			personal2_PayView.setPayNumber(Integer.toString(payCount));
			//粉丝数
			int bePayCount = payMapper.bepayListSize(userPersistences.getUSERID());			
			personal2_PayView.setBepayNumber(Integer.toString(bePayCount));			
			List<It> itPersistences = itMapper.IT(userPersistences.getUSERID());
			if (itPersistences.size()!=0) {
				personal2_PayView.setWork(itPersistences.get(0).getGOODWORK());
			}						
			List<Pay> persistences = payMapper.getpayList(payPersistence.getBEPAYUSERID(), userId);
			List<Pay> persistences2 = payMapper.getpayList(userId,payPersistence.getBEPAYUSERID());
			if (persistences.size()!=0&&persistences2.size()!=0) {
				personal2_PayView.setIsTogetherPay("1");
			}else {
				personal2_PayView.setIsTogetherPay("0");
			}
			personal2_PayViews.add(personal2_PayView);
		}
		return personal2_PayViews;
	}
	
	/**
	 * zyq_personal2_ajax_获取关注
	 */
	@Override
	public List<Personal2_PayView> getbePay(String userId){
		List<Personal2_PayView> personal2_PayViews = new ArrayList<Personal2_PayView>();
		//回去当前用户被关注信息
		List<Pay> payPersistences2 = payMapper.bepayList(userId);
		for(Pay payPersistence:payPersistences2){
			Personal2_PayView personal2_PayView = new Personal2_PayView();
			//获取关注userId用户的关注人信息
			User userPersistences = userMapper.getUserInfoById(payPersistence.getPAYUSERID());
			personal2_PayView.setUserId(userPersistences.getUSERID());
			personal2_PayView.setUserName(userPersistences.getUSERNAME());
			personal2_PayView.setUserImage(userPersistences.getAVATAR());
			//关注人数
			int payCount = payMapper.payListSize(userPersistences.getUSERID());			
			personal2_PayView.setPayNumber(Integer.toString(payCount));
			//粉丝数
			int bypayCount = payMapper.bepayListSize(userPersistences.getUSERID());			
			personal2_PayView.setBepayNumber(Integer.toString(bypayCount));			
			List<It> itPersistences = itMapper.IT(userPersistences.getUSERID());
			if (itPersistences.size()!=0) {
				personal2_PayView.setWork(itPersistences.get(0).getGOODWORK());
			}			
			List<Pay> persistences = payMapper.getpayList(userId,payPersistence.getPAYUSERID());
			List<Pay> persistences2 = payMapper.getpayList(payPersistence.getPAYUSERID(),userId);
			if (persistences.size()!=0&&persistences2.size()!=0) {
				personal2_PayView.setIsTogetherPay("1");
			}else {
				personal2_PayView.setIsTogetherPay("0");
			}
			personal2_PayViews.add(personal2_PayView);
		}
		return personal2_PayViews;
	}
	
	/**
	 * zyq_personal2_关注
	 */
	@Override
	public void savePay(String userId, String touserId) {
		Pay payPersistence = new Pay();
		payPersistence.setPAYID(UUID.randomUUID().toString());
		payPersistence.setPAYUSERID(userId);
		payPersistence.setBEPAYUSERID(touserId);
		Date date=new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = format.format(date);
        payPersistence.setTIME(time);
        payMapper.insert(payPersistence);
	}
}
