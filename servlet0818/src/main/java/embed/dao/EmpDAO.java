package embed.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import embed.entity.EmpDTO;


public class EmpDAO {
	
	String driver = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/embed";	//오라클 포트번호 : 1521
	String user = "root";
	String pwd = "1111";
	
	public EmpDAO() {
		try {
			Class.forName(driver);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<EmpDTO> empList() {
		
		ArrayList<EmpDTO> empList = new ArrayList<EmpDTO>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, pwd);
			String query = "SELECT * FROM Emp";
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				int mgr = rs.getInt("mgr");
				String hiredate = rs.getString("hiredate");
				int sal = rs.getInt("sal");
				int comm = rs.getInt("comm");
				int deptno = rs.getInt("deptno");
				
				EmpDTO dto = new EmpDTO();
				
				dto.setEmpno(empno);
				dto.setEname(ename);
				dto.setJob(job);
				dto.setMgr(mgr);
				dto.setHiredate(hiredate);
				dto.setSal(sal);
				dto.setComm(comm);
				dto.setDeptno(deptno);
				
				empList.add(dto);
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
		return empList;
	}
	
	public void write(String _empno, String _ename,
			String _job, String _mgr, String _hiredate,
			String _sal, String _comm, String _deptno) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, pwd);
			String query = "INSERT INTO emp VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, Integer.parseInt(_empno));
			pstmt.setString(2, _ename);
			pstmt.setString(3, _job);
			pstmt.setInt(4, Integer.parseInt(_mgr));
			pstmt.setString(5, _hiredate);
			pstmt.setInt(6, Integer.parseInt(_sal));
			pstmt.setInt(7, Integer.parseInt(_comm));
			pstmt.setInt(8, Integer.parseInt(_deptno));
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
	
	public void delete(String _empno) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, pwd);
			String query = "DELETE FROM emp WHERE empno = ?";
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, Integer.parseInt(_empno));
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
}

