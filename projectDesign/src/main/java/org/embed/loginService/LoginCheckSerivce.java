package org.embed.loginService;

import org.embed.dao.LoginDAO;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class LoginCheckSerivce implements LoginService {

    @Override
    public void execute(HttpServletRequest req, HttpServletResponse resp) {
        String id = req.getParameter("id");
        String password = req.getParameter("password");

        LoginDAO dao = LoginDAO.getInstance();
        boolean success = dao.memberLogin(id, password);

        if (success) {
            HttpSession session = req.getSession();
            session.setAttribute("loginId", id);
        } else {
            req.setAttribute("loginFailMsg", "아이디 또는 비밀번호가 틀렸습니다.");
        }
    }
}

