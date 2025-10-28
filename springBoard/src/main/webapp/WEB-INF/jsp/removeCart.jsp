<%@page import="java.util.ArrayList"%>
<%@page import="org.embed.dto.BookDTO"%>
<%@page import="org.embed.dao.BookRepository"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String id = request.getParameter("id");
	if(id==null || id.trim().equals("")) {
		response.sendRedirect("books.jsp");
		return;
	}
   
	BookRepository dao = BookRepository.getInstance();
   
	BookDTO book = dao.getBookbyId(id);
	if(book == null) {
		response.sendRedirect("exceptionNoBookId.jsp");
	}
   
	ArrayList<BookDTO> cartList = (ArrayList<BookDTO>) session.getAttribute("cartlist");
	BookDTO goodsQnt = new BookDTO();
	for(int i = 0; i < cartList.size(); i++) {
		goodsQnt=cartList.get(i);
		if(goodsQnt.getBookId().equals(id)) {
	cartList.remove(goodsQnt);
		}
	}
   
	response.sendRedirect("cart.jsp");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>