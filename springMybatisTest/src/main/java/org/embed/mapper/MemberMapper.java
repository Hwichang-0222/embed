package org.embed.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.embed.domain.BoardDTO;
import org.embed.domain.MemberDTO;

@Mapper
public interface MemberMapper {
	
	int insertMember(MemberDTO member) throws Exception;
	List<MemberDTO> selectMemberList() throws Exception;
	MemberDTO selectMemberDetail(String memberId) throws Exception;
	int updateMember(MemberDTO member) throws Exception;
	int deleteMember(String memberId) throws Exception;

}
