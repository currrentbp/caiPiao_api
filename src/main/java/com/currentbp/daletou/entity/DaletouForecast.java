package com.currentbp.daletou.entity;

import java.io.Serializable;

/**
 * 预测的数据
 *
 * @author current_bp
 * @createTime 20180426
 */
public class DaletouForecast implements Serializable {
    private static final long serialVersionUID = 1336218241428354851L;
    private Integer id;
    private String forecast;
    private Integer usedCount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getForecast() {
        return forecast;
    }

    public void setForecast(String forecast) {
        this.forecast = forecast;
    }

    public Integer getUsedCount() {
        return usedCount;
    }

    public void setUsedCount(Integer usedCount) {
        this.usedCount = usedCount;
    }

    @Override
    public String toString() {
        return "DaletouForecast{" +
                "id=" + id +
                ", forecast='" + forecast + '\'' +
                ", usedCount=" + usedCount +
                '}';
    }
}
