package com.dp.designpatternstest.StaticStrategyPattern;

/**
 * @author MikeWang
 * @date 2022/11/24 6:09 PM
 */

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 策略单测
 *
 */
@Slf4j
@SpringBootTest
class SyncStrategyFactoryTest {

    @Autowired
    SyncStrategyFactory strategyFactory;

    @Test
    void testOtStrategy() {
        final SyncContext ctx = SyncContext.builder().taskType(1).build();
        strategyFactory.exec(ctx);
        Assertions.assertEquals("otStrategy", ctx.getRespVO());
    }

    @Test
    void testAbStrategy() {
        final SyncContext ctx = SyncContext.builder().taskType(2).build();
        strategyFactory.exec(ctx);
        Assertions.assertEquals("abStrategy", ctx.getRespVO());
    }

    @Test
    void testDefaultStrategy() {
        final SyncContext ctx = SyncContext.builder().taskType(3).build();
        strategyFactory.exec(ctx);
        Assertions.assertEquals("defaultStrategy", ctx.getRespVO());
    }

    @Test
    void testOtherStrategy() {
        final SyncContext ctx = SyncContext.builder().taskType(-1).build();
        strategyFactory.exec(ctx);
        Assertions.assertNull(ctx.getRespVO());
    }
}
