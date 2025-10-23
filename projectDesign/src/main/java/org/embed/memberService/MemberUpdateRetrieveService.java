package org.embed.memberService;

import org.embed.dao.MemberDAO;
import org.embed.dto.MemberDTO;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MemberUpdateRetrieveService implements MemberService{
	
	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) {
		// TODO Auto-generated method stub
		String id = req.getParameter("id");
		
		MemberDAO dao = new MemberDAO();
		MemberDTO mData = dao.memberUpdateRetrieve(id);
		req.setAttribute("mData", mData);
	}
}
