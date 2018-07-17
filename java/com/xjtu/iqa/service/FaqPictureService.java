package com.xjtu.iqa.service;

import java.util.List;

import com.xjtu.iqa.po.FaqPicture;

public interface FaqPictureService {
	/**
	 * 获取faq推荐栏信息
	 */
	List<FaqPicture> faqPicture(int state,int num);
}
