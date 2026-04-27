package com.msb.hjycommunity.common.core.page;


import java.io.Serializable;
import java.util.List;

/**
 * 分页查询统一响应封装
 */
public class PageResult implements Serializable {

    private static final long serialVersionUID = 1L;
    /* 总记录数*/
    private long total;
    /* 列表数据*/
    private List<?> rows;
    /*消息状态码*/
    private Integer code;
    private String msg;

    public PageResult() {
    }
    public PageResult(List<?> rows, Integer code) {
        this.rows = rows;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<?> getRows() {
        return rows;
    }

    public void setRows(List<?> rows) {
        this.rows = rows;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
