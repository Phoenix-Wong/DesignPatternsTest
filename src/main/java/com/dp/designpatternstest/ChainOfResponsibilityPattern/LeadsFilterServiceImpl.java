package com.dp.designpatternstest.ChainOfResponsibilityPattern;

/**
 * @author MikeWang
 * @date 2022/11/28 10:35 AM
 */

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 线索拦截器
 */
@Slf4j
@Service
public class LeadsFilterServiceImpl implements LeadsFilterService, ApplicationContextAware {
    private ApplicationContext appCtx;

    @Override
    public void filter(LeadsBO bo, List<String> filterChain) {
        for (String fc : filterChain) {
            final Filter filter = appCtx.getBean(fc, Filter.class);
            filter.process(bo);
            if (!bo.isValid()) {
                log.error("[线索拦截] 数据异常 errMsg=>{}", bo.getErrMsg());
                return;
            }
        }
    }

    @Override
    public void setApplicationContext(ApplicationContext ctx) throws BeansException {
        appCtx = ctx;
    }
}
