package org.embed;

import java.util.List;

import org.embed.domain.BoardDTO;
import org.embed.domain.MemberDTO;
import org.embed.mapper.BoardMapper;
import org.embed.mapper.MemberMapper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import tools.jackson.databind.ObjectMapper;

@SpringBootTest
class SpringMybatisTestApplicationTests {
	
	@Autowired
	private BoardMapper boardMapper;
	
	@Autowired
	private MemberMapper memberMapper;
	
/*	@Test
	@DisplayName("게시판 글쓰기")
	public void testInsert() throws Exception {
		
		BoardDTO board = new BoardDTO();
		board.setTitle("3rd Title");
		board.setContents("First content");
		board.setCreatorId("admin");
		
		int result = boardMapper.insertBoard(board);
		System.out.println("게시판 글쓰기 테스트 (성공 : 1, 실패 : 0) : " + result);
		
	}
	
	@Test
	@DisplayName("게시판 목록")
	public void testSelectAll() throws Exception {
		
		List<BoardDTO> boardList = boardMapper.selectBoardList();
		if (!boardList.isEmpty()) {
			for (BoardDTO board : boardList) {
				System.out.println("=================================================");
				System.out.println(board.getBoardId());
				System.out.println(board.getTitle());
				System.out.println(board.getContents());
				System.out.println(board.getCreatorId());
				System.out.println(board.getHitCnt());
				System.out.println(board.getCreatedDatetime());
				System.out.println("=================================================");
			}
		}
	}

	
	@Test
	@DisplayName("게시판 상세보기")
	public void testSelectDetail() throws Exception {
		
		BoardDTO board = boardMapper.selectBoardDetail(2);
		
		try {
			String boardJson = new ObjectMapper().writeValueAsString(board);
			System.out.println("=================================================");
			System.out.println(boardJson);
			System.out.println("=================================================");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		System.out.println("=================================================");
		System.out.println(board.getBoardId());
		System.out.println(board.getTitle());
		System.out.println(board.getContents());
		System.out.println(board.getCreatorId());
		System.out.println(board.getHitCnt());
		System.out.println(board.getCreatedDatetime());
		System.out.println("=================================================");
		
	}
	
	@Test
	@DisplayName("게시판 내용 수정")
	public void testBoardUpdate() throws Exception {
		
		BoardDTO board = new BoardDTO();
		board.setBoardId(1);
		board.setTitle("Updated Title");
		board.setContents("updated contents");
		
		int result = boardMapper.updateBoard(board);
		System.out.println("게시판 수정 테스트 (성공 : 1, 실패 : 0) : " + result);
		
	}
	
	@Test
	@DisplayName("게시판 삭제")
	public void testBoardDelete() throws Exception {
		
		int result = boardMapper.deleteBoard(3);
		System.out.println("게시판 삭제 테스트 (성공 : 1, 실패 : 0) : " + result);
		
	}*/
	
//	@Test
//	@DisplayName("멤버 추가")
//	public void testInsert() throws Exception {
//		
//		MemberDTO member = new MemberDTO();
//		
//		member.setId("test");
//		member.setPassword("test");
//		member.setName("admin");
//		member.setGender("male");
//		member.setBirth("2002-01-01");
//		member.setMail("test@test.com");
//		member.setPhone("010-000-0000");
//		member.setAddress("korea");
//		
//		int result = memberMapper.insertMember(member);
//		System.out.println("멤버 추가 테스트 (성공 : 1, 실패 : 0) : " + result);
//		
//	}
	
//	@Test
//	@DisplayName("멤버 목록")
//	public void testSelectAll() throws Exception {
//		
//		List<MemberDTO> memberList = memberMapper.selectMemberList();
//		if (!memberList.isEmpty()) {
//			for (MemberDTO member : memberList) {
//				System.out.println("=================================================");
//				System.out.println(member.getId());
//				System.out.println(member.getPassword());
//				System.out.println(member.getName());
//				System.out.println(member.getGender());
//				System.out.println(member.getBirth());
//				System.out.println(member.getMail());
//				System.out.println(member.getPhone());
//				System.out.println(member.getAddress());
//				System.out.println(member.getRegistDay());
//				System.out.println("=================================================");
//			}
//		}
//	}
//
//	
//	@Test
//	@DisplayName("멤버보기")
//	public void testSelectDetail() throws Exception {
//		
//		MemberDTO member = memberMapper.selectMemberDetail("test");
//		
//		try {
//			String memberJson = new ObjectMapper().writeValueAsString(member);
//			System.out.println("=================================================");
//			System.out.println(memberJson);
//			System.out.println("=================================================");
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
//		
//		
//	}
	
	@Test
	@DisplayName("멤버 수정")
	public void testBoardUpdate() throws Exception {
		
		MemberDTO member = new MemberDTO();
		
		member.setId("test");
		member.setPassword("update");
		member.setMail("update@test.com");
		member.setPhone("010-000-1111");
		member.setAddress("busan");
		
		int result = memberMapper.updateMember(member);
		System.out.println("게시판 수정 테스트 (성공 : 1, 실패 : 0) : " + result);
		
	}
	
//	@Test
//	@DisplayName("멤버 삭제")
//	public void testBoardDelete() throws Exception {
//		
//		int result = memberMapper.deleteMember("ppp");
//		System.out.println("게시판 삭제 테스트 (성공 : 1, 실패 : 0) : " + result);
//		
//	}

}
