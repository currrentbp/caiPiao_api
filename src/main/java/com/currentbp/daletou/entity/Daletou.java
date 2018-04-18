package com.currentbp.daletou.entity;

import java.io.Serializable;

/**
 * @author current_bp
 * @createTime 20180418
 */
public class Daletou implements Serializable {
    private static final long serialVersionUID = -597015709798753576L;
    private Integer id;
    private Integer red1;
    private Integer red2;
    private Integer red3;
    private Integer red4;
    private Integer red5;
    private Integer blue1;
    private Integer blue2;

    public Daletou(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRed1() {
        return red1;
    }

    public void setRed1(Integer red1) {
        this.red1 = red1;
    }

    public Integer getRed2() {
        return red2;
    }

    public void setRed2(Integer red2) {
        this.red2 = red2;
    }

    public Integer getRed3() {
        return red3;
    }

    public void setRed3(Integer red3) {
        this.red3 = red3;
    }

    public Integer getRed4() {
        return red4;
    }

    public void setRed4(Integer red4) {
        this.red4 = red4;
    }

    public Integer getRed5() {
        return red5;
    }

    public void setRed5(Integer red5) {
        this.red5 = red5;
    }

    public Integer getBlue1() {
        return blue1;
    }

    public void setBlue1(Integer blue1) {
        this.blue1 = blue1;
    }

    public Integer getBlue2() {
        return blue2;
    }

    public void setBlue2(Integer blue2) {
        this.blue2 = blue2;
    }

    @Override
    public String toString() {
        return "Daletou{" +
                "id=" + id +
                ", red1=" + red1 +
                ", red2=" + red2 +
                ", red3=" + red3 +
                ", red4=" + red4 +
                ", red5=" + red5 +
                ", blue1=" + blue1 +
                ", blue2=" + blue2 +
                '}';
    }
}
