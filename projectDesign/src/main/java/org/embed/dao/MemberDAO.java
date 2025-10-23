package org.embed.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import org.embed.dto.MemberDTO;

public class MemberDAO {
   
	DataSource dataFactory;
   
	public MemberDAO() {
		// TODO Auto-generated constructor stub
		try {
			Context ctx = new InitialContext();
			dataFactory = (DataSource)ctx.lookup("java:comp/env/jdbc/MySQL80");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
   
	public ArrayList<MemberDTO> memberList() {
      
		ArrayList<MemberDTO> list = new ArrayList<MemberDTO>();
		Connection conn= null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
      
		try {
			conn = dataFactory.getConnection();
			String query = "SELECT * FROM member ORDER BY regist_day DESC";
         
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
         
			while (rs.next()) {
            
				MemberDTO mData = new MemberDTO();
				mData.setId(rs.getString("id"));
				mData.setPassword(rs.getString("password"));   
				mData.setName(rs.getString("name"));   
				mData.setGender(rs.getString("gender"));   
				mData.setBirth(rs.getString("birth"));   
				mData.setMail(rs.getString("mail"));   
				mData.setPhone(rs.getString("phone"));   
				mData.setAddress(rs.getString("address"));   
				mData.setRegist_day(rs.getString("regist_day"));
            
				list.add(mData);
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
	
	public void memberWrite (String _id, String _password, String _name, String _gender, 
			String _birth, String _mail, String _phone, String _address, String _regist_day) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = dataFactory.getConnection();
			String query = "INSERT INTO member(id, password, name, gender, birth, mail, phone, address, regist_day) "
					+ "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, _id);
			pstmt.setString(2, _password);
			pstmt.setString(3, _name);
			pstmt.setString(4, _gender);
			pstmt.setString(5, _birth);
			pstmt.setString(6, _mail);
			pstmt.setString(7, _phone);
			pstmt.setString(8, _address);
			pstmt.setString(9, _regist_day);
			
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
	
	public MemberDTO memberUpdateRetrieve(String _id) {
		
		MemberDTO mData = new MemberDTO();
		Connection conn= null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
      
		try {
			conn = dataFactory.getConnection();
			String query = "SELECT * FROM member WHERE id = ?";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, _id);
			rs = pstmt.executeQuery();
         
			if (rs.next()) {
            	mData.setId(rs.getString("id"));
				mData.setPassword(rs.getString("password"));   
				mData.setName(rs.getString("name"));   
				mData.setGender(rs.getString("gender"));   
				mData.setBirth(rs.getString("birth"));   
				mData.setMail(rs.getString("mail"));   
				mData.setPhone(rs.getString("phone"));   
				mData.setAddress(rs.getString("address"));   
				mData.setRegist_day(rs.getString("regist_day"));
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
		return mData;
	}
	
	public void memberUpdate (String _id, String _password, String _name, String _gender, 
			String _birth, String _mail, String _phone, String _address, String _regist_day) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = dataFactory.getConnection();
			String query = "UPDATE member SET password = ?, name = ?, gender = ?, "
					+ "birth = ?, mail = ?, phone = ?, address = ?, regist_day = ? "
					+ "WHERE id = ?";
			
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, _password);
			pstmt.setString(2, _name);
			pstmt.setString(3, _gender);
			pstmt.setString(4, _birth);
			pstmt.setString(5, _mail);
			pstmt.setString(6, _phone);
			pstmt.setString(7, _address);
			pstmt.setString(8, _regist_day);
			pstmt.setString(9, _id);

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
	
	public void memberDelete (String _id) {
		
		Connection conn= null;
		PreparedStatement pstmt = null;
      
		try {
			conn = dataFactory.getConnection();
			String query = "DELETE FROM member WHERE id = ?";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, _id);
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
	
}
