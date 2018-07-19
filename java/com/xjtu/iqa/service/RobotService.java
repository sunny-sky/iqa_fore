package com.xjtu.iqa.service;

import java.util.List;

import com.xjtu.iqa.po.Robot;
import com.xjtu.iqa.vo.robot_Chat;

public interface RobotService {

	/**
	 * robot_ajax获取机器人信息
	 */
	public List<Robot> robotinfo();
	
	/**
	 * robot_ajax_和机器人聊天
	 * @throws Exception 
	 */
	public List<robot_Chat> getRobotAnswer(String comment) throws Exception;
	
	
}
