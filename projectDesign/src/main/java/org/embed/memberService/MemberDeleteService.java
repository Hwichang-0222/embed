package org.embed.memberService;

import org.embed.dao.MemberDAO;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MemberDeleteService implements MemberService{
	
	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) {
		// TODO Auto-generated method stub
		String id = req.getParameter("id");
		
		MemberDAO dao = new MemberDAO();
		dao.memberDelete(id);
		
	}
}

