<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="bbs.dto.PageTO" %>

<style>
.pagination {
	text-align: center;
	margin: 20px 0;
	font-family: Arial, sans-serif;
}

.pagination a {
	display: inline-block;
	padding: 8px 12px;
	margin: 0 2px;
	text-decoration: none;
	border: 1px solid #ddd;
	border-radius: 4px;
	color: #007bff;
	background-color: #fff;
	transition: all 0.2s ease;
}

.pagination a:hover {
	background-color: #007bff;
	color: white;
	border-color: #007bff;
}

.pagination .current {
	display: inline-block;
	padding: 8px 12px;
	margin: 0 2px;
	background-color: #007bff;
	color: white;
	border: 1px solid #007bff;
	border-radius: 4px;
	font-weight: bold;
}
</style>

<div class="pagination">
<%
PageTO to = (PageTO)request.getAttribute("page");
int curPage = to.getCurPage();
int perPage = to.getPerPage();
int totalCount = to.getTotalCount();
int totalPage = totalCount / perPage;

if (totalCount % perPage != 0) {
    totalPage++;		
}

for (int i = 1; i <= totalPage; i++) {
    if (curPage == i) {
        out.print("<span class='current'>" + i + "</span>");
    } else {
        out.print("<a href='list.do?curPage=" + i + "'>" + i + "</a>");
    }
}
%>
</div>