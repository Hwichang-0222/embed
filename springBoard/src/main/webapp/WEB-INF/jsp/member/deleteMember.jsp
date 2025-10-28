<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%
    String sessionId = (String) session.getAttribute("sessionId");
%>
<sql:setDataSource var="dataSource"
    url="jdbc:mysql://localhost:3306/embed"
    driver="com.mysql.cj.jdbc.Driver" user="root" password="1111" />

<sql:update dataSource="${dataSource}" var="resultSet">
    DELETE FROM member WHERE id = ?
    <sql:param value="<%=sessionId%>" />
</sql:update>

<c:if test="${resultSet>=1}">
    <%
        // 세션 무효화 (로그아웃)
        session.invalidate();
    %>
    <c:redirect url="/bookmarket/member/resultMember.do" />
</c:if>

<c:if test="${resultSet < 1}">
    <c:redirect url="/bookmarket/member/updateMember.do?error=delete_failed" />
</c:if>