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
    boolean isWin;
    int redWin;
    int blueWin;
    List<Integer> reds;
    List<Integer> blues;
    Daletou source;
    String msg;

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
}
