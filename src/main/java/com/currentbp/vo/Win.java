package com.currentbp.vo;

import com.currentbp.constant.WinType;
import com.currentbp.daletou.entity.Daletou;

import java.io.Serializable;
import java.util.List;

/**
 * 是否中奖
 *
 * @author current_bp
 * @createTime 20180423
 */
public class Win implements Serializable {
    private static final long serialVersionUID = 7947868980945206606L;
    /**
     * 是否中奖
     */
    private boolean isWin;
    /**
     * 红球中奖数量
     */
    private int redWin;
    /**
     * 蓝球中奖数量
     */
    private int blueWin;
    /**
     * 中奖的红球
     */
    private List<Integer> reds;
    /**
     * 中奖的蓝球
     */
    private List<Integer> blues;
    /**
     * 中奖号码
     */
    private Daletou source;
    /**
     * 中奖消息
     */
    private String msg;
    /**
     * 中奖类型
     */
    private int winType;

    /**
     * 基本奖金
     */
    private Integer baseMoney;


    public boolean isWin() {
        return isWin;
    }

    public void setWin(boolean win) {
        isWin = win;
    }

    public int getRedWin() {
        return redWin;
    }

    public void setRedWin(int redWin) {
        this.redWin = redWin;
    }

    public int getBlueWin() {
        return blueWin;
    }

    public void setBlueWin(int blueWin) {
        this.blueWin = blueWin;
    }

    public List<Integer> getReds() {
        return reds;
    }

    public void setReds(List<Integer> reds) {
        this.reds = reds;
    }

    public List<Integer> getBlues() {
        return blues;
    }

    public void setBlues(List<Integer> blues) {
        this.blues = blues;
    }

    public Daletou getSource() {
        return source;
    }

    public void setSource(Daletou source) {
        this.source = source;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getWinType() {
        return winType;
    }

    public void setWinType(int winType) {
        this.winType = winType;
    }

    public Integer getBaseMoney() {
        return WinType.DaletouBaseMoney.getValueByType(winType);
    }

    public void setBaseMoney(Integer baseMoney) {
        this.baseMoney = baseMoney;
    }

    @Override
    public String toString() {
        return "Win{" +
                "isWin=" + isWin +
                ", redWin=" + redWin +
                ", blueWin=" + blueWin +
                ", reds=" + reds +
                ", blues=" + blues +
                ", source=" + source +
                ", msg='" + msg + '\'' +
                ", winType=" + winType +
                ", baseMoney=" + baseMoney +
                '}';
    }
}
