package com.tongjingcheng.servlet.services;

import java.util.List;

import com.tongjingcheng.servlet.dao.UserDao;
import com.tongjingcheng.servlet.entity.User;

/**
 * 用户服务类
 * @author tongjingcheng
 *
 */
public class UserService {

	/**
	 * 获取所有用户
	 * @return
	 */
	public List<User> getUserList(){
		UserDao userDao  = new UserDao();
		try {
			return userDao.getUserList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
