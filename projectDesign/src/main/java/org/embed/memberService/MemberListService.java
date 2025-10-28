package org.embed.memberService;

import java.util.ArrayList;

import org.embed.dao.MemberDAO;
import org.embed.dto.MemberDTO;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MemberListService implements MemberService {

   @Override
   public void execute(HttpServletRequest req, HttpServletResponse resp) {
      // TODO Auto-generated method stub
      MemberDAO dao = new MemberDAO();
      ArrayList<MemberDTO> list = dao.memberList();
      
      req.setAttribute("memberList", list);
   }
}