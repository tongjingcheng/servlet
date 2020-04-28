package com.tongjingcheng.servlet.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Db {

	/**
	 * 建立连接数据库
	 * @return
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
	public static Connection connect() throws SQLException, ClassNotFoundException {
		String url = "jdbc:mysql://localhost:3306/usystem?useUnicode=true&characterEncoding=UTF8&useSSL=false";
		String user = "root";
		String password = "jingcheng";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection(url, user, password);
		return connection;
	}
	
	/**
	 * 关闭数据连接
	 * @param connection
	 */
	public static void close(Connection connection) {
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
