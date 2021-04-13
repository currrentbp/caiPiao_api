package com.currentbp.daletou.entity;

import java.io.Serializable;
import java.util.Date;

public class UserDaletou implements Serializable {
    private static final long serialVersionUID = 113892667394669047L;


    private Long id;
    private Long userId;
    private Integer daletouId;
    private Integer forecastVersion;
    private String daletou;
    private Date createTime;
    private Date updateTime;
    private Integer win;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getForecastVersion() {
        return forecastVersion;
    }

    public void setForecastVersion(Integer forecastVersion) {
        this.forecastVersion = forecastVersion;
    }

    public String getDaletou() {
        return daletou;
    }

    public Integer getDaletouId() {
        return daletouId;
    }

    public void setDaletouId(Integer daletouId) {
        this.daletouId = daletouId;
    }

    public void setDaletou(String daletou) {
        this.daletou = daletou;
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

    public Integer getWin() {
        return win;
    }

    public void setWin(Integer win) {
        this.win = win;
    }

    @Override
    public String toString() {
        return "UserDaletou{" +
                "id=" + id +
                ", userId=" + userId +
                ", daletouId=" + daletouId +
                ", forecastVersion=" + forecastVersion +
                ", daletou='" + daletou + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", win=" + win +
                '}';
    }
}
