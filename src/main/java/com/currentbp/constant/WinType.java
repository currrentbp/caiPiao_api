package com.currentbp.constant;

/**
 * 中奖类型
 *
 * @author current_bp
 * @createTime 20180423
 */
public class WinType {
    public enum DaletouBaseMoney {
/*
一等奖	基本	3	10000000
追加	1	6000000
二等奖	基本	119	75369
追加	53	45221
三等奖	基本	845	4149
追加	367	2489
四等奖	基本	34115	200
追加	14061	100
五等奖	基本	651859	10
追加	282119	5
六等奖	基本	5779204	5
 */
        ONE(1, 5000000),
        TWO(2, 75369),
        THREE(3, 4149),
        FOUR(4, 200),
        FIVE(5, 10),
        SIX(6, 5),
        ZERO(0,0);

        private int type;
        private int value;

        DaletouBaseMoney(int type, int value) {
            this.type = type;
            this.value = value;
        }

        public static int getValueByType(int type) {
            for (DaletouBaseMoney daletouBaseMoney : DaletouBaseMoney.values()) {
                if (daletouBaseMoney.getType() == type) {
                    return daletouBaseMoney.getValue();
                }
            }
            return 0;
        }

        public int getType() {
            return type;
        }

        public int getValue() {
            return value;
        }
    }
    public enum DaletouWinType {

        ONE(1, "一等奖"),
        TWO(2, "二等奖"),
        THREE(3, "三等奖"),
        FOUR(4, "四等奖"),
        FIVE(5, "五等奖"),
        SIX(6, "六等奖"),
        ZERO(0,"没有中奖");

        private int type;
        private String value;

        DaletouWinType(int type, String value) {
            this.type = type;
            this.value = value;
        }

        public static String getValueByType(int type) {
            for (DaletouWinType daletouWinType : DaletouWinType.values()) {
                if (daletouWinType.getType() == type) {
                    return daletouWinType.getValue();
                }
            }
            return null;
        }

        public int getType() {
            return type;
        }

        public String getValue() {
            return value;
        }
    }
}
