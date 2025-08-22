<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>게시판 목록</title>
    <link rel="stylesheet" type="text/css" href="board.css">
</head>
<body>
    <div class="container">
        <h1>게시판</h1>
        
        <!-- 검색 폼 -->
        <div class="search-section">
            <form action="search.do" method="get" class="search-form">
                <select name="searchName" aria-label="검색 조건">
                    <option value="author">작성자</option>
                    <option value="title">글제목</option>
                </select>
                <input type="text" name="searchValue" placeholder="검색어를 입력하세요" aria-label="검색어">
                <input type="submit" value="검색" class="btn-search">
            </form>
        </div>
        
        <!-- 게시글 목록 -->
        <div class="board-table">
            <table>
                <thead>
                    <tr>
                        <th>번호</th>
                        <th>제목</th>
                        <th>작성자</th>
                        <th>날짜</th>
                        <th>조회수</th>
                    </tr>
                </thead>
                <tbody>
                    <c:choose>
                        <c:when test="${empty list}">
                            <tr>
                                <td colspan="5" class="no-data">등록된 게시글이 없습니다.</td>
                            </tr>
                        </c:when>
                        <c:otherwise>
                            <c:forEach items="${list}" var="dto">
                                <tr>
                                    <td class="text-center">${dto.num}</td>
                                    <td class="title-cell">
                                        <c:forEach begin="1" end="${dto.repIndent}">
                                            <span class="reply-indent">└─</span>
                                        </c:forEach>
                                        <a href="retrieve.do?num=${dto.num}" class="title-link">${dto.title}</a>
                                    </td>
                                    <td class="text-center">${dto.author}</td>
                                    <td class="text-center">${dto.writeday}</td>
                                    <td class="text-center">${dto.readCnt}</td>
                                </tr>
                            </c:forEach>
                        </c:otherwise>
                    </c:choose>
                </tbody>
            </table>
        </div>
        
        <!-- 액션 버튼 -->
        <div class="action-section">
            <a href="writeui.do" class="btn btn-primary">글쓰기</a>
        </div>
    </div>
</body>
</html>