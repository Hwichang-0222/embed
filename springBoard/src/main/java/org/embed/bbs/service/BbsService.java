package org.embed.bbs.service;

import java.util.List;
import org.embed.bbs.dto.BbsDTO;

public interface BbsService {

	List<BbsDTO> getPagedBbs(int page, int pageSize);
	int getBbsCount();
    BbsDTO getBbsByNum(int num);
    void insertBbs(BbsDTO bbs);
    void updateBbs(BbsDTO bbs);
    void deleteBbs(int num);
    void updateHitCount(int num);
}
