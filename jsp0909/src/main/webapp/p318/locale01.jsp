<%@page import="java.text.*"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>지역화, 국제화</title>
</head>
<body>
	<h3>현재 지역의 국가, 날짜, 통화</h3>
	<%
		Locale locale = request.getLocale();
		Date curDate = new Date();
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL, locale);
		NumberFormat numberFormat = NumberFormat.getNumberInstance(locale);
	%>
	
	국가 : <%=locale.getDisplayCountry()%><br>
	날짜 : <%=dateFormat.format(curDate) %><br>
	숫자(12345.67) : <%=numberFormat.format(12345.67) %><br>

</body>
</html>