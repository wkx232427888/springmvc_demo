package com.msb.hjycommunity.system.service;

import com.msb.hjycommunity.system.domain.dto.SysAreaDTO;

import java.util.List;

public interface SysAreaService {
    List<SysAreaDTO> findAreaAsTree();

}
