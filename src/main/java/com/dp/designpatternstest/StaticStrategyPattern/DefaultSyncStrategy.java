package com.dp.designpatternstest.StaticStrategyPattern;

/**
 * @author MikeWang
 * @date 2022/11/24 5:57 PM
 */

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Service;

/**
 * 落地页注册(Default)
 *
 */
@Slf4j
@Service
public class DefaultSyncStrategy implements SyncStrategy, BeanNameAware {
    private String beanName;

    @Override
    public void process(SyncContext ctx) {
        log.info("[落地页注册] {}", ctx);
        ctx.setRespVO(beanName);
    }

    @Override
    public void setBeanName(String s) {
        beanName = s;
    }
}
