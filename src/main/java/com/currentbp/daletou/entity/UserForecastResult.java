package com.currentbp.daletou.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author baopan
 * @createTime 20210413
 */
public class UserForecastResult  implements Serializable {
    private static final long serialVersionUID = 193908220541717547L;

    private Long id;
    private Long userForecastId;
    private Integer caipiaoType;
    private Integer win;
    private Long bonus;
    private Integer winLevel;
    private Date createTime ;
    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserForecastId() {
        return userForecastId;
    }

    public void setUserForecastId(Long userForecastId) {
        this.userForecastId = userForecastId;
    }

    public Integer getCaipiaoType() {
        return caipiaoType;
    }

    public void setCaipiaoType(Integer caipiaoType) {
        this.caipiaoType = caipiaoType;
    }

    public Integer getWin() {
        return win;
    }

    public void setWin(Integer win) {
        this.win = win;
    }

    public Long getBonus() {
        return bonus;
    }

    public void setBonus(Long bonus) {
        this.bonus = bonus;
    }

    public Integer getWinLevel() {
        return winLevel;
    }

    public void setWinLevel(Integer winLevel) {
        this.winLevel = winLevel;
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
        return "UserForecastResult{" +
                "id=" + id +
                ", userForecastId=" + userForecastId +
                ", caipiaoType=" + caipiaoType +
                ", win=" + win +
                ", bonus=" + bonus +
                ", winLevel=" + winLevel +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
