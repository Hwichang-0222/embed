package org.ex388;

public class HttpServletRunEx {

	public static void main(String[] args) {
		method(new LoginServlet());
		method(new FileDownloadSerblet());

	}
	
	public static void method(HttpServlet servlet) {
		servlet.service();		
	}
}
