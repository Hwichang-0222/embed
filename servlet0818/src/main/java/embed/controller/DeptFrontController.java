package embed.controller;

import java.io.IOException;

import embed.service.DeptDeleteService;
import embed.service.DeptListService;
import embed.service.DeptService;
import embed.service.DeptWriteService;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("*.do")
public class DeptFrontController extends HttpServlet {
	
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
		
/*		System.out.println(requestURI); 
 		System.out.println(contextPath);
		System.out.println(serv);		*/
		
		DeptService service = null;
		String nextPage = null;
		
		if (serv.equals("/list.do")) {
			service = new DeptListService();
			service.execute(req, resp);
			nextPage = "list.jsp";
		}
		
		if (serv.equals("/writeui.do")) {
			nextPage = "write.jsp";
		}
		
		if (serv.equals("/write.do")) {
			service = new DeptWriteService();
			service.execute(req, resp);
			nextPage = "list.do";
		}
		
		if (serv.equals("/deleteui.do")) {
			nextPage = "delete.jsp";
		}
		
		if (serv.equals("/delete.do")) {
			service = new DeptDeleteService();
			service.execute(req, resp);
			nextPage = "list.do";
		}
		
		RequestDispatcher dis = req.getRequestDispatcher(nextPage);
		dis.forward(req, resp);
	}
}
