package com.dp.designpatternstest.StaticStrategyPattern;

/**
 * @author MikeWang
 * @date 2022/11/24 5:56 PM
 */

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Service;

/**
 * 自然注册
 *
 */
@Slf4j
@Service(SyncStrategy.OT_STRATEGY)
public class OtSyncStrategy implements SyncStrategy, BeanNameAware {
    private String beanName;

    @Override
    public void process(SyncContext ctx) {
        log.info("[自然注册] {}", ctx);
        ctx.setRespVO(beanName);
    }

    @Override
    public void setBeanName(String s) {
        beanName = s;
    }
}
