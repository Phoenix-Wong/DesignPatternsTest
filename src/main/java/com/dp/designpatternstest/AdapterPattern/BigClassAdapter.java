package com.dp.designpatternstest.AdapterPattern;

/**
 * @author MikeWang
 * @date 2022/11/25 10:58 AM
 */

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * 大班课适配器
 */
@Component
@RequiredArgsConstructor
public class BigClassAdapter implements ClassService {
    private static final String TYPE = "3";

    private final RemoteClassClient classClient;

    @Override
    public boolean match(String classType) {
        return TYPE.equals(classType);
    }

    @Override
    public ClassInfoBO getClassInfo(String classId) {
        final BigClass big = classClient.getBig();
        return ClassInfoBO.builder()
                .type("3")
                .classId(classId)
                .lessonNo(big.getLessonNo()).lessonName(big.getLessonName())
                .build();
    }
}
