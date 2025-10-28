package org.embed.productService;

import org.embed.dao.ProductDAO;
import org.embed.dto.ProductDTO;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ProductUpdateRetrieveService implements ProductService{
	
	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) {
		// TODO Auto-generated method stub
		
		int num = Integer.parseInt(req.getParameter("num"));
		
		ProductDAO dao = ProductDAO.getInstance();
		ProductDTO pData = dao.productUpdateRetrieve(num);
		req.setAttribute("pData", pData);
	}
}
