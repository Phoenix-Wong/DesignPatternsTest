package com.dp.designpatternstest.StaticStrategyPattern;

/**
 * @author MikeWang
 * @date 2022/11/24 5:55 PM
 */
/**
 * 同步策略
 *
 */
public interface SyncStrategy {
    String OT_STRATEGY = "otStrategy";
    String AB_STRATEGY = "abStrategy";
    String DEFAULT_STRATEGY = "defaultStrategy";

    /**
     * 具体策略
     * @param ctx Context
     */
    void process(SyncContext ctx);
}
