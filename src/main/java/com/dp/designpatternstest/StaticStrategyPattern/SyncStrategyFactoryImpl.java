package com.dp.designpatternstest.StaticStrategyPattern;

/**
 * @author MikeWang
 * @date 2022/11/24 6:07 PM
 */

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Optional;

/**
 * 策略工厂具体实现
 *
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class SyncStrategyFactoryImpl implements SyncStrategyFactory {

    // 这块可以按Spring Bean别名注入
    private final Map<String, SyncStrategy> strategyMap;

    @Override
    public SyncStrategy getStrategy(Integer taskType) {
        if (!STRATEGY_MAP.containsKey(taskType) || !strategyMap.containsKey(STRATEGY_MAP.get(taskType))) {
            return null;
        }
        return strategyMap.get(STRATEGY_MAP.get(taskType));
    }

    @Override
    public void exec(SyncContext ctx) {
        Optional.of(getStrategy(ctx.getTaskType())).ifPresent(strategy -> {
            log.info("[策略执行] 查找策略 {}, ctx=>{}", strategy.getClass().getSimpleName(), ctx);
            strategy.process(ctx);
            log.info("[策略执行] 执行完成 ctx=>{}", ctx);
        });
    }
}
