package com.dp.designpatternstest.StaticStrategyPattern;

/**
 * @author MikeWang
 * @date 2022/11/24 5:59 PM
 */

import java.util.HashMap;
import java.util.Map;

/**
 * 同步策略工厂类接口
 *
 */
public interface SyncStrategyFactory {
    Map<Integer, String> STRATEGY_MAP = new HashMap<Integer, String>(){{
        put(1, SyncStrategy.OT_STRATEGY);
        put(2, SyncStrategy.AB_STRATEGY);
        put(3, SyncStrategy.DEFAULT_STRATEGY);
    }};


    /**
     * 根据任务类型获取具体策略
     *
     * @param taskType 任务类型
     * @return 具体策略
     */
    SyncStrategy getStrategy(Integer taskType);

    /**
     * 执行策略  // XXX: 其实这块放这里有背单一职责的，同时也不符合Factory本意。
     *
     * @param ctx 策略上下文
     */
    void exec(SyncContext ctx);
}
