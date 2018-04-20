package com.currentbp.api.daletou.facade;

import com.currentbp.daletou.condition.DaletouCondition;
import com.currentbp.daletou.entity.Daletou;

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
}
