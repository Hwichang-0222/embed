package org.embed.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import org.embed.loginService.LoginCheckSerivce;
import org.embed.loginService.LoginService;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("*.ddo")
public class LoginController extends HttpServlet {

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
		
		LoginService lService = null;
		
		if (service.equals("/index.ddo")) {
			nextPage = "index.jsp";
		}
				
		if (service.equals("/loginUI.ddo")) {
			nextPage = "loginUI.jsp";
		}
		
		if (service.equals("/login.ddo")) {
			lService = new LoginCheckSerivce();
			lService.execute(req, resp);
			
			if (req.getSession().getAttribute("loginId") != null) {
				nextPage = "index.ddo";
		    } else {
		        nextPage = "loginUI.jsp";
		    }
		}
		
		if (service.equals("/logOut.ddo")) {
		    req.getSession().invalidate(); // 세션 초기화
		    nextPage = "index.ddo";
		}
      
		RequestDispatcher rd = req.getRequestDispatcher(nextPage);
		rd.forward(req, resp);
	}
}
