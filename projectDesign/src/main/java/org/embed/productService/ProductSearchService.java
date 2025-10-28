package org.embed.productService;

import java.util.ArrayList;

import org.embed.dao.ProductDAO;
import org.embed.dto.ProductDTO;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ProductSearchService implements ProductService{
	
	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) {
		// TODO Auto-generated method stub
		
		String search_col = req.getParameter("search_col");
		String search_value = req.getParameter("search_value");
		
		ProductDAO dao = ProductDAO.getInstance();
		ArrayList<ProductDTO> pDto = dao.productSearch(search_col, search_value);
		
		req.setAttribute("productList", pDto);
	
	}

}
