package com.currentbp.constant;

/**
 * 中奖类型
 *
 * @author current_bp
 * @createTime 20180423
 */
public class WinType {
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
