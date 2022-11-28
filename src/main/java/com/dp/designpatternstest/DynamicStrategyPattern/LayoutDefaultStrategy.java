package com.dp.designpatternstest.DynamicStrategyPattern;

/**
 * @author MikeWang
 * @date 2022/11/24 6:22 PM
 */

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

/**
 * 默认处理策略
 */
@Slf4j
@Order(999)
@Service
public class LayoutDefaultStrategy implements LayoutStrategy {

    @Override
    public boolean match(LayoutContext ctx) {
        // 兜底策略
        return true;
    }

    @Override
    public void process(LayoutContext ctx) {
        log.info("[默认布局] 开始处理");
        ctx.setLayoutId("999");
    }
}
