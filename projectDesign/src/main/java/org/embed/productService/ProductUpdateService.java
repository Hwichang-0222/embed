package org.embed.productService;

import org.embed.dao.ProductDAO;
import org.embed.dto.ProductDTO;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ProductUpdateService implements ProductService{
	
	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) {
		// TODO Auto-generated method stub
		
		ProductDTO dto = new ProductDTO(); 
		
		dto.setNum(Integer.parseInt(req.getParameter("num")));
		dto.setPrice(Integer.parseInt(req.getParameter("price")));
		dto.setAmount(Integer.parseInt(req.getParameter("amount")));
		
		ProductDAO dao = ProductDAO.getInstance();
		dao.productUpdate(dto);
	}

}
