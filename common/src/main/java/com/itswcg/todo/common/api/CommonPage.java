package com.itswcg.todo.common.api;

import com.github.pagehelper.PageInfo;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class CommonPage<T> {
    private Integer pageNum;
    private Integer pageSize;
    private Integer totalPage;
    private long total;
    private List<T> list;

    public static <T> CommonPage<T> setPage(List<T> list) {
        CommonPage<T> result = new CommonPage<>();
        PageInfo<T> pageInfo = new PageInfo<>(list);
        result.setPageNum(pageInfo.getPageNum());
        result.setPageSize(pageInfo.getPageSize());
        result.setTotalPage(pageInfo.getPages());
        result.setTotal(pageInfo.getTotal());
        result.setList(pageInfo.getList());
        return result;
    }
}
