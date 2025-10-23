package org.embed.bbs.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.embed.bbs.dto.BbsDTO;
import org.embed.bbs.mapper.BbsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BbsServiceImpl implements BbsService {

    @Autowired
    private BbsMapper bbsMapper;

    @Override
    public List<BbsDTO> getPagedBbs(int page, int pageSize) {
        int offset = (page - 1) * pageSize;
        Map<String, Object> params = new HashMap<>();
        params.put("limit", pageSize);
        params.put("offset", offset);
        return bbsMapper.getPagedBbs(params);
    }

    @Override
    public int getBbsCount() {
        return bbsMapper.getBbsCount();
    }


    @Override
    public BbsDTO getBbsByNum(int num) {
        return bbsMapper.getBbsByNum(num);
    }

    @Override
    public void insertBbs(BbsDTO bbs) {
        bbsMapper.insertBbs(bbs);
    }

    @Override
    public void updateBbs(BbsDTO bbs) {
        bbsMapper.updateBbs(bbs);
    }

    @Override
    public void deleteBbs(int num) {
        bbsMapper.deleteBbs(num);
    }

    @Override
    public void updateHitCount(int num) {
        bbsMapper.updateHitCount(num);
    }
}
