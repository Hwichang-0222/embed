<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="bbs.dto.PageTO" %>

<%
    PageTO to = (PageTO)request.getAttribute("page");
    String searchName = request.getParameter("searchName");
    String searchValue = request.getParameter("searchValue");
    boolean isSearch = (searchName != null && searchValue != null && !searchName.isEmpty() && !searchValue.isEmpty());
    String baseUrl = isSearch 
        ? "search.do?searchName=" + searchName + "&searchValue=" + searchValue + "&"
        : "list.do?";
%>

<div class="pagination">
<%
    if (to != null) {
        int curPage = to.getCurPage();
        int perPage = to.getPerPage();
        int totalCount = to.getTotalCount();
        int totalPage = totalCount / perPage;

        if (totalCount % perPage != 0) {
            totalPage++;
        }

        int pageBlock = 10;
        int startPage = ((curPage - 1) / pageBlock) * pageBlock + 1;
        int endPage = startPage + pageBlock - 1;
        if (endPage > totalPage) endPage = totalPage;

        // 맨 처음 페이지
        if (startPage > 1) {
            out.print("<a href='" + baseUrl + "curPage=1' class='page-btn first'>≪</a>");
            out.print("<a href='" + baseUrl + "curPage=" + (startPage - 1) + "' class='page-btn prev'>‹</a>");
        }

        // 페이지 번호
        for (int i = startPage; i <= endPage; i++) {
            if (curPage == i) {
                out.print("<span class='page-btn current'>" + i + "</span>");
            } else {
                out.print("<a href='" + baseUrl + "curPage=" + i + "' class='page-btn'>" + i + "</a>");
            }
        }

        // 다음 페이지 그룹
        if (endPage < totalPage) {
            out.print("<a href='" + baseUrl + "curPage=" + (endPage + 1) + "' class='page-btn next'>›</a>");
            out.print("<a href='" + baseUrl + "curPage=" + totalPage + "' class='page-btn last'>≫</a>");
        }
    }
%>
</div>

<style>
    .pagination {
	display: flex;
	justify-content: center;
    align-items: center;
    gap: 5px;
    margin: 20px 0;
    flex-wrap: wrap;
}

.page-btn {
	display: inline-flex;
    align-items: center;
    justify-content: center;
    min-width: 40px;
    height: 40px;
    padding: 8px 12px;
    text-decoration: none;
    color: #007bff;
    background: #ffffff;
    border: 1px solid #cbd5e0;
    border-radius: 6px;
    transition: all 0.3s ease;
    font-weight: 500;
}

.page-btn:hover {
    background: #e6f0ff;
    border-color: #007bff;
    color: #0056b3;
    transform: translateY(-1px);
}

.page-btn.current {
    background: #007bff;
    color: white;
    border-color: #0056b3;
    font-weight: bold;
    cursor: default;
}

.page-btn.first,
.page-btn.last,
.page-btn.prev,
.page-btn.next {
    font-weight: bold;
    color: #007bff;
}

@media (max-width: 768px) {
    .page-btn {
        min-width: 35px;
        height: 35px;
        padding: 6px 10px;
        font-size: 14px;
    }
}

</style>
