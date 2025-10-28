<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.*, org.embed.dto.BookDTO" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>장바구니</title>
    <link rel="stylesheet" href="/css/bootstrap.min.css" />
</head>
<body>
    <div class="container py-4">

        <!-- 상단 메뉴 -->
        <jsp:include page="/bookmarket/menu.do" />

        <!-- 페이지 타이틀 -->
        <div class="p-5 mb-4 bg-body-tertiary rounded-3">
            <div class="container-fluid py-5">
                <h1 class="display-5 fw-bold">장바구니</h1>
                <p class="col-md-8 fs-4">Cart</p>
            </div>
        </div>

        <%
            String cartId = session.getId();
            @SuppressWarnings("unchecked")
            List<BookDTO> cartList = (List<BookDTO>) session.getAttribute("cartlist");
            if (cartList == null) {
                cartList = new ArrayList<BookDTO>();
            }
        %>

        <div class="row align-items-md-stretch">

            <%
                if (cartList.isEmpty()) {
            %>
                <!-- 장바구니 비어있을 때 -->
                <div class="col-md-12">
                    <div class="alert alert-info text-center">
                        <h4>장바구니가 비어있습니다</h4>
                        <p>
                            <a href="/bookmarket/books.do" class="btn btn-primary">
                                도서 목록 보기
                            </a>
                        </p>
                    </div>
                </div>
            <%
                } else {
            %>

                <!-- 장바구니 비우기 / 주문 버튼 -->
                <div class="row mb-4">
                    <div class="col-6 text-start">
                        <a href="/bookmarket/deleteCart.do"
                           class="btn btn-danger"
                           onclick="return confirm('장바구니를 비우시겠습니까?')">
                            장바구니 비우기
                        </a>
                    </div>
                    <div class="col-6 text-end">
                        <a href="/bookmarket/shippingInfo.do?cartId=<%=cartId%>"
                           class="btn btn-success">
                            주문하기
                        </a>
                    </div>
                </div>

                <!-- 장바구니 목록 테이블 -->
                <table class="table table-hover">
                    <thead class="table-light">
                        <tr class="text-center">
                            <th>도서</th>
                            <th>가격</th>
                            <th>수량</th>
                            <th>소계</th>
                            <th>비고</th>
                        </tr>
                    </thead>
                    <tbody>
                        <%
                            int sum = 0;
                            for (BookDTO book : cartList) {
                                int total = book.getUnitPrice() * book.getQuantity();
                                sum += total;
                        %>
                        <tr class="text-center">
                            <td><%=book.getBookId()%> - <%=book.getName()%></td>
                            <td><%=String.format("%,d", book.getUnitPrice())%>원</td>
                            <td><%=book.getQuantity()%></td>
                            <td><%=String.format("%,d", total)%>원</td>
                            <td>
                                <form action="/bookmarket/removeCart.do" method="post" style="display:inline;">
                                    <input type="hidden" name="id" value="<%=book.getBookId()%>">
                                    <button class="btn btn-sm btn-danger">삭제</button>
                                </form>
                            </td>
                        </tr>
                        <%
                            }
                        %>
                    </tbody>
                    <tfoot>
                        <tr class="table-active text-center">
                            <th colspan="3" class="text-end">총액</th>
                            <th class="text-danger"><%=String.format("%,d", sum)%>원</th>
                            <th></th>
                        </tr>
                    </tfoot>
                </table>

                <!-- 하단 버튼 -->
                <div class="d-flex justify-content-between mt-4">
                    <a href="/bookmarket/books.do" class="btn btn-secondary">
                        &laquo; 쇼핑 계속하기
                    </a>
                    <a href="/bookmarket/shippingInfo.do?cartId=<%=cartId%>" class="btn btn-success btn-lg">
                        주문하기 &raquo;
                    </a>
                </div>

            <%
                } // else
            %>

        </div>

        <!-- 하단 푸터 -->
        <jsp:include page="/bookmarket/footer.do" />

    </div>
</body>
</html>
