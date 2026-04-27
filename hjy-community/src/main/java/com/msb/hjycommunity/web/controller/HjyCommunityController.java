package com.msb.hjycommunity.web.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.msb.hjycommunity.common.constant.HttpStatus;
import com.msb.hjycommunity.common.core.controller.BaseController;
import com.msb.hjycommunity.common.core.page.PageResult;
import com.msb.hjycommunity.common.utils.ServletUtils;
import com.msb.hjycommunity.community.domain.HjyCommunity;
import com.msb.hjycommunity.community.domain.dto.HjyCommunityDTO;
import com.msb.hjycommunity.community.service.HjyCommunityService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/community")
public class HjyCommunityController extends BaseController {

    @Resource
    private HjyCommunityService hjyCommunityService;


    @GetMapping("list")
    private PageResult list(HjyCommunity hjyCommunity){
      startPage();
      List<HjyCommunityDTO> list = hjyCommunityService.queryList(hjyCommunity);
      return getData(list);
    }

}
