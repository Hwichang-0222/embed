<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    String id = request.getParameter("id");
    String pw = request.getParameter("pw");

    if(id.equals("admin") && pw.equals("1234")) {
        session.setAttribute("userID", id);

        response.sendRedirect("welcome.jsp");
    } else {
        out.println("<script>alert('로그인 실패!'); history.back();</script>");
    }
%>
