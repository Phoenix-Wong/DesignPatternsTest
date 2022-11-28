package com.dp.designpatternstest.ChainOfResponsibilityPattern;

/**
 * @author MikeWang
 * @date 2022/11/28 10:28 AM
 */

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

/**
 * 渠道号过滤器
 */
@Component("channel")
public class ChannelFilter implements Filter {

    @Override
    public void process(LeadsBO bo) {
        if (StringUtils.isBlank(bo.getChannel())) {
            bo.setValid(false);
            bo.setErrMsg("channel为空");
        }
    }
}
