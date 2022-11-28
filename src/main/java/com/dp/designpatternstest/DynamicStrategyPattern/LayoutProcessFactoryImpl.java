package com.dp.designpatternstest.DynamicStrategyPattern;

/**
 * @author MikeWang
 * @date 2022/11/24 6:22 PM
 */

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * 布局处理工厂实现
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class LayoutProcessFactoryImpl implements LayoutProcessFactory {

    // Spring会根据@Order注解顺序注入
    private final List<LayoutStrategy> strategyList;

    @Override
    public Optional<LayoutStrategy> getStrategy(LayoutContext ctx) {
        return strategyList.stream()
                .filter(s -> s.match(ctx)).findFirst();
    }

    @Override
    public void exec(LayoutContext ctx) {
        log.info("[布局处理] 尝试处理 ctx=>{}", ctx);
        getStrategy(ctx).ifPresent(s -> {
            s.process(ctx);
            log.info("[布局处理] 处理完成 ctx=>{}", ctx);
        });
    }
}
