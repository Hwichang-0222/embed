package embed.member.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import embed.member.entity.MemberDTO;

public class MemberDAO {
	
	String driver = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/embed";	//오라클 포트번호 : 1521
	String user = "root";
	String pwd = "1111";
	
	public MemberDAO() {
		try {
			Class.forName(driver);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//회원 리스트
	public ArrayList<MemberDTO> memberList() {
		
		ArrayList<MemberDTO> memberList = new ArrayList<MemberDTO>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, pwd);
			String query = "SELECT * FROM member";
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				String id = rs.getString("id");
				String idchk = rs.getString("idchk");
				String password1 = rs.getString("password1");
				String password2 = rs.getString("password2");
				String name = rs.getString("name");
				String tel = rs.getString("tel");
				String email = rs.getString("email");
				String birthday = rs.getString("birthday");
				String homepage = rs.getString("homepage");
				String gender = rs.getString("gender");
				
				MemberDTO dto = new MemberDTO(id, idchk, password1, password2, name, tel, email, birthday, homepage, gender);
								
				memberList.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) rs.close();
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return memberList;
	}
	
	//회원추가
	public void add(String _id, String _idchk, String _password1, 
			String _password2, String _name, String _tel, 
			String _email, String _birthday, String _homepage, String _gender) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, pwd);
			String query = "INSERT INTO member VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, _id);
			pstmt.setString(2, _idchk);
			pstmt.setString(3, _password1);
			pstmt.setString(4, _password2);
			pstmt.setString(5, _name);
			pstmt.setString(6, _tel);
			pstmt.setString(7, _email);
			pstmt.setString(8, _birthday);
			pstmt.setString(9, _homepage);
			pstmt.setString(10, _gender);
			int n = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	//아이디 중복체크 버튼
	public boolean isUserIdExists(String userId) {
		
		boolean exists = false;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, pwd);
			String query = "SELECT COUNT(*) FROM member WHERE id = ?";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, userId);
			
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				exists = rs.getInt(1) > 0;
			}

		} catch (Exception e) {
				e.printStackTrace();
		} finally {
			try {
				if (rs != null) rs.close();
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
        return exists;
    }
	
	//회원 삭제
	public void delete(String _id) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, pwd);
			String query = "DELETE FROM member WHERE id = ?";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, _id);
			int m = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	//로그인
	public boolean login(String _id, String _password) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		boolean exists = false;

		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, pwd);

			String query = "SELECT COUNT(*) FROM member WHERE id = ? AND password1 = ?";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, _id);
			pstmt.setString(2, _password);
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				int count = rs.getInt(1); // 첫 번째 컬럼의 값 가져오
				System.out.println("조회된 count: " + count);
			    if (count > 0) {
			    	System.out.println("login success");
			    	exists = true;
			    } else {
			    	System.out.println("login failed");
			    	exists = false;
			    }				
			}
			
		} catch (Exception e) {
				e.printStackTrace();
		} finally {
			try {
				if (rs != null) rs.close();
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return exists;
	}
}
