package org.embed.memberService;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/member")
public class MemberServlet extends HttpServlet {

   private static final long serialVersionUID = 1L;
   
   @Override
   protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      // TODO Auto-generated method stub
      doPost(req, resp);
   }
   
   @Override
   protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      // TODO Auto-generated method stub
      req.setCharacterEncoding("UTF-8");
      
      Enumeration<String> nameValues = req.getParameterNames();
      resp.setContentType("text/html; charset=utf-8");
      PrintWriter out = resp.getWriter();
      
      out.print("<html><body>");
         while (nameValues.hasMoreElements()) {
            String name = nameValues.nextElement();
            String value = req.getParameter(name);
            out.print(name + " : " + value + "<br>");
         }
      
      out.print("</body></html>");
   }
}
