package com.msb.hjycommunity.common.core.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.msb.hjycommunity.common.constant.HttpStatus;
import com.msb.hjycommunity.common.core.page.PageDomain;
import com.msb.hjycommunity.common.core.page.PageResult;
import com.msb.hjycommunity.common.utils.ServletUtils;

import java.util.List;

/**
 * 基础控制器类
 *
 */
public class BaseController {
    public static final String PAGE_NUM="pageNum";
    public static final String PAGE_SIZE="pageSize";

    /**
     * 封装分页数据
     */
    public static PageDomain getPageDomain()
    {
        PageDomain pageDomain = new PageDomain();
        pageDomain.setPageNum(ServletUtils.getParameterToInt(PAGE_NUM));
        pageDomain.setPageSize(ServletUtils.getParameterToInt(PAGE_SIZE));
        return pageDomain;


    }

    /**
     * 封装调用pageHelper的startpage方法
     */
    protected void  startPage(){
        PageDomain pageDomain = getPageDomain();
        Integer pageNum = pageDomain.getPageNum();
        Integer pageSize = pageDomain.getPageSize();
        if(pageNum==null||pageSize==null)
        {
            PageHelper.startPage(pageNum,pageSize);
        }
    }

    protected PageResult getData(List<?> list){
        PageResult pageResult = new PageResult();
        pageResult.setCode(HttpStatus.SUCCESS);
        pageResult.setMsg("分页查询成功");
        pageResult.setRows(list);
        pageResult.setTotal(new PageInfo(list).getTotal());

        return pageResult;
    }
}
