package org.embed.bbs.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.embed.bbs.dto.BbsDTO;

@Mapper
public interface BbsMapper {

	List<BbsDTO> getPagedBbs(Map<String, Object> pagingParams);
	int getBbsCount();
    BbsDTO getBbsByNum(int num);
    void insertBbs(BbsDTO bbs);
    void updateBbs(BbsDTO bbs);
    void deleteBbs(int num);
    void updateHitCount(int num);
}
