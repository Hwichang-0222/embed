package embed.test;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//@WebServlet("/hello")
//@WebServlet(name = "myServlet", urlPatterns = {"/aaa", "/bbb"})
@WebServlet("/response")
public class HelloServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("HelloServlet Request");
		
		resp.setContentType("text/html; chatset=utf-8");
		
		PrintWriter out = resp.getWriter();
		out.print("<html><body>");
		out.print("HelloServlet Request Succese");
		out.print("</body></html>");
	}

}
