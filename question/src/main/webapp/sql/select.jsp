<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>학생 정보</title>
</head>
<body>
	<table border="1" cellpadding="5">
	    <tr>
	        <th>학번</th>
	        <th>학과</th>
	        <th>이름</th>
	        <th>주소</th>
	        <th>연락처</th>
	    </tr>
	    
	    <%
	    	Connection conn = null;
	    	PreparedStatement pstmt = null;
	    	ResultSet rs = null;
	    	
	    	try {
	    		
	    		Class.forName("com.mysql.cj.jdbc.Driver");
				String url="jdbc:mysql://localhost:3306/bbs";
				String user="root";
				String password="1111";
				
				conn = DriverManager.getConnection(url, user, password);
				
   			    String sql = "SELECT * FROM student";
   			    pstmt = conn.prepareStatement(sql);
   			    rs = pstmt.executeQuery();
   			    
   			    while (rs.next()) {
   		%>
   		
   		<tr>
			<td><%=rs.getInt("num") %></td>
			<td><%=rs.getString("depart") %></td>
			<td><%=rs.getString("name") %></td>
			<td><%=rs.getString("address") %></td>
			<td><%=rs.getString("phone") %></td>
		</tr>
   		   		
   		<%
   			    }
	    	} catch (Exception e) {
	    		out.println("<tr><td colspan='5'>에러 발생: " + e.getMessage() + "</td></tr>");
	    	} finally {
	    		try { if (rs != null) rs.close(); } catch (Exception e) {}
	            try { if (pstmt != null) pstmt.close(); } catch (Exception e) {}
	            try { if (conn != null) conn.close(); } catch (Exception e) {}
	    	}
	    
	    %>
</table>
</body>
</html>
