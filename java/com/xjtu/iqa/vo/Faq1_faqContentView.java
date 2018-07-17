package com.xjtu.iqa.vo;

import com.xjtu.iqa.po.FaqQuestion;

public class Faq1_faqContentView {
	private String QuestionId;
	private String FaqTitle;
	private String FaqDescription;
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
	public Faq1_faqContentView(FaqQuestion faqQuestion ){
		this.QuestionId = faqQuestion.getFAQQUESTIONID();
		this.FaqTitle = faqQuestion.getFAQTITLE();
		this.FaqDescription = faqQuestion.getFAQDESCRIPTION();
	}
	public Faq1_faqContentView(){
		
	}
}
