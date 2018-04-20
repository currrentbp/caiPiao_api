package com.currentbp.common.entity;

import java.io.Serializable;

/**
 * @author current_bp
 * @createTime 20180419
 */
public class BaseCondition implements Serializable{
    private static final long serialVersionUID = -6550447942379197542L;

    private Integer pageSize;
    private Integer pageNum;

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }
}
