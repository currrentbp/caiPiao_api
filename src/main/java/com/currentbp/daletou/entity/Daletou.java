package com.currentbp.daletou.entity;

import java.io.Serializable;
import java.util.List;

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

    public Daletou() {
    }

    public Daletou(Integer red1, Integer red2, Integer red3, Integer red4, Integer red5, Integer blue1, Integer blue2) {
        this.red1 = red1;
        this.red2 = red2;
        this.red3 = red3;
        this.red4 = red4;
        this.red5 = red5;
        this.blue1 = blue1;
        this.blue2 = blue2;
    }

    public Daletou(Integer id, Integer red1, Integer red2, Integer red3, Integer red4, Integer red5, Integer blue1, Integer blue2) {
        this.id = id;
        this.red1 = red1;
        this.red2 = red2;
        this.red3 = red3;
        this.red4 = red4;
        this.red5 = red5;
        this.blue1 = blue1;
        this.blue2 = blue2;
    }

    public Daletou(Integer id, List<Integer> reds,List<Integer> blues){
        this.id = id;
        this.red1 = reds.get(0);
        this.red2 = reds.get(1);
        this.red3 = reds.get(2);
        this.red4 = reds.get(3);
        this.red5 = reds.get(4);
        this.blue1 = blues.get(0);
        this.blue2 = blues.get(1);
    }

    public Daletou(Integer id, int[] reds,int[] blues){
        this.id = id;
        this.red1 = reds[0];
        this.red2 = reds[1];
        this.red3 = reds[2];
        this.red4 = reds[3];
        this.red5 = reds[4];
        this.blue1 = blues[0];
        this.blue2 = blues[1];
    }

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
