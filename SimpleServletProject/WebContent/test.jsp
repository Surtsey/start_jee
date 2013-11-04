<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>test JSP</title>
</head>
<body>

<%!
public int sum(int a, int b){
	return a+b;
}

%>

<%
int k=5;
int f=8;
out.println("k = "+ k +"; f = "+ f);

%>

<% for (int i=0;i<5;i++){ %>

<br> The new value of i is <%=i %>
<%} %>
<br>
<p>
<a href="www.google.com">www.google.com</a>
<a href="www.github.com">www.github.com</a>
<br>
<b>The value returned by function is <%=sum(10,20) %></b>

</body>
</html>