package org.embed.productService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public interface ProductService {
	
	public void execute(HttpServletRequest req, HttpServletResponse resp);

}
