<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList, org.embed.dto.*, org.embed.dao.*" %>
<%
String id = request.getParameter("id");
	
	if (id == null || id.trim().equals("")) {
		response.sendRedirect("books.jsp");
		return;
	}
	
	BookRepository dao = BookRepository.getInstance();
	
	BookDTO book = dao.getBookbyId(id);
	
	if (book == null) {
		response.sendRedirect("exceptionNoBookId.jsp");
	}
	
	ArrayList<BookDTO> goodsList = dao.getAllBooks();
	BookDTO goods = new BookDTO();
	
	for (int i = 0; i < goodsList.size(); i++) {
		goods = goodsList.get(i);
		if (goods.getBookId().equals(id)) {
	break;
		}
	}
	
	ArrayList<BookDTO> list = (ArrayList<BookDTO>) session.getAttribute("cartlist");
	
	if (list == null) {
		list = new ArrayList<BookDTO>();
		session.setAttribute("cartlist", list);
	}
	
	int cnt = 0;
	BookDTO goodsQnt = new BookDTO();
	
	for (int i = 0; i < list.size(); i++) {
		goodsQnt = list.get(i);
		if (goodsQnt.getBookId().equals(id)) {
	cnt++;
	int orderQuantity = goodsQnt.getQuantity() + 1;
	goodsQnt.setQuantity(orderQuantity);
		}
	}
	
	if (cnt == 0) {
		goods.setQuantity(1);
		list.add(goods);
	}
	
	response.sendRedirect("book.jsp?id=" + id);
%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>장바구니</title>
</head>
<body>

</body>
</html>