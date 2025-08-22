package embed.member.service;

import embed.member.dao.MemberDAO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MemberLoginService implements MemberService {
	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) {
		// TODO Auto-generated method stub
		String id = req.getParameter("id");
		String password = req.getParameter("password1");
		boolean exists = false;
		System.out.println("입력된 ID: " + id);
		System.out.println("입력된 PW: " + password);

		MemberDAO dao = new MemberDAO();
		exists = dao.login(id, password);
		
		req.setAttribute("loginResult", exists);
		req.setAttribute("inputId", id);
	}
}
