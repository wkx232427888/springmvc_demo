package com.msb.hjycommunity.community.service.impl;

import com.msb.hjycommunity.community.domain.HjyCommunity;
import com.msb.hjycommunity.community.domain.dto.HjyCommunityDTO;
import com.msb.hjycommunity.community.mapper.HjyCommunityMapper;
import com.msb.hjycommunity.community.service.HjyCommunityService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class HjyCommunityServiceImpl implements HjyCommunityService {

    @Resource
    private HjyCommunityMapper hjyCommunityMapper;


    @Override
    public List<HjyCommunityDTO> queryList(HjyCommunity hjyCommunity) {
        return hjyCommunityMapper.queryList(hjyCommunity);
    }
}
