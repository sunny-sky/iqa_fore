package com.xjtu.iqa.mapper;

import java.util.List;

import com.xjtu.iqa.po.FaqPicture;
import com.xjtu.iqa.po.FaqPictureExample;

public interface FaqPictureMapper {
	int deleteByPrimaryKey(String FAQPICTUREID);

	int insert(FaqPicture record);

	int insertSelective(FaqPicture record);

	List<FaqPicture> selectByExample(FaqPictureExample example);

	FaqPicture selectByPrimaryKey(String FAQPICTUREID);

	int updateByPrimaryKeySelective(FaqPicture record);

	int updateByPrimaryKey(FaqPicture record);

	// 获取faq推荐栏信息
	List<FaqPicture> faqPicture(int state, int num);

	// 删除faq推荐栏信息
	void deletePic(String faqPicId, int state);

	// 修改faq推荐栏图片标题
	void updateTitle(String faqPicId, String picTitle);
}