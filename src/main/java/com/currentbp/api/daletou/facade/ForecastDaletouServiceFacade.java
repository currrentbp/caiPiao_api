package com.currentbp.api.daletou.facade;

import com.currentbp.entity.DaletouEntity;

import java.util.List;

/**
 * 预测大乐透业务
 *
 * @author current_bp
 * @createTime 20180411
 */
public interface ForecastDaletouServiceFacade {


    /**
     * 预测大乐透
     *
     * @param count     预测数量
     * @param daletouId 大乐透ID
     * @return 大乐透列表
     */
    List<DaletouEntity> forecastDaletou(int count, int daletouId);
}
