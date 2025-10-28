package embed.controller;

import java.io.IOException;

import embed.service.EmpDeleteService;
import embed.service.EmpListService;
import embed.service.EmpService;
import embed.service.EmpWriteService;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("*.co")
public class EmpFrontController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String reqURI = req.getRequestURI();
		String contextPath = req.getContextPath();
		String serv = reqURI.substring(contextPath.length());
		
		EmpService service = null;
		String nextPage = null;
		
		if (serv.equals("/emplist.co")) {
			service = new EmpListService();
			service.execute(req, resp);
			nextPage = "emplist.jsp";
		}
		
		if (serv.equals("/empwriteui.co")) {
			nextPage = "empwrite.jsp";
		}
		
		if (serv.equals("/empwrite.co")) {
			service = new EmpWriteService();
			service.execute(req, resp);
			nextPage = "emplist.co";
		}
		
		if (serv.equals("/empdeleteui.co")) {
			nextPage = "empdelete.jsp";
		}
		
		if (serv.equals("/empdelete.co")) {
			service = new EmpDeleteService();
			service.execute(req, resp);
			nextPage = "emplist.co";
		}
		
		RequestDispatcher dis = req.getRequestDispatcher(nextPage);
		dis.forward(req, resp);	
	}
}
