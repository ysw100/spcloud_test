package com.tedu.sp01.service;

import com.tedu.sp01.pojo.User;

public interface UserService {
	User getUser(Integer id);//根据id获取当前用户信息
	void addScore(Integer id, Integer score);//增加积分
}