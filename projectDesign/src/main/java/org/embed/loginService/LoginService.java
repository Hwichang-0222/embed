package org.embed.loginService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public interface LoginService {
   
	public void execute(HttpServletRequest req, HttpServletResponse resp);
}
