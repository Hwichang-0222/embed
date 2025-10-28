package dept.controller;

import java.io.IOException;
import dept.service.DeptListService;
import dept.service.DeptService;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("*.do")
public class DeptController extends HttpServlet {
	
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
		
		DeptService service = null;
		String nextPage = null;
		
		if (serv.equals("/deptlist.do")) {
			service = new DeptListService();
			service.execute(req, resp);
			nextPage = "deptlist.jsp";
		}
		
		RequestDispatcher dis = req.getRequestDispatcher(nextPage);
		dis.forward(req, resp);	
	}
}
