<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>root</title>
</head>
<body>
	<table>
		<tr>
			<td>user_id</td>
			<td>user_name</td>
			<td>role_name</td>
		</tr>
		
		<c:forEach items="${list}" var="RootSelect">
		<tr>
			<td>${RootSelect.userId}</td>
			<td>${RootSelect.userName}</td>
			<td>${RootSelect.roleName}</td>
			<td><a href="selectUserById/${RootSelect.userId}">修改</a></td>
			<td><a href="">删除</a></td>
		</tr>
	</c:forEach>
	</table>
	

</body>
</html>