<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Delete</title>
</head>
<body>
	 <%
	 	String depart = request.getParameter("depart");
	 		
	 
	    Connection conn = null;
	    PreparedStatement pstmt = null;
	    ResultSet rs = null;
	    	
	    try {
	    	
	    	Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/bbs";
			String user="root";
			String password="1111";
				
			conn = DriverManager.getConnection(url, user, password);
				
   		    String sql = "DELETE FROM student WHERE depart = ?";
   		    pstmt = conn.prepareStatement(sql);
   		    pstmt.setString(1, depart);
   			
   			int n = pstmt.executeUpdate();
   			
			if (n > 0) {
				out.println("<p>✅ 학생 정보가 성공적으로 삭제되었습니다.</p>");
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