<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>지역별 시간</title>
</head>
<body>
	<jsp:useBean id="now" class="java.util.Date" />
	한국 : <fmt:formatDate value="${now}" type="both" dateStyle="full" timeStyle="full"/> <br>
	
	<fmt:timeZone value="America/New_York">
		뉴욕 : <fmt:formatDate value="${now}" type="both" dateStyle="full" timeStyle="full"/> <br>
	</fmt:timeZone>
	
	런던 : <fmt:formatDate value="${now}" type="both" dateStyle="full" timeStyle="full" timeZone="Europe/London"/> <br>

</body>
</html>