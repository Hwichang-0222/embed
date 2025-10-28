package org.embed.controller;

import java.io.IOException;

import org.embed.productService.ProductAddService;
import org.embed.productService.ProductDeleteService;
import org.embed.productService.ProductListService;
import org.embed.productService.ProductSearchService;
import org.embed.productService.ProductService;
import org.embed.productService.ProductUpdateRetrieveService;
import org.embed.productService.ProductUpdateService;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("*.doo")
public class ProductController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=utf-8");
      
		String reqURI = req.getRequestURI();
		String contextPath = req.getContextPath();
		String service = reqURI.substring(contextPath.length());
		String nextPage = null;
      
		ProductService pService = null;
		
		if (service.equals("/productList.doo")) {
			pService = new ProductListService();
			pService.execute(req, resp);			
			nextPage = "productList.jsp";
		}
		
		if (service.equals("/productAdd.doo")) {
			nextPage = "productAdd.jsp";
		}
		
		if (service.equals("/productAddUI.doo")) {
			pService = new ProductAddService();
			pService.execute(req, resp);			
			nextPage = "productList.doo";
		}
		
		if (service.equals("/productUpdateRetrieve.doo")) {
			pService = new ProductUpdateRetrieveService();
			pService.execute(req, resp);
			nextPage = "productUpdate.jsp";
		}
		
		if (service.equals("/productUpdateUI.doo")) {
			pService = new ProductUpdateService();
			pService.execute(req, resp);
			nextPage = "productList.doo";
		}
		
		if (service.equals("/productDelete.doo")) {
			pService = new ProductDeleteService();
			pService.execute(req, resp);
			nextPage = "productList.doo";
		}
		
		if (service.equals("/productSearchUI.doo")) {
			pService = new ProductSearchService();
			pService.execute(req, resp);
			nextPage = "productList.jsp";
		}
		
		RequestDispatcher rd = req.getRequestDispatcher(nextPage);
		rd.forward(req, resp);
	}
}
