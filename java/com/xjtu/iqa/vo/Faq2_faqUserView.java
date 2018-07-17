package com.xjtu.iqa.vo;

import com.xjtu.iqa.po.User;

public class Faq2_faqUserView {
	private String userId;
	private String userName;
	private String userImage;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserImage() {
		return userImage;
	}
	public void setUserImage(String userImage) {
		this.userImage = userImage;
	}
	public Faq2_faqUserView(User userPersistence){
		this.userId = userPersistence.getUSERID();
		this.userName = userPersistence.getUSERNAME();
		this.userImage = userPersistence.getAVATAR();
	}
	public Faq2_faqUserView(){
		
	}
}
