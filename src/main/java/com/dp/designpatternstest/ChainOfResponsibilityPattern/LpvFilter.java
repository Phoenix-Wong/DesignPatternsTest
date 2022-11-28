package com.dp.designpatternstest.ChainOfResponsibilityPattern;

/**
 * @author MikeWang
 * @date 2022/11/28 10:33 AM
 */

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

/**
 * 落地页版本号校验
 */
@Component("lpv")
public class LpvFilter implements Filter {

    @Override
    public void process(LeadsBO bo) {
        final String lpv = bo.getLpv();
        if (StringUtils.isNoneBlank(lpv) && lpv.startsWith("XZ") && StringUtils.isBlank(bo.getPreferenceLanguage())) {
            bo.setValid(false);
            bo.setErrMsg("偏好语言不能为空");
        }
    }
}
