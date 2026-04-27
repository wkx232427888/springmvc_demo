package com.msb.hjycommunity.system.domain.dto;

import java.io.Serializable;
import java.util.List;

public class SysAreaDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    //城市编码
    private Integer code;
    //城市名称
    private String name;
    //子区域
    private List<SysAreaDTO> children;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<SysAreaDTO> getChildren() {
        return children;
    }

    public void setChildren(List<SysAreaDTO> children) {
        this.children = children;
    }
}
