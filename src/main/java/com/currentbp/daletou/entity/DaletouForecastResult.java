package com.currentbp.daletou.entity;

import java.io.Serializable;
import java.util.Date;

public class DaletouForecastResult implements Serializable {
    private static final long serialVersionUID = -10135464513466552L;
    private Long id;
    private Long daletouId;
    private String daletou;
    private Integer daletouVersion;
    private Integer used;
    private Date createTime;
    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDaletouId() {
        return daletouId;
    }

    public void setDaletouId(Long daletouId) {
        this.daletouId = daletouId;
    }

    public String getDaletou() {
        return daletou;
    }

    public void setDaletou(String daletou) {
        this.daletou = daletou;
    }

    public Integer getDaletouVersion() {
        return daletouVersion;
    }

    public void setDaletouVersion(Integer daletouVersion) {
        this.daletouVersion = daletouVersion;
    }

    public Integer getUsed() {
        return used;
    }

    public void setUsed(Integer used) {
        this.used = used;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "DaletouForecastResult{" +
                "id=" + id +
                ", daletouId=" + daletouId +
                ", daletou='" + daletou + '\'' +
                ", daletouVersion=" + daletouVersion +
                ", used=" + used +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
