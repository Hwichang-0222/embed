<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>학생 정보 삭제</title>
</head>
<body>
	<sql:setDataSource var="db" 
	    driver="com.mysql.cj.jdbc.Driver"
	    url="jdbc:mysql://localhost:3306/question"
	    user="root"
	    password="1111" />

	<sql:update dataSource="${db}">
	    DELETE FROM student WHERE depart = ?
	    <sql:param value="${param.depart}" />
	</sql:update>

	<h3>입력이 완료되었습니다!</h3>
	
	<sql:query var="rs" dataSource="${db}">
	    SELECT * FROM student
	</sql:query>
	
	<table border="1" cellpadding="5">
	    <tr>
	        <th>학번</th>
	        <th>학과</th>
	        <th>이름</th>
	        <th>주소</th>
	        <th>연락처</th>
	    </tr>
	    <c:forEach var="row" items="${rs.rows}">
	        <tr>
	            <td>${row.num}</td>
	            <td>${row.depart}</td>
	            <td>${row.name}</td>
	            <td>${row.address}</td>
	            <td>${row.phone}</td>
	        </tr>
	    </c:forEach>
</table>
</body>
</html>
