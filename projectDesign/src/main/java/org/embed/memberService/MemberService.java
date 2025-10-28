package org.embed.memberService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public interface MemberService {
   
   public void execute(HttpServletRequest req, HttpServletResponse resp);
}
