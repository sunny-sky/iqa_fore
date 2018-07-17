package com.xjtu.iqa.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xjtu.iqa.mapper.FaqClassifyMapper;
import com.xjtu.iqa.mapper.FaqQuestionMapper;
import com.xjtu.iqa.po.FaqClassify;
import com.xjtu.iqa.po.FaqQuestion;
import com.xjtu.iqa.service.FaqClassifyService;
import com.xjtu.iqa.vo.Faq1_ClassifyView;
import com.xjtu.iqa.vo.Faq1_faqContentView;

@Service
@Transactional
public class FaqClassifyServiceImpl implements FaqClassifyService {
	@Autowired
	FaqClassifyMapper faqClassifyMapper;
	@Autowired
	FaqQuestionMapper faqQuestionMapper;

	/**
	 * robot-分类
	 */
	@Override
	public String classify() {
		int num = 1;
		// 获取所有一级分类
		List<FaqClassify> classifyPersistences = faqClassifyMapper.FirstClassify_robot();
		int length = classifyPersistences.size() + 1;
		String string = "";
		for (FaqClassify classifyPersistence : classifyPersistences) {
			String firstTitle = "";
			String content = "";
			String secondTitle = "";
			String faqTitle = "";
			String content_string = "{\"title\":\"";
			String firstTitle_string = "{\"title\":\"";
			// 获取所有二级分类
			List<FaqClassify> classifyPersistences2 = faqClassifyMapper
					.SecondClassify_robot(classifyPersistence.getFAQCLASSIFYID());
			int length2 = classifyPersistences2.size() + 1;
			for (FaqClassify classifyPersistence2 : classifyPersistences2) {
				String content2 = "";
				// 获取该二级分类下faq问题中收藏量前三的faq
				List<FaqQuestion> faqPersistences = faqQuestionMapper
						.SecondClassify_robot(classifyPersistence2.getFAQCLASSIFYID());
				int length3 = faqPersistences.size() + 1;
				for (FaqQuestion faqPersistence : faqPersistences) {
					length3--;
					faqTitle = zhuanyi(faqPersistence.getFAQTITLE());
					content2 += "{\"faqTitle\":\"" + faqTitle + "\"}";
					if (length3 > 1) {
						content2 += ",";
					} else {
						content2 += "";
					}
				}
				length2--;
				secondTitle = classifyPersistence2.getFAQCLASSIFYNAME();
				content += content_string + secondTitle + "\",\"content\":[" + content2 + "]}";
				if (length2 > 1) {
					content += ",";
				} else {
					content += "";
				}
			}
			firstTitle = classifyPersistence.getFAQCLASSIFYNAME();
			string += firstTitle_string + firstTitle + "\"," + "\"id\":\"speedMenu" + num + "\"," + "\"content\":["
					+ content + "]" + "}";
			num++;
			length--;
			if (length > 1) {
				string += ",";
			} else {
				string += "";
			}
		}
		return string;
	}

	/**
	 * 标题转义
	 */
	@Override
	public String zhuanyi(String string) {
		string = string.replace("\"", "'");
		return string;
	}

	/**
	 * faq1_下面4栏推荐_按照浏览量
	 */
	@Override
	public List<Faq1_ClassifyView> faq1_ClassifyView(String parentId) {
		List<Faq1_ClassifyView> faq1_ClassifyViews = new ArrayList<Faq1_ClassifyView>();
		List<FaqClassify> classifyPersistences = faqClassifyMapper.faq1_SecondClassify(parentId);
		for (FaqClassify classifyPersistence : classifyPersistences) {
			// 查找推荐的第一条数据
			FaqQuestion questionPersistences = faqQuestionMapper
					.faq1_faqPersistences(classifyPersistence.getFAQCLASSIFYID(), 2, 1);
			Faq1_faqContentView faq1View = new Faq1_faqContentView(questionPersistences);
			// 查找推荐的剩余5条
			List<Faq1_faqContentView> faq1Views2 = new ArrayList<Faq1_faqContentView>();
			List<FaqQuestion> questionPersistences2 = faqQuestionMapper
					.faq1_faqPersistences2(classifyPersistence.getFAQCLASSIFYID(), 2, 1, 5);
			for (FaqQuestion questionPersistence : questionPersistences2) {
				Faq1_faqContentView faq2View = new Faq1_faqContentView(questionPersistence);
				faq1Views2.add(faq2View);
			}
			Faq1_ClassifyView view = new Faq1_ClassifyView(classifyPersistence);
			view.setContent(faq1View);
			view.setContent2(faq1Views2);
			faq1_ClassifyViews.add(view);
		}
		return faq1_ClassifyViews;
	}

	/**
	 * 获取该分类的父分类信息
	 */
	@Override
	public List<FaqClassify> faq2_classify(String ClassifyId) {
		// 根据分类号查找父id
		String classifyParentId = faqClassifyMapper.faq_parentId(ClassifyId);
		// 查找父分类信息
		List<FaqClassify> classifyPersistences = faqClassifyMapper.getInfoById(classifyParentId);
		return classifyPersistences;
	}

	/**
	 * 获取该分类的信息
	 */
	@Override
	public List<FaqClassify> faq2_classify2(String ClassifyId) {
		// 获取该分类信息
		List<FaqClassify> classifyPersistences = faqClassifyMapper.getInfoById(ClassifyId);
		return classifyPersistences;
	}
}
