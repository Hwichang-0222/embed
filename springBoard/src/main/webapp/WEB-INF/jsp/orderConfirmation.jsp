<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="jakarta.servlet.http.Cookie" %>
<%@ page import="java.net.URLDecoder" %>
<%@ page import="org.embed.dto.BookDTO" %>

<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
	<title>주문 정보</title>
	<link rel="stylesheet" href="/css/bootstrap.min.css" />
	</head>
	<body>
		<div class="container py-4">
			
			<jsp:include page="/bookmarket/menu.do" />
			
			<div class="p-5 mb-4 bg-body-tertiary rounded-3">
				<div class="container-fluid py-5">
					<h1 class="display-5 fw-bold">주문 정보</h1>
					<p class="col-md-8 fs-4">Order Info</p>
				</div>
			</div>
			
			<%
			// === 배송 정보 쿠키 읽기 ===
				String shipping_cartId = "", shipping_name = "", shipping_zipCode = "", shipping_addressName = "", 
						shipping_country = "", shipping_shippingDate = "";
			
				Cookie[] cookies = request.getCookies();
				if (cookies != null) {
					for (Cookie c : cookies) {
						switch (c.getName()) {
							case "Shipping_cartId": shipping_cartId = URLDecoder.decode(c.getValue(), "UTF-8"); break;
							case "Shipping_name": shipping_name = URLDecoder.decode(c.getValue(), "UTF-8"); break;
							case "Shipping_zipCode": shipping_zipCode = URLDecoder.decode(c.getValue(), "UTF-8"); break;
							case "Shipping_addressName": shipping_addressName = URLDecoder.decode(c.getValue(), "UTF-8"); break;
							case "Shipping_country": shipping_country = URLDecoder.decode(c.getValue(), "UTF-8"); break;
							case "Shipping_shippingDate": shipping_shippingDate = URLDecoder.decode(c.getValue(), "UTF-8"); break;
						}
					}
				}
			%>
			
			<div class="row align-items-md-stretch alert alert-info">
				<div class="text-center mb-3">
					<h1>영수증</h1>
				</div>
			
				<div class="row justify-content-between">
					<div class="col-5" align="left">
						<strong>배송 주소</strong><br>
						성명 : <%=shipping_name%><br>
						우편번호 : <%=shipping_zipCode %><br>
						주소 : <%= shipping_addressName %> (<%= shipping_country %>)<br>
					</div>
					<div class="col-5" align="right">
						<p><em>배송일 : <%= shipping_shippingDate %></em></p>
					</div>
				</div>

				<div class="py-5">
					<table class="table table-hover">
						<thead>
							<tr>
								<th class="text-center">도서</th>
								<th class="text-center">수량</th>
								<th class="text-center">가격</th>
								<th class="text-center">소계</th>
							</tr>
						</thead>
						<tbody>
							<%
								int sum = 0;
								ArrayList<BookDTO> cartList = (ArrayList<BookDTO>) session.getAttribute("cartlist");
								if (cartList == null) cartList = new ArrayList<BookDTO>();
								
								for (BookDTO book : cartList) {
								int total = book.getUnitPrice() * book.getQuantity();
								sum += total;
							%>
							<tr>
								<td class="text-center"><em><%= book.getName() %></em></td>
								<td class="text-center"><%= book.getQuantity() %></td>
								<td class="text-center"><%= book.getUnitPrice() %></td>
								<td class="text-center"><%= total %></td>
							</tr>
							<%
								}
							%>
							<tr class="table-light">
								<td></td>
								<td></td>
								<td class="text-end"><strong>총액 :</strong></td>
								<td class="text-center text-danger"><strong><%= sum %></strong></td>
							</tr>
						</tbody>
					</table>
					<a href="/bookmarket/shippingInfo.do?cartId=<%= shipping_cartId %>" class="btn btn-secondary" role="button"> 이전 </a>
					<a href="/bookmarket/thankCustomer.do" class="btn btn-success" role="button"> 주문 완료 </a>
					<a href="/bookmarket/checkOutCancelled.do" class="btn btn-secondary" role="button"> 취소 </a>
				</div>
			</div>
			
			<jsp:include page="/bookmarket/footer.do" />
			
		</div>
	</body>
</html>