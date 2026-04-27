package com.msb.hjycommunity.community.service;

import com.msb.hjycommunity.community.domain.HjyCommunity;
import com.msb.hjycommunity.community.domain.dto.HjyCommunityDTO;

import java.util.List;

public interface HjyCommunityService {

    /**
     * 根据条件查询小区信息列表
     * @param hjyCommunity
     * @return
     */
    List<HjyCommunityDTO> queryList(HjyCommunity hjyCommunity);
}
