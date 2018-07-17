package com.xjtu.iqa.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xjtu.iqa.mapper.FaqPictureMapper;
import com.xjtu.iqa.po.FaqPicture;
import com.xjtu.iqa.service.FaqPictureService;

@Service
@Transactional
public class FaqPictureServiceImpl implements FaqPictureService{
	@Autowired
	FaqPictureMapper faqPictureMapper;
	/**
	 * 获取faq推荐栏信息
	 */
	@Override
	public List<FaqPicture> faqPicture(int state,int num) {
		List<FaqPicture> faqPicturePersistences = faqPictureMapper.faqPicture(state, num);
		return faqPicturePersistences;
	}
}
