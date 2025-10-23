<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page errorPage="exception01_error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>예외 처리</title>
</head>
<body>
	<%
		String num1 = request.getParameter("num1");
		String num2 = request.getParameter("num2");
		
		int su1 = Integer.parseInt(num1);
		int su2 = Integer.parseInt(num2);
		
		int res = su1 / su2;
		
		out.print(num1 + " / " + num2 + " = " + res);
	%>
</body>
</html>