package com.dp.designpatternstest.DynamicStrategyPattern;

/**
 * @author MikeWang
 * @date 2022/11/24 6:17 PM
 */
/**
 * 布局处理策略
 *
 */
public interface LayoutStrategy {

    /**
     * 校验是否匹配该策略
     *
     * @param ctx 策略上下文
     * @return bool
     */
    boolean match(LayoutContext ctx);

    /**
     * 具体策略处理
     *
     * @param ctx 策略上下文
     */
    void process(LayoutContext ctx);
}
