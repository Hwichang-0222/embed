package org.embed.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.embed.db.DBConnection;
import org.embed.dto.NoticeDTO;

public class NoticeDAO {
	
	private static NoticeDAO instance;
	
	private NoticeDAO() {
		// TODO Auto-generated constructor stub
	}
	
	public static NoticeDAO getInstance() {
		if (instance == null)
			instance = new NoticeDAO();
		return instance;
	}	
   
	public ArrayList<NoticeDTO> noticeList() {
      
		ArrayList<NoticeDTO> list = new ArrayList<NoticeDTO>();
		Connection conn= null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
      
		try {
			conn = DBConnection.getConnection();
			String query = "SELECT * FROM notice ORDER BY no DESC LIMIT 5";
         
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
         
			while (rs.next()) {
            
				NoticeDTO nData = new NoticeDTO();
				nData.setNo(rs.getInt("no"));
				nData.setTitle(rs.getString("title"));
				nData.setContent(rs.getString("content"));
				nData.setWriter(rs.getString("writer"));
				nData.setCount(rs.getInt("count"));
				nData.setWrite_day(rs.getString("write_day"));
				nData.setStatus(rs.getString("status"));
            
				list.add(nData);
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
	
	public NoticeDTO noticeRead(int _no) {
		
	    NoticeDTO nData = new NoticeDTO();
	    Connection conn = null;
	    PreparedStatement pstmt = null;
	    ResultSet rs = null;

	    try {
	        conn = DBConnection.getConnection();

	        // 1. 조회수 먼저 증가시키기
	        String updateQuery = "UPDATE notice SET count = count + 1 WHERE no = ?";
	        pstmt = conn.prepareStatement(updateQuery);
	        pstmt.setInt(1, _no);
	        pstmt.executeUpdate();
	        pstmt.close();

	        // 2. 공지사항 상세 정보 조회
	        String selectQuery = "SELECT * FROM notice WHERE no = ?";
	        pstmt = conn.prepareStatement(selectQuery);
	        pstmt.setInt(1, _no);
	        rs = pstmt.executeQuery();

	        if (rs.next()) {
	            nData.setNo(rs.getInt("no"));
	            nData.setTitle(rs.getString("title"));
	            nData.setContent(rs.getString("content"));
	            nData.setWriter(rs.getString("writer"));
	            nData.setCount(rs.getInt("count")); // 이미 증가된 값
	            nData.setWrite_day(rs.getString("write_day"));
	            nData.setStatus(rs.getString("status"));
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
	    return nData;
	}
	
	public void noticeWrite(NoticeDTO dto) {
		
		Connection conn= null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DBConnection.getConnection();
			String query = "INSERT INTO notice(title, writer, write_day, status, content, count) "
					+ "VALUES(?, ?, ?, ?, ?, 0)";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, dto.getTitle());
			pstmt.setString(2, dto.getWriter());
			pstmt.setString(3, dto.getWrite_day());
			pstmt.setString(4, dto.getStatus());
			pstmt.setString(5, dto.getContent());
			
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
	
	public NoticeDTO getNoticeByNo(int no) {
	    Connection conn = null;
	    PreparedStatement pstmt = null;
	    ResultSet rs = null;
	    NoticeDTO dto = null;

	    try {
	        conn = DBConnection.getConnection();
	        String query = "SELECT * FROM notice WHERE no = ?";
	        pstmt = conn.prepareStatement(query);
	        pstmt.setInt(1, no);
	        rs = pstmt.executeQuery();

	        if (rs.next()) {
	            dto = new NoticeDTO();
	            dto.setNo(rs.getInt("no"));
	            dto.setTitle(rs.getString("title"));
	            dto.setWriter(rs.getString("writer"));
	            dto.setWrite_day(rs.getString("write_day"));
	            dto.setStatus(rs.getString("status"));
	            dto.setContent(rs.getString("content"));
	            dto.setCount(rs.getInt("count"));
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

	    return dto;
	}
	
	public void updateNotice(NoticeDTO dto) {
	    Connection conn = null;
	    PreparedStatement pstmt = null;

	    try {
	        conn = DBConnection.getConnection();
	        String query = "UPDATE notice SET title = ?, content = ?, status = ? WHERE no = ?";
	        pstmt = conn.prepareStatement(query);
	        pstmt.setString(1, dto.getTitle());
	        pstmt.setString(2, dto.getContent());
	        pstmt.setString(3, dto.getStatus());
	        pstmt.setInt(4, dto.getNo());

	        pstmt.executeUpdate();
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
	
	public void deleteNotice(int no) {
	    Connection conn = null;
	    PreparedStatement pstmt = null;

	    try {
	        conn = DBConnection.getConnection();
	        String query = "DELETE FROM notice WHERE no = ?";
	        pstmt = conn.prepareStatement(query);
	        pstmt.setInt(1, no);

	        pstmt.executeUpdate();
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
	
	// 전체 글 수
	public int getTotalCount() {
	    int count = 0;
	    try (Connection conn = DBConnection.getConnection();
	         PreparedStatement pstmt = conn.prepareStatement("SELECT COUNT(*) FROM notice");
	         ResultSet rs = pstmt.executeQuery()) {
	        if (rs.next()) count = rs.getInt(1);
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return count;
	}

	// 페이징된 리스트
	public ArrayList<NoticeDTO> getPagedList(int startRow, int pageSize) {
		
		ArrayList<NoticeDTO> list = new ArrayList<>();
	    String sql = "SELECT * FROM notice ORDER BY no DESC LIMIT ?, ?";
	    try (Connection conn = DBConnection.getConnection();
	         PreparedStatement pstmt = conn.prepareStatement(sql)) {
	        pstmt.setInt(1, startRow);
	        pstmt.setInt(2, pageSize);
	        ResultSet rs = pstmt.executeQuery();
	        while (rs.next()) {
	            NoticeDTO dto = new NoticeDTO();
	            dto.setNo(rs.getInt("no"));
	            dto.setTitle(rs.getString("title"));
	            dto.setWriter(rs.getString("writer"));
	            dto.setWrite_day(rs.getString("write_day"));
	            dto.setStatus(rs.getString("status"));
	            dto.setContent(rs.getString("content"));
	            dto.setCount(rs.getInt("count"));
	            list.add(dto);
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return list;
	}
	
	public ArrayList<NoticeDTO> searchNotice(String col, String val) {
	    ArrayList<NoticeDTO> list = new ArrayList<>();
	    String query = "SELECT * FROM notice WHERE " + col + " LIKE ? ORDER BY no DESC";

	    try (Connection conn = DBConnection.getConnection();
	         PreparedStatement pstmt = conn.prepareStatement(query)) {

	        pstmt.setString(1, "%" + val + "%");
	        ResultSet rs = pstmt.executeQuery();

	        while (rs.next()) {
	            NoticeDTO dto = new NoticeDTO();
	            dto.setNo(rs.getInt("no"));
	            dto.setTitle(rs.getString("title"));
	            dto.setWriter(rs.getString("writer"));
	            dto.setWrite_day(rs.getString("write_day"));
	            dto.setStatus(rs.getString("status"));
	            dto.setContent(rs.getString("content"));
	            dto.setCount(rs.getInt("count"));
	            list.add(dto);
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }

	    return list;
	}
}