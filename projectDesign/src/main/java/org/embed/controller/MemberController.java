package org.embed.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import org.embed.memberService.MemberDeleteService;
import org.embed.memberService.MemberListService;
import org.embed.memberService.MemberService;
import org.embed.memberService.MemberUpdateRetrieveService;
import org.embed.memberService.MemberUpdateService;
import org.embed.memberService.MemberWriteSerivce;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("*.do")
public class MemberController extends HttpServlet {

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
      
		MemberService mService = null;
      
		//System.out.println(service);
      
		if (service.equals("/memberUI.do")) {
			nextPage = "memberForm.jsp";
		}
      
		if (service.equals("/member.do")) {
			try {
				requestNames(req, resp);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
      
		if (service.equals("/memberList.do")) {
			mService = new MemberListService();
			mService.execute(req, resp);
			nextPage = "memberList.jsp";
		}
      
		if (service.equals("/mWriteUI.do")) {
			nextPage = "memberUI.jsp";
		}
		
		if (service.equals("/mMember.do")) {
			mService = new MemberWriteSerivce();
			mService.execute(req, resp);
			nextPage = "index.ddo";
		}
		
		if (service.equals("/mUpdateUI.do")) {
			mService = new MemberUpdateRetrieveService();
			mService.execute(req, resp);
			nextPage = "memberUpdateUI.jsp";
		}
		
		if (service.equals("/mUpdate.do")) {
			mService = new MemberUpdateService();
			mService.execute(req, resp);
			nextPage = "memberList.do";
		}
		
		if (service.equals("/mDeleteUI.do")) {
			mService = new MemberDeleteService();
			mService.execute(req, resp);
			nextPage = "memberList.do";
		}
		
      
		RequestDispatcher rd = req.getRequestDispatcher(nextPage);
		rd.forward(req, resp);
	}
   
	public void requestNames(HttpServletRequest req, HttpServletResponse resp) throws Exception {
      
		Enumeration<String> nameValues = req.getParameterNames();
		PrintWriter out = resp.getWriter();
      
		out.print("<html><body>");
		while (nameValues.hasMoreElements()) {
			String name = nameValues.nextElement();
			String value = req.getParameter(name);
			out.print(name + " : " + value + "<br>");
		}
      
		out.print("</body></html>");
	}
	
}
