package com.dp.designpatternstest.DynamicStrategyPattern;

/**
 * @author MikeWang
 * @date 2022/11/24 6:22 PM
 */

import java.util.Optional;

/**
 * 布局处理工厂
 *
 */
public interface LayoutProcessFactory {

    /**
     * 获取具体策略
     *
     * @param ctx 上下文
     * @return Strategy
     */
    Optional<LayoutStrategy> getStrategy(LayoutContext ctx);

    /**
     * 策略调用
     *
     * @param ctx 上下文
     */
    void exec(LayoutContext ctx);
}
