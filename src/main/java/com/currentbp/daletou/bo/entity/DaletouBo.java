package com.currentbp.daletou.bo.entity;

import com.alibaba.fastjson.JSON;
import com.currentbp.daletou.entity.Daletou;
import com.currentbp.util.all.StringUtil;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 大乐透号码
 *
 * @author current_bp
 * @createTime 20170503
 */
public class DaletouBo {
    private Integer id;
    private List<Integer> red = new ArrayList<Integer>(5);
    private List<Integer> blue = new ArrayList<Integer>(2);

    public DaletouBo() {
    }

    public DaletouBo(Daletou daletou) {
        this.id = null != daletou.getId() ? daletou.getId() : null;
        red.add(daletou.getRed1());
        red.add(daletou.getRed2());
        red.add(daletou.getRed3());
        red.add(daletou.getRed4());
        red.add(daletou.getRed5());

        blue.add(daletou.getBlue1());
        blue.add(daletou.getBlue2());
    }

    public DaletouBo(Integer id, List<String> daletouStrings) {
        this.id = id;
        for (int i = 0; i < daletouStrings.size(); i++) {
            if (i < 5) {
                red.add(Integer.parseInt(daletouStrings.get(i)));
            } else {
                blue.add(Integer.parseInt(daletouStrings.get(i)));
            }
        }
    }

    public DaletouBo(String source) {
        //17059:8,11,13,15,17;3,10
        List<String> strings = StringUtil.stringToList(source, ":");
        this.id = Integer.parseInt(strings.get(0));
        String redsAndBlues = strings.get(1);
        List<String> strings1 = StringUtil.stringToList(redsAndBlues, ";");
        String reds = strings1.get(0);
        String blues = strings1.get(1);
        List<String> reds1 = StringUtil.stringToList(reds);
        List<String> blues1 = StringUtil.stringToList(blues);
        for (String red : reds1) {
            this.red.add(Integer.parseInt(red));
        }
        for (String blue : blues1) {
            this.blue.add(Integer.parseInt(blue));
        }
    }

    public DaletouBo(Integer id, String source) {
        //8,11,13,15,17;3,10
        this.id = id;
        List<String> strings = StringUtil.stringToList(source, ";");
        String reds = strings.get(0);
        String blues = strings.get(1);
        List<String> red = StringUtil.stringToList(reds, ",");
        List<String> blue = StringUtil.stringToList(blues, ",");
        for (String r : red) {
            this.red.add(Integer.parseInt(r));
        }
        for (String b : blue) {
            this.blue.add(Integer.parseInt(b));
        }
    }

    public DaletouBo sort() {
        Collections.sort(this.getBlue(), new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                // 返回值为int类型，大于0表示正序，小于0表示逆序
                return o1 - o2;
            }
        });
        Collections.sort(this.getRed(), new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                // 返回值为int类型，大于0表示正序，小于0表示逆序
                return o1 - o2;
            }
        });
        return this;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Integer> getRed() {
        return red;
    }

    public void setRed(List<Integer> red) {
        this.red = red;
    }

    public List<Integer> getBlue() {
        return blue;
    }

    public void setBlue(List<Integer> blue) {
        this.blue = blue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        DaletouBo that = (DaletouBo) o;

        return id != null ? id.equals(that.id) : that.id == null;

    }

    public Daletou toDaletou() {
        Daletou daletou = new Daletou();
        daletou.setId(this.id);
        daletou.setRed1(this.red.get(0));
        daletou.setRed2(this.red.get(1));
        daletou.setRed3(this.red.get(2));
        daletou.setRed4(this.red.get(3));
        daletou.setRed5(this.red.get(4));
        daletou.setBlue1(this.blue.get(0));
        daletou.setBlue2(this.blue.get(1));

        return daletou;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("");
        sb.append(id + ":" +
                StringUtil.list2String(red) + ";" +
                StringUtil.list2String(blue));
        return sb.toString();
    }
}
