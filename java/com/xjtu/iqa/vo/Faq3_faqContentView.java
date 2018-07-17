package com.xjtu.iqa.vo;

import java.util.List;

import com.xjtu.iqa.po.FaqQuestion;

public class Faq3_faqContentView {
	private String QuestionId;
	private String FaqTitle;
	private String FaqDescription;
	private String FaqScan;
	private String FaqModifytime;
	private String FaqCollection;
	private String FaqWritetime;
	private float FaqScore;
	private List<Faq3_faqAnswer> faqAnswers;//答案信息
	private List<Faq2_faqUserView> uList;//yonghuxinxi
	
	public String getQuestionId() {
		return QuestionId;
	}
	public void setQuestionId(String questionId) {
		QuestionId = questionId;
	}
	public String getFaqTitle() {
		return FaqTitle;
	}
	public void setFaqTitle(String faqTitle) {
		FaqTitle = faqTitle;
	}
	public String getFaqDescription() {
		return FaqDescription;
	}
	public void setFaqDescription(String faqDescription) {
		FaqDescription = faqDescription;
	}
	public String getFaqScan() {
		return FaqScan;
	}
	public void setFaqScan(String faqScan) {
		FaqScan = faqScan;
	}
	public String getFaqModifytime() {
		return FaqModifytime;
	}
	public void setFaqModifytime(String faqModifytime) {
		FaqModifytime = faqModifytime;
	}
	public String getFaqCollection() {
		return FaqCollection;
	}
	public void setFaqCollection(String faqCollection) {
		FaqCollection = faqCollection;
	}
	public String getFaqWritetime() {
		return FaqWritetime;
	}
	public void setFaqWritetime(String faqWritetime) {
		FaqWritetime = faqWritetime;
	}
	public float getFaqScore() {
		return FaqScore;
	}
	public void setFaqScore(float faqScore) {
		FaqScore = faqScore;
	}
	public List<Faq3_faqAnswer> getFaqAnswers() {
		return faqAnswers;
	}
	public void setFaqAnswers(List<Faq3_faqAnswer> faqAnswers) {
		this.faqAnswers = faqAnswers;
	}
	public List<Faq2_faqUserView> getuList() {
		return uList;
	}
	public void setuList(List<Faq2_faqUserView> uList) {
		this.uList = uList;
	}
	public Faq3_faqContentView(FaqQuestion questionPersistence){
		this.QuestionId = questionPersistence.getFAQQUESTIONID();
		this.FaqTitle = questionPersistence.getFAQTITLE();
		this.FaqDescription = questionPersistence.getFAQDESCRIPTION();
		this.FaqModifytime = questionPersistence.getMODIFYTIME();
		this.FaqScan = questionPersistence.getSCAN();
		this.FaqCollection = questionPersistence.getCOLLECTION();
		this.FaqWritetime = questionPersistence.getMODIFYNUMBER();
	}
	public Faq3_faqContentView(){
		
	}
}
