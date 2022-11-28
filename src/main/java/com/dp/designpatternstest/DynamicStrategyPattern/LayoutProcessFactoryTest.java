package com.dp.designpatternstest.DynamicStrategyPattern;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author MikeWang
 * @date 2022/11/24 6:23 PM
 */
@SpringBootTest
class LayoutProcessFactoryTest {

    @Autowired
    private LayoutProcessFactory processFactory;

    @Test
    void testChild() throws IllegalAccessException {
        // 通过反射获取Channel
        final Field childChannel = ReflectionUtils.findField(LayoutChildStrategy.class, "CHILD_CHANNEL");
        Assertions.assertNotNull(childChannel);
        childChannel.setAccessible(true);  // XXX: setAccessible 后续可能会禁止这样使用
        String childChannelStr = (String) childChannel.get(LayoutChildStrategy.class);
        // 初始化Context
        LayoutContext ctx = LayoutContext.builder().channel(childChannelStr).build();
        //
        processFactory.exec(ctx);
        assertEquals("111", ctx.getLayoutId());
    }

    @Test
    void testLpv() {
        LayoutContext ctx = LayoutContext.builder().channel("LP-XX-XX-02").build();
        processFactory.exec(ctx);
        assertEquals("222", ctx.getLayoutId());
    }

    @Test
    void testDefault() {
        final LayoutContext ctx = LayoutContext.builder().build();
        processFactory.exec(ctx);
        assertEquals("999", ctx.getLayoutId());
    }
}
