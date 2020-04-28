<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh">
	<head>
		<meta charset="UTF-8">
		<title>管理系统</title>
		<link rel="stylesheet" type="text/css" href="css/login&register.css">
		<!-- <link rel="icon" type="image/x-ico" href="images/stu.ico"> -->
	</head>
	<body>
		<!--Header-->
		<!-- <header>
			<nav>
				<ul>
					<a href="#"><li>首页</li></a>
					<a href="#"><li>关于系统</li></a>
					<a href="login.html"><li>登录</li></a>
					<a href="register.html"><li>注册</li></a>
				</ul>
			</nav>
		</header> -->
		<!--Main-->
		<main>
			<div class="container">
				<img class="login_bg" src="images/login.png">
				<form  class="form" action="login" method="post">
					<h3>管理系统</h3>
					<p>登录</p>
					<input type="text" autofocus="autofocus" name="username"  placeholder="用户名" required="required">
					<input type="password" name="password"  placeholder="密码" required="required">
					
					<input id="submit" type="submit" name="submit" value="登录">
				</form>
			</div>
		</main>

		<!--Footer-->
		<footer>
			<!-- <div class="info">
				<ul>
					<li>学生信息管理系统</li>
					<li>帮助与反馈</li>
					<li>联系我们</li>
				</ul>
			</div> -->
			<div class="copyright">
				&copy; Copyright. All rights reserved. Design by xxxx
			</div>
		</footer>
	</body>
</html>