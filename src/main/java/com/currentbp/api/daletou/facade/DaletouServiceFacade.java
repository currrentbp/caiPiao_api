package com.currentbp.api.daletou.facade;

import com.currentbp.daletou.condition.DaletouPageCondition;
import com.currentbp.daletou.entity.Daletou;
import com.currentbp.vo.Win;

import java.util.List;

/**
 * @author current_bp
 * @createTime 20180418
 */
public interface DaletouServiceFacade {
    /**
     * 查询所有的大乐透
     *
     * @return 大乐透列表
     */
    List<Daletou> queryDaletouAll();

    /**
     * 根据条件查询大乐透
     *
     * @param daletouPageCondition 条件
     * @return 大乐透列表
     */
    List<Daletou> queryDaletouByCondition(DaletouPageCondition daletouPageCondition);

    /**
     * 检查中奖情况
     *
     * @param daletous 大乐透列表
     * @return 中奖情况
     */
    List<Win> isWin(List<Daletou> daletous);

    /**
     * 预测大乐透
     *
     * @param num       需要的数量
     * @param daletouId 大乐透ID
     * @return 大乐透列表
     */
    List<Daletou> forecastV1(int num, int daletouId);

    /**
     * 预测大乐透：第二种策略
     *
     * @param num       需要的数量
     * @param daletous 客户提供的大乐透列表
     * @return 大乐透列表
     */
    List<Daletou> forecastV2(int num, List<Daletou> daletous,Integer daletouId);

}
