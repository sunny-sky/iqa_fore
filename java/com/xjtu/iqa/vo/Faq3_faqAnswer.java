package com.xjtu.iqa.vo;

import com.xjtu.iqa.po.FaqAnswer;

public class Faq3_faqAnswer {
	private String FaqContent;

	public String getFaqContent() {
		return FaqContent;
	}

	public void setFaqContent(String faqContent) {
		FaqContent = faqContent;
	}
	public Faq3_faqAnswer(FaqAnswer answerPersistence){
		this.FaqContent = answerPersistence.getFAQCONTENT();
	}
	public Faq3_faqAnswer(){
		
	}
}
