<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录后</title>
</head>
<body>
	<form id="3" name="3" action="person/changeUserInfo" method="post">
	修改个人信息:<br>
	用户名:<input type="text" id="name" name="name"><br>
	密码：<input type="password" id="password" name="password"><br>
	确认密码：<input type="password" id="resetpaswd" name="resetpaswd"><br>
	
	<select name=role>
		<option selected="selected">请选择角色：
		<option value="leader" >leader
		<option value="staff" >staff
	</select>
	
	
	</form>
</body>
</html>