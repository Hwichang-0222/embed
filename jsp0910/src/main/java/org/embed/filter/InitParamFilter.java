package org.embed.filter;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class InitParamFilter implements Filter{
	
	private FilterConfig filterConfig;
	
	@Override
	   public void init(FilterConfig filterConfig) throws ServletException {
	      // TODO Auto-generated method stub
	      System.out.println("Filter02 초기화...");
	      this.filterConfig = filterConfig;
	   }

	   @Override
	   public void doFilter(ServletRequest req, ServletResponse resp, FilterChain filterChain)
	         throws IOException, ServletException {
	      // TODO Auto-generated method stub
	      System.out.println("Filter02.jps 수행...");
	      
	      String id = req.getParameter("id");
	      String pwd = req.getParameter("pwd");
	      
	      String param1 = filterConfig.getInitParameter("param1");
	      String param2 = filterConfig.getInitParameter("param2");
	      
	      String message;
	      
	      resp.setCharacterEncoding("UTF-8");
	      resp.setContentType("text/html; charset=UTF-8");
	      PrintWriter writer = resp.getWriter();
	      
	      if (id.equals(param1) && pwd.equals(param2)) {
	    	  message = "Login Success";
	      } else {
	    	  message = "Login Fail";
	      }
	      
	      writer.println(message);
	      
	      filterChain.doFilter(req, resp);
	   }

	   @Override
	   public void destroy() {
	      // TODO Auto-generated method stub
	      System.out.println("Filter02 해제...");
	   }
	   

}
