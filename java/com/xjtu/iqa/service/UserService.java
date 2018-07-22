package com.xjtu.iqa.service;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.List;

import com.xjtu.iqa.po.User;
import com.xjtu.iqa.vo.Personal2_CommunityView;
import com.xjtu.iqa.vo.Personal2_FaqView;
import com.xjtu.iqa.vo.Personal2_PayView;
import com.xjtu.iqa.vo.Personal2_indexList;

public interface UserService {
	// login_ajax_注册
	public void login_register(String name, String password) throws NoSuchAlgorithmException, UnsupportedEncodingException;

	// 判断用户是否登录
	public boolean isLogin(String username, String password) throws NoSuchAlgorithmException, UnsupportedEncodingException;

	// 获取登录用户信息
	public User loginUserInfo(String username);

	/**
	 * zyq_personal2_展示自己的主页
	 */
	public List<Personal2_indexList> personal2_indexList(String username);

	/*
	 * zyq_personal2_ajax_获取更多的个人主页信息
	 */
	public List<Personal2_indexList> personal2_indexList_Limit(String username, String time1, String time2,
			String time3, String time11, String time22, String time33);

	/**
	 * zyq_personal2_ajax_获取知识库列表
	 */
	public List<Personal2_FaqView> getpersonalFaq(String userId);

	/**
	 * zyq_personal2_ajax_获取更多的知识库列表
	 */
	public List<Personal2_FaqView> getpersonalFaq_More(String userId, int startnumber);

	/**
	 * zyq_personal2_ajax_获取收藏FAQ
	 */
	public List<Personal2_FaqView> getCollectionFaq(String userid);

	/**
	 * zyq_personal2_ajax_获取更多的收藏FAQ
	 */
	public List<Personal2_FaqView> getCollectionFaq_More(String userid, int startnumber);

	/**
	 * zyq_personal2_ajax_获取FAQ的评论
	 */
	public List<Personal2_FaqView> getCommentFaq(String userid);

	/**
	 * zyq_personal2_ajax_获取更多FAQ的评论
	 */
	public List<Personal2_FaqView> getCommentFaq_More(String userid, int startnumber);

	/**
	 * zyq_personal2_ajax_获取问吧的问题
	 */
	public List<Personal2_CommunityView> getpersonalCommunity(String userId);

	/**
	 * zyq_personal2_ajax_获取更多问吧的问题
	 */
	public List<Personal2_CommunityView> getMoreCommunity(String userid, int startnumber);

	/**
	 * zyq_personal2_ajax_获取问吧的关注_答案
	 */
	public List<Personal2_CommunityView> getPayCommunity(String userId);

	/**
	 * zyq_personal2_ajax_获取更多问吧的关注答案
	 */
	public List<Personal2_CommunityView> getMorePayCommunity(String userid, int startnumber);

	/**
	 * zyq_personal2_ajax_获取问吧我的回答
	 */
	public List<Personal2_CommunityView> getReplyCommunity(String userId);

	/**
	 * zyq_personal2_ajax_获取更多问吧的回答
	 */
	public List<Personal2_CommunityView> getMoreReplyCommunity(String userid, int startNumber);

	/**
	 * zyq_personal2_ajax_获取关注
	 */
	public List<Personal2_PayView> getPay(String userId);

	/**
	 * zyq_personal2_ajax_获取关注
	 */
	public List<Personal2_PayView> getbePay(String userId);

	/**
	 * zyq_personal2_关注
	 */
	public void savePay(String userId, String touserId);
}
