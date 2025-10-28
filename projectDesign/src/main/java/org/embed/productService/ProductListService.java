package org.embed.productService;

import java.util.ArrayList;

import org.embed.dao.ProductDAO;
import org.embed.dto.ProductDTO;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ProductListService implements ProductService{
	
	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) {
		// TODO Auto-generated method stub
		
		ProductDAO dao = ProductDAO.getInstance();
		ArrayList<ProductDTO> list = dao.productList();
		
		req.setAttribute("productList", list);
		
	}

}
