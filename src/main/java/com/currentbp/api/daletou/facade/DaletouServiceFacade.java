package com.currentbp.api.daletou.facade;

import com.currentbp.daletou.condition.DaletouCondition;
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
     * @param daletouCondition 条件
     * @return 大乐透列表
     */
    List<Daletou> queryDaletouByCondition(DaletouCondition daletouCondition);

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
    List<Daletou> forecast(int num, int daletouId);

    /**
     * 预测并保存到数据库
     * @param daletouId 最新大乐透ID
     */
    void forecastAndSave(int daletouId);
}
