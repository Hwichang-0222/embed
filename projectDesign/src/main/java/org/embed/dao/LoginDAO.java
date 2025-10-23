package org.embed.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.sql.DataSource;

import org.embed.db.DBConnection;


public class LoginDAO {
	   
	DataSource dataFactory;
	
	private static LoginDAO instance;
	
	private LoginDAO() {
		// TODO Auto-generated constructor stub
	}

	public static LoginDAO getInstance() {
		if (instance == null)
			instance = new LoginDAO();
		return instance;
	}	
	
	public boolean memberLogin (String _id, String _password) {
		
		Connection conn= null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		boolean loginValue = false;
		
		try {
			conn = DBConnection.getConnection();
			String query = "SELECT * FROM member WHERE id = ?";
	        
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, _id);
			rs = pstmt.executeQuery();

			if (rs.next()) { 
				if (rs.getString("password").equals(_password)) {
					loginValue = true;
					return loginValue;
				}
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
		return loginValue;
	}
		
}