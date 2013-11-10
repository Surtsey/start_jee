<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.kok.jee.dto.User" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Success</title>
</head>
<body>
Login is successful!
<br>
<br>

<jsp:useBean id="user" class="com.kok.jee.dto.User" scope="request">
	<jsp:setProperty property="userName" name="user" value="New user" />
	
</jsp:useBean>
<%--//User user = (User) session.getAttribute("user");
User user = (User) request.getAttribute("user");
--%>

Hello, <%--=user.getUserName() --%>!
<br>
Hello, <jsp:getProperty property="userName" name="user"/>
</body>
</html>