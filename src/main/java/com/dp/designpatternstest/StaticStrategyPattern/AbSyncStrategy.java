package com.dp.designpatternstest.StaticStrategyPattern;

/**
 * @author MikeWang
 * @date 2022/11/24 5:56 PM
 */

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Service;

/**
 * 团购用户
 *
 */
@Slf4j
@Service(SyncStrategy.AB_STRATEGY)
public class AbSyncStrategy implements SyncStrategy, BeanNameAware {
    private String beanName;

    @Override
    public void process(SyncContext ctx) {
        log.info("[团购用户] {}", ctx);
        ctx.setRespVO(beanName);
    }

    @Override
    public void setBeanName(String s) {
        beanName = s;
    }
}
