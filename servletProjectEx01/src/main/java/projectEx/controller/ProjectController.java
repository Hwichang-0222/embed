package projectEx.controller;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("*.do")
public class ProjectController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String requestURI = req.getRequestURI();
		String contextPath = req.getContextPath();
		String serv = requestURI.substring(contextPath.length());
		
		String nextPage = null;
		
		if (serv.equals("/test1.do")) {
			nextPage = "test1.jsp";
		}
		
		if (serv.equals("/test2.do")) {
			nextPage = "/sub/test2.jsp";
		}
		
		RequestDispatcher dis = req.getRequestDispatcher(nextPage);
		dis.forward(req, resp);	
	}
}
