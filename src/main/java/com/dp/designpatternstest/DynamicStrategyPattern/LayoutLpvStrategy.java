package com.dp.designpatternstest.DynamicStrategyPattern;

/**
 * @author MikeWang
 * @date 2022/11/24 6:18 PM
 */

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * 根据LPV进行判断的策略
 */
@Slf4j
@Order(20)
@Service
public class LayoutLpvStrategy implements LayoutStrategy {
    // 需要走LPV处理逻辑的渠道号
    private static final Set<String> LPV_CHANNELS = new HashSet<String>(){{
        add("LP-XX-XX-01");
        add("LP-XX-XX-02");
        add("XZ-XX-XX-01");
        add("XZ-XX-XX-02");
    }};



    @Override
    public boolean match(LayoutContext ctx) {
        return Objects.nonNull(ctx) && Objects.nonNull(ctx.getChannel()) && LPV_CHANNELS.contains(ctx.getChannel());
    }

    @Override
    public void process(LayoutContext ctx) {
        log.info("[LPV布局] 开始处理");
        ctx.setLayoutId("222");
    }
}
