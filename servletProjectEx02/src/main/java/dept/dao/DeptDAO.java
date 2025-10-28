package dept.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import dept.dto.DeptDTO;

public class DeptDAO {
	
DataSource dataFactory;
	
	public DeptDAO() {
		// TODO Auto-generated constructor stub
		try {
			Context ctx = new InitialContext();
			dataFactory = (DataSource) ctx.lookup("java:comp/env/jdbc/MySQL80");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public ArrayList<DeptDTO> list() {
		
		ArrayList<DeptDTO> list = new ArrayList<DeptDTO>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = dataFactory.getConnection();
			String query = "SELECT * FROM dept";
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				int deptno = rs.getInt("deptno");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
				
				DeptDTO dto = new DeptDTO(deptno, dname, loc);
								
				list.add(dto);
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
		return list;
	}
}
