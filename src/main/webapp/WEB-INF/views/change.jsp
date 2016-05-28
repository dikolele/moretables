<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form id="4" name="4" action="afterChange" method="post">
		userName:<input type="text" id="userName" name="userName" value="${user.userName}">
		userRole:<select name="rolename">
						<option value="root" <c:if test="${rolename == 'root'}" > selected="selected" </c:if>> root
						<option value="leader" <c:if test="${rolename == 'leader'}"> selected="selected" </c:if> >leader
						<option value="staff" <c:if test="${rolename == 'staff'}"> selected="selected" </c:if> >staff
				</select>
				<br >
		<input type="submit" value="更改">
	</form>
	
</body>
</html>