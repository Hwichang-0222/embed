<%@ page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Welcome</title>
		<link rel="stylesheet" href="./resources/css/bootstrap.min.css" />
	</head>
<body>
	<div class="container py-4">
		
		<%@ include file="menu.jsp" %>
	
		<%!
			String greeting = "도서 쇼핑몰에 오신것을 환영합니다.";
			String tagline = "Welcome to Web Market!";
		%>
		
		<div class="p-5 mb-4 bg-body-tertiary rounded-3">
			<div class="containeer-fluid py-5">
				<h1 class="display-5 fw-bold"><%=greeting %></h1>
				<p class="col-md-8 fs-4">BookMarket</a></p>
			</div>
		</div>
		
		<div class="row align-item-md-stretch text-center">
			<div class="col-md-12">
				<div class="h-100 p-5">
					<h3><%=tagline %></h3>
					
					<%
						response.setIntHeader("Refresh", 5);
						Date day = new Date();
						String am_pm;
						int hour = day.getHours();
						int minute = day.getMinutes();
						int second = day.getSeconds();
						if (hour / 12 == 0) {
							am_pm = "AM";
						} else {
							am_pm = "PM";
							hour -= 12;
						}
						
						
						String hourT = "" + hour;
						String minuteT = "" + minute;
						String secondT = "" + second;
						
						if (hour < 10) 
							hourT = "0" + hour;
												
						if (minute < 10) 
							minuteT = "0" + minute;
						
						if (second < 10) 
							secondT = "0" + second;
						
						String CT = hourT + ":" + minuteT + ":" + secondT + " " + am_pm;
						
						out.println("현재 접속 시각 : " + CT + "\n");
					%>
					
				</div>
			</div>
		</div>
		
		<%@ include file="footer.jsp" %>
		
	</div>
</body>
</html>