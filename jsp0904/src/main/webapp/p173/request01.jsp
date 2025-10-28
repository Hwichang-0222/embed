<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 내장객체</title>
</head>
<body>
	<p>클라이언트 IP : <%=request.getRemoteAddr() %>
	<p>요청 정보 길이 : <%=request.getContentLength() %>
	<p>요청 정보 인코딩 : <%=request.getCharacterEncoding() %>
	<p>요청 정보 콘텐츠 유형 : <%=request.getContentType() %>
	<p>요청 정보 전송방식 : <%=request.getMethod() %>
</body>
</html>