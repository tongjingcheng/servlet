package com.tongjingcheng.servlet.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tongjingcheng.servlet.entity.User;
import com.tongjingcheng.servlet.services.UserService;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet(name="login",urlPatterns="/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LoginServlet() {
    	System.out.println("LoginServlet被初始化：");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		getServletContext().log("我在写日志");
		response.setContentType("text/html;charset=UTF-8");
		UserService userService = new UserService();
		List<User> userList = userService.getUserList();
		String str = "<li><span>ID</span><span>用户名</span><span>密码</span></li>";
		for(User user: userList) {
			str+="<li><span>"+user.getUser_id()+"</span><span>"+user.getUsername()+"</span><span>"+user.getPassword()+"</span></li>";
		}
		response.getWriter().append("Served at: ").append(request.getContextPath()).append(str);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
