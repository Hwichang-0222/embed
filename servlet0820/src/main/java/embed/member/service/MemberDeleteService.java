package embed.member.service;

import embed.member.dao.MemberDAO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MemberDeleteService implements MemberService {
	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) {
		// TODO Auto-generated method stub
		String id = req.getParameter("id2");
		
		MemberDAO dao = new MemberDAO();
		dao.delete(id);
	}
}
