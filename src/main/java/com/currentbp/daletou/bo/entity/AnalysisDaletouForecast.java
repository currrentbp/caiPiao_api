package com.currentbp.daletou.bo.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 分析已经预测的大乐透的号码的结果
 *
 * @author current_bp
 * @createTime 20180427
 */
public class AnalysisDaletouForecast implements Serializable {
    private static final long serialVersionUID = -515630748931362109L;

    Integer daletouId;
    Integer count;//总中奖次数
    Long sum;//总中奖金额
    Integer personCount;//总中奖人次
    Integer forecastCount;//总预测数量
    Integer consumeMoney;//消耗的钱
    List<Integer> winCount;

    {
        this.winCount = new ArrayList<>(6);
        for (int i = 0; i < 6; i++) {
            this.winCount.add(0);
        }
    }

    public Integer getDaletouId() {
        return daletouId;
    }

    public void setDaletouId(Integer daletouId) {
        this.daletouId = daletouId;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Long getSum() {
        return sum;
    }

    public void setSum(Long sum) {
        this.sum = sum;
    }

    public Integer getPersonCount() {
        return personCount;
    }

    public void setPersonCount(Integer personCount) {
        this.personCount = personCount;
    }

    public Integer getForecastCount() {
        return forecastCount;
    }

    public void setForecastCount(Integer forecastCount) {
        this.forecastCount = forecastCount;
    }

    public List<Integer> getWinCount() {
        return winCount;
    }

    public void setWinCount(List<Integer> winCount) {
        this.winCount = winCount;
    }

    public Integer getConsumeMoney() {
        return null != consumeMoney ? consumeMoney : forecastCount * 2;
    }

    public void setConsumeMoney(Integer consumeMoney) {
        this.consumeMoney = consumeMoney;
    }

    @Override
    public String toString() {
        return "AnalysisDaletouForecast{" +
                "daletouId=" + daletouId +
                ", count=" + count +
                ", sum=" + sum +
                ", personCount=" + personCount +
                ", forecastCount=" + forecastCount +
                ", consumeMoney=" + getConsumeMoney() +
                ", winCount=" + winCount +
                '}';
    }
}
