<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>세션이름삭제</title>
</head>
<body>
	<h4>-----세션을 삭제하기 전-----</h4>
	<%
		String id = (String)session.getAttribute("UserID");
		String passwd = (String)session.getAttribute("UserPW");
		out.println("설정된 세션 이름 UserID : " + id + "<br>");
		out.println("설정된 세션 값 UserPW : " + passwd + "<br>");
		
		if (request.isRequestedSessionIdValid()==true) {
			out.println("세션이 유효합니다.");
		} else {
			out.println("세션이 유효하지 않습니다.");
		}
		
		session.invalidate();
	%>
	<h4>------세션을 삭제한 후------</h4>
	<%
		if (request.isRequestedSessionIdValid()==true) {
			out.println("세션이 유효합니다.");
		} else {
			out.println("세션이 유효하지 않습니다.");
		}
	%>
</body>
</html>