<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert</title>
</head>
<body>
	 <%
	 	String num = request.getParameter("num");
	 	String depart = request.getParameter("depart");
	 	String name = request.getParameter("name");
	 	String address = request.getParameter("address");
	 	String phone = request.getParameter("phone");
	 		
	 
	    Connection conn = null;
	    PreparedStatement pstmt = null;
	    ResultSet rs = null;
	    	
	    try {
	    	
	    	Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/bbs";
			String user="root";
			String password="1111";
				
			conn = DriverManager.getConnection(url, user, password);
				
   		    String sql = "INSERT INTO student (num, depart, name, address, phone) VALUES (?, ?, ?, ?, ?)";
   		    pstmt = conn.prepareStatement(sql);
   		    pstmt.setInt(1, Integer.parseInt(num));
   		    pstmt.setString(2, depart);
   			pstmt.setString(3, name);
   			pstmt.setString(4, address);
   			pstmt.setString(5, phone);
   			
   			int n = pstmt.executeUpdate();
   			
			if (n > 0) {
				out.println("<p>✅ 학생 정보가 성공적으로 등록되었습니다.</p>");
			} else {
				out.println("<p>❌ 등록에 실패했습니다.</p>");
			}
			
	    } catch (Exception e) {
	    		out.println("<tr><td colspan='5'>에러 발생: " + e.getMessage() + "</td></tr>");
	   	} finally {
			try { if (rs != null) rs.close(); } catch (Exception e) {}
			try { if (pstmt != null) pstmt.close(); } catch (Exception e) {}
			try { if (conn != null) conn.close(); } catch (Exception e) {}
	   	}
   	%>

</body>
</html>