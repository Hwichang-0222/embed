package org.embed.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import org.embed.db.DBConnection;
import org.embed.dto.ProductDTO;

public class ProductDAO {
	
	private static ProductDAO instance;
	
	private ProductDAO() {
		// TODO Auto-generated constructor stub
	}
	
	public static ProductDAO getInstance() {
		if (instance == null)
			instance = new ProductDAO();
		return instance;
	}	
   
	public ArrayList<ProductDTO> productList() {
      
		ArrayList<ProductDTO> list = new ArrayList<ProductDTO>();
		Connection conn= null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
      
		try {
			conn = DBConnection.getConnection();
			String query = "SELECT * FROM product";
         
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
         
			while (rs.next()) {
            
				ProductDTO pData = new ProductDTO();
				pData.setNum(rs.getInt("num"));
				pData.setName(rs.getString("name"));
				pData.setPrice(rs.getInt("price"));
				pData.setAmount(rs.getInt("amount"));
            
				list.add(pData);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				if(rs !=null) rs.close();
				if(pstmt !=null) pstmt.close();
				if(conn !=null) conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		return list;
	}
	
	public void productAdd(ProductDTO dto) {
		
		Connection conn= null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DBConnection.getConnection();
			String query = "INSERT INTO product(name, price, amount) "
					+ "VALUES(?, ?, ?)";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, dto.getName());
			pstmt.setInt(2, dto.getPrice());
			pstmt.setInt(3, dto.getAmount());
			
			int n = pstmt.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				if(pstmt !=null) pstmt.close();
				if(conn !=null) conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
	}
	
	public ProductDTO productUpdateRetrieve (int _num) {
		
		ProductDTO pData = new ProductDTO();
		Connection conn= null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
      
		try {
			conn = DBConnection.getConnection();
			String query = "SELECT * FROM product WHERE num = ?";
         	pstmt = conn.prepareStatement(query);
         	pstmt.setInt(1, _num);
			rs = pstmt.executeQuery();
         
			if (rs.next()) {
            	pData.setNum(rs.getInt("num"));
				pData.setName(rs.getString("name"));
				pData.setPrice(rs.getInt("price"));
				pData.setAmount(rs.getInt("amount"));
            
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				if(rs !=null) rs.close();
				if(pstmt !=null) pstmt.close();
				if(conn !=null) conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		
		return pData;
	}
	
	public void productUpdate(ProductDTO dto) {
		
		Connection conn= null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DBConnection.getConnection();
			String query = "UPDATE product SET price = ?, amount = ? WHERE num = ?";
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, dto.getPrice());
			pstmt.setInt(2, dto.getAmount());
			pstmt.setInt(3, dto.getNum());
			
			int n = pstmt.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				if(pstmt !=null) pstmt.close();
				if(conn !=null) conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
	}
	
	public void productDelete (int _num) {
		
		Connection conn= null;
		PreparedStatement pstmt = null;
      
		try {
			conn = DBConnection.getConnection();
			String query = "DELETE FROM product WHERE num = ?";
         	pstmt = conn.prepareStatement(query);
         	pstmt.setInt(1, _num);
         
         	int n = pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				if(pstmt !=null) pstmt.close();
				if(conn !=null) conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
	}
	
	public ArrayList<ProductDTO> productSearch (String _search_col, String _search_value) {
		
		ArrayList<ProductDTO> list = new ArrayList<ProductDTO>();
		Connection conn= null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
      
		try {
			conn = DBConnection.getConnection();
			String query = "SELECT * FROM product ";
         	
         	
         	if (_search_col.equals("search_num"))
         		query += "WHERE num LIKE ?";
         	else if (_search_col.equals("search_name"))
         		query += "WHERE name LIKE ?";
         	
         	pstmt = conn.prepareStatement(query);
         	pstmt.setString(1, "%" +  _search_value + "%");
			rs = pstmt.executeQuery();
         
			while (rs.next()) {
				ProductDTO pData = new ProductDTO();
            	pData.setNum(rs.getInt("num"));
				pData.setName(rs.getString("name"));
				pData.setPrice(rs.getInt("price"));
				pData.setAmount(rs.getInt("amount"));
				
				list.add(pData);
            
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				if(rs !=null) rs.close();
				if(pstmt !=null) pstmt.close();
				if(conn !=null) conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		
		return list;
	}

}
