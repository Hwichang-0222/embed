package org.embed.controller;

import java.io.IOException;

import org.embed.noticeService.NoticeDeleteService;
import org.embed.noticeService.NoticeListService;
import org.embed.noticeService.NoticePagingService;
import org.embed.noticeService.NoticeReadService;
import org.embed.noticeService.NoticeSearchService;
import org.embed.noticeService.NoticeService;
import org.embed.noticeService.NoticeUpdateRetrieveService;
import org.embed.noticeService.NoticeUpdateService;
import org.embed.noticeService.NoticeWriteService;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("*.too")
public class NoticeController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=utf-8");
      
		String reqURI = req.getRequestURI();
		String contextPath = req.getContextPath();
		String service = reqURI.substring(contextPath.length());
		String nextPage = null;
		
		NoticeService nService = null;
		
		if (service.equals("/noticeList.too")) {
			nService = new NoticeListService();
			nService.excute(req, resp);
			nextPage = "noticeList.jsp";
		}
		
		if (service.equals("/noticeRead.too")) {
			nService = new NoticeReadService();
			nService.excute(req, resp);
			nextPage = "noticeRead.jsp";
		}
		
		if (service.equals("/noticeAdd.too")) {
			nextPage = "noticeWrite.jsp";
		}
		
		if (service.equals("/noticeWriteUI.too")) {
			nService = new NoticeWriteService();
			nService.excute(req, resp);
			nextPage = "noticeList.too";
		}
		
		if (service.equals("/noticeUpdateRetrieve.too")) {
		    nService = new NoticeUpdateRetrieveService();
		    nService.excute(req, resp);
		    nextPage = "noticeUpdate.jsp";
		}
		
		if (service.equals("/noticeUpdateUI.too")) {
		    nService = new NoticeUpdateService(); // 새로 만들 클래스
		    nService.excute(req, resp);
		    nextPage = "noticeRead.too"; // 수정 후 목록으로 리디렉션
		}
		
		if (service.equals("/noticeDelete.too")) {
		    nService = new NoticeDeleteService();
		    nService.excute(req, resp);
		    nextPage = "noticeListPage.too"; // 삭제 후 목록으로 이동
		}
				
		if (service.equals("/noticeListPage.too")) {
		    nService = new NoticePagingService(); // 새로 만들 서비스
		    nService.excute(req, resp);
		    nextPage = "noticeListPage.jsp";
		}
		
		if (service.equals("/noticeSearch.too")) {
		    nService = new NoticeSearchService();
		    nService.excute(req, resp);
		    nextPage = "noticeListPage.jsp"; // 또는 별도 검색 결과 페이지
		}

		
		
		if (nextPage != null) {
		    RequestDispatcher rd = req.getRequestDispatcher(nextPage);
		    rd.forward(req, resp);
		} else {
		    resp.sendError(HttpServletResponse.SC_NOT_FOUND);
		}
	}

}
