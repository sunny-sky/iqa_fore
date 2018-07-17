package com.xjtu.iqa.mapper;

import com.xjtu.iqa.po.Message;
import com.xjtu.iqa.po.MessageExample;
import java.util.List;

public interface MessageMapper {
    int deleteByPrimaryKey(String MESSAGEID);

    int insert(Message record);

    int insertSelective(Message record);

    List<Message> selectByExample(MessageExample example);

    Message selectByPrimaryKey(String MESSAGEID);

    int updateByPrimaryKeySelective(Message record);

    int updateByPrimaryKey(Message record);
}