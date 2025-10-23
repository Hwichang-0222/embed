package org.embed.memberService;

import org.embed.dao.MemberDAO;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MemberUpdateService implements MemberService{
	
	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) {
		// TODO Auto-generated method stub
		String id = req.getParameter("id");
		String password = req.getParameter("password");
		String name = req.getParameter("name");
		String gender = req.getParameter("gender");
		String birth = req.getParameter("birth");
		String mail = req.getParameter("mail");
		String phone = req.getParameter("phone");
		String address = req.getParameter("address");
		String regist_day = req.getParameter("regist_day");
		
		MemberDAO dao = new MemberDAO();
		dao.memberUpdate(id, password, name, gender, birth, mail, phone, address, regist_day);
	}

}
