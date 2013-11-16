<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="user" class="com.kok.jee.dto.User" scope="request">
	<!-- we use next code to specify the particular property in "user" object;
		we don't have to define property name if request parameter has the same name as property
	  -->
	<!--<jsp:setProperty property="userName" name="user" param="userName" />-->
	
	<!-- and we use next code to specify all the properties in "user" object  -->
	<jsp:setProperty property="*" name="user"  />
	
	
</jsp:useBean>


<br>
Hello, <jsp:getProperty property="userName" name="user"/>!
<br> Address 1: <jsp:getProperty property="address1" name="user"/>
<br> Address 2: <jsp:getProperty property="address2" name="user"/>
<br> Address 1: <jsp:getProperty property="address1" name="user"/>
<br> City: <jsp:getProperty property="city" name="user"/>
<br> State: <jsp:getProperty property="state" name="user"/>
<br> PIN Code: <jsp:getProperty property="pincode" name="user"/>

</body>
</html>