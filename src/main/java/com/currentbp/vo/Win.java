package com.currentbp.vo;

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
    boolean isWin;
    /**
     * 红球中奖数量
     */
    int redWin;
    /**
     * 蓝球中奖数量
     */
    int blueWin;
    /**
     * 中奖的红球
     */
    List<Integer> reds;
    /**
     * 中奖的蓝球
     */
    List<Integer> blues;
    /**
     * 中奖号码
     */
    Daletou source;
    /**
     * 中奖消息
     */
    String msg;
    /**
     * 中奖类型
     */
    int winType;

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
                '}';
    }
}
