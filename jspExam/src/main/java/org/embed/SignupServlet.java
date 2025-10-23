package org.embed;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/SignupServlet")
public class SignupServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=utf-8");
		
		String userId = req.getParameter("userId");
		String password = req.getParameter("password");
		String passwordConfirm = req.getParameter("passwordConfirm");
		String name = req.getParameter("name");
		
		PrintWriter out = resp.getWriter();
		
		out.println("아이디 : " + userId + "\n");
		out.println("패스워드 : " + password + "\n");
		out.println("패스워드(확인) : " + passwordConfirm + "\n");
		out.println("이름 : " + name + "\n");
		
	}

}
