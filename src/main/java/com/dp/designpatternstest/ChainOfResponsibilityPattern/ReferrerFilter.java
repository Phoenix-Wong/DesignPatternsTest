package com.dp.designpatternstest.ChainOfResponsibilityPattern;

import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * 推荐人过滤
 */
@Component("referrer")
public class ReferrerFilter implements Filter {
    private static final Set<String> CHANNELS = new HashSet<String>(){{
        add("LP-XX-XX-01");
        add("LP-XX-XX-02");
    }};

    @Override
    public void process(LeadsBO bo) {
        final String channel = bo.getChannel();
        final Long referrerId = bo.getReferrerId();
        if (CHANNELS.contains(channel) && Objects.isNull(referrerId)) {
            bo.setValid(false);
            bo.setErrMsg("特定渠道号, 推荐人不能为空");
        }
    }
}
