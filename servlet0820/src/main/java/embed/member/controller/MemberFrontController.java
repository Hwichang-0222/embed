package embed.member.controller;

import java.io.IOException;
import embed.member.dao.MemberDAO;
import embed.member.service.MemberAddService;
import embed.member.service.MemberDeleteService;
import embed.member.service.MemberListService;
import embed.member.service.MemberLoginService;
import embed.member.service.MemberService;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("*.do")
public class MemberFrontController extends HttpServlet {
	private MemberDAO dao = new MemberDAO();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String requestURI = req.getRequestURI();
		String contextPath = req.getContextPath();
		String serv = requestURI.substring(contextPath.length());

		if (serv.equals("/checkId.do")) {
			String id = req.getParameter("id");
			boolean isDuplicate = dao.isUserIdExists(id);

			resp.setContentType("text/plain");
			resp.getWriter().write(String.valueOf(isDuplicate));
			return; // 중복 체크만 하고 종료
	    }
	    // 나머지 GET 요청은 POST로 넘김
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String requestURI = req.getRequestURI();
		String contextPath = req.getContextPath();
		String serv = requestURI.substring(contextPath.length());
		
		MemberService service = null;
		String nextPage = null;
		
		if (serv.equals("/memberList.do")) {
			service = new MemberListService();
			service.execute(req, resp);
			nextPage = "memberList.jsp";
		}
		
		if (serv.equals("/memberAddui.do")) {
			nextPage = "memberAdd.jsp";
		}
		
		if (serv.equals("/memberAdd.do")) {
			service = new MemberAddService();
			service.execute(req, resp);
			nextPage = "memberLoginui.do";
		}
				
		if (serv.equals("/memberDelete.do")) {
			service = new MemberDeleteService();
			service.execute(req, resp);
			nextPage = "memberList.do";
		}
		
		if (serv.equals("/memberLoginui.do")) {
			nextPage = "memberLogin.jsp";
		}
		
		if (serv.equals("/memberLogin.do")) {
			service = new MemberLoginService();
			service.execute(req, resp);
			boolean loginResult = (boolean) req.getAttribute("loginResult");
			String inputId = (String) req.getAttribute("inputId");
			String adminId = "qwer";

			if (loginResult) {
				if (adminId.equals(inputId)) {
		            nextPage = "memberList.do";
		        } else {
		            nextPage = "welcome.jsp";
		        }
			} else {
				nextPage = "memberLoginui.do";
				req.setAttribute("error", "아이디 또는 비밀번호가 틀렸습니다.");
			}
		}
		
		RequestDispatcher dis = req.getRequestDispatcher(nextPage);
		dis.forward(req, resp);
	}
}
