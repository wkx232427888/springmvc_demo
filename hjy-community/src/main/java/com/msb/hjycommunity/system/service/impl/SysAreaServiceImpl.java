package com.msb.hjycommunity.system.service.impl;

import com.msb.hjycommunity.system.domain.SysArea;
import com.msb.hjycommunity.system.domain.dto.SysAreaDTO;
import com.msb.hjycommunity.system.mapper.SysAreaMapper;
import com.msb.hjycommunity.system.service.SysAreaService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class SysAreaServiceImpl implements SysAreaService {

    @Resource
    private SysAreaMapper sysAreaMapper;

    @Override
    public List<SysAreaDTO> findAreaAsTree() {
        //获取区域表数据
        List<SysArea> list = sysAreaMapper.findAll();

        return list.stream().filter()

    }
}
