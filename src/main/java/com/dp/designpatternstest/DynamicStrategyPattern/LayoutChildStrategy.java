package com.dp.designpatternstest.DynamicStrategyPattern;

/**
 * @author MikeWang
 * @date 2022/11/24 6:17 PM
 */

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * 幼儿布局
 *
 */
@Slf4j
@Order(10)
@Service
public class LayoutChildStrategy implements LayoutStrategy {
    // 幼儿特殊渠道号(优先级最高)
    private static final String CHILD_CHANNEL = "FE-XX-XX-XX";

    @Override
    public boolean match(LayoutContext ctx) {
        return Objects.nonNull(ctx) && CHILD_CHANNEL.equals(ctx.getChannel());
    }

    @Override
    public void process(LayoutContext ctx) {
        log.info("[幼儿布局] 开始处理");
        ctx.setLayoutId("111");
    }
}
