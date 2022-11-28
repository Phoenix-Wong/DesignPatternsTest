package com.dp.designpatternstest.ChainOfResponsibilityPattern;

/**
 * @author MikeWang
 * @date 2022/11/28 10:34 AM
 */

import org.springframework.stereotype.Component;

import java.util.Objects;

/**
 * 学科过滤器
 *
 */
@Component("subject")
public class SubjectFilter implements Filter {

    @Override
    public void process(LeadsBO bo) {
        final Integer subject = bo.getSubject();
        if (Objects.isNull(subject) || (subject != 1 && subject != 2)) {
            bo.setSubject(1);
        }
    }
}
