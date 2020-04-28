package com.tongjingcheng.servlet.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.tongjingcheng.servlet.entity.User;
import com.tongjingcheng.servlet.utils.Db;

public class UserDao {

	/**
	 * 获取所有用户
	 * @return
	 * @throws Exception 
	 */
	public List<User> getUserList() throws Exception{
		List<User> userList = new ArrayList<User>();
		try {
			Connection connection = Db.connect();
			String sql = "select * from user order by user_id desc;";
			PreparedStatement ps = connection.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				User user = new User();
				user.setUser_id(rs.getInt("user_id"));
				user.setUsername(rs.getString("username"));
				user.setPassword(rs.getString("password"));
				userList.add(user);
			}
			rs.close();
			ps.close();
			Db.close(connection);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			throw new Exception("数据执行出错");
		}
		return userList;
	}
	
}
