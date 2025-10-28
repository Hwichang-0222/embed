package embed.member.service;

import embed.member.dao.MemberDAO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MemberAddService implements MemberService{
	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) {
		// TODO Auto-generated method stub
		String id = req.getParameter("id");
		String idchk = req.getParameter("idchk");
		String password1 = req.getParameter("password1");
		String password2 =req.getParameter("password2");
		String name = req.getParameter("name");
		String tel = req.getParameter("tel");
		String email = req.getParameter("email");
		String birthday = req.getParameter("birthday");
		String homepage = req.getParameter("homepage");
		String gender = req.getParameter("gender");
		
		MemberDAO dao = new MemberDAO();
		dao.add(id, idchk, password1, password2, name, tel, email, birthday, homepage, gender);
	}
}
