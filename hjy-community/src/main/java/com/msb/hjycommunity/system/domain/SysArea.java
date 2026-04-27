package com.msb.hjycommunity.system.domain;

import java.io.Serializable;

/**
 * 区域表(SysArea)实体类
 *
 * @author makejava
 * @since 2025-07-23 11:36:08
 */
public class SysArea implements Serializable {
    private static final long serialVersionUID = -81945080670514488L;
/**
     * 唯一主键
     */
    private Integer id;
/**
     * 城市编码
     */
    private Integer code;
/**
     * 城市名称
     */
    private String name;
/**
     * 城市父ID
     */
    private Integer parentCode;

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

    public Integer getParentCode() {
        return parentCode;
    }

    public void setParentCode(Integer parentCode) {
        this.parentCode = parentCode;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}

