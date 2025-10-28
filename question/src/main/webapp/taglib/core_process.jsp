<%@page import="jakarta.servlet.jsp.el.ScopedAttributeELResolver"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	String scoreStr = request.getParameter("score");
	int score = 0;
	String grade = "";
	
	try {
		score = Integer.parseInt(scoreStr);
		
		if (score >= 90) {
			grade = "A";
		} else if (score >= 80) {
			grade = "B";
		} else if (score >= 70) {
			grade = "C";
		} else if (score >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}
		request.setAttribute("score", score);
		request.setAttribute("grade", grade);
	} catch (Exception e) {
		request.setAttribute("grade", "잘못된 입력입니다.");
	}
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학점 계산</title>
</head>
<body>
	<h2>점수 <c:out value="${score}" />은 <c:out value="${grade}" />학점입니다.</h2>
	

</body>
</html>