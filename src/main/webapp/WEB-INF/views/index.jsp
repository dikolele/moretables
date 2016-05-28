<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>主页</title>
</head>
<body>
	<form id="2" name="2" action="person/addUser" method="post">
		用  户 名:<input type="text" name="name" id="name"><br>
		密       码:<input type="password" name="password" id="password"><br>
		确认密码:<input type="password" id="p2" name="p2"><br>
		<input type="submit" value="添加">
	</form>
	<br><br><br>
	<form id="1" name="1" action="person/login" method="post">

		用户名:<input type="text" name="name" id="name"><br>
		密码:<input type="password" name="password" id="password"><br>
		<input type="submit" value="登录">
		<input type="reset" value="重置">	
	</form>
	
	
	

</body>
</html>