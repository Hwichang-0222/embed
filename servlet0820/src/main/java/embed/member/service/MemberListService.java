package embed.member.service;

import java.util.ArrayList;
import embed.member.dao.MemberDAO;
import embed.member.entity.MemberDTO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MemberListService implements MemberService{
	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) {
		// TODO Auto-generated method stub
		MemberDAO dao = new MemberDAO();
		ArrayList<MemberDTO> memberList = dao.memberList();
		req.setAttribute("memberList", memberList);
	}
}
