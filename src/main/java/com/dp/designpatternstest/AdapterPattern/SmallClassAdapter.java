package com.dp.designpatternstest.AdapterPattern;

/**
 * @author MikeWang
 * @date 2022/11/25 10:58 AM
 */

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * 小班课适配器
 */
@Component
@RequiredArgsConstructor
public class SmallClassAdapter implements ClassService {
    private static final String TYPE = "2";

    private final RemoteClassClient classClient;

    @Override
    public boolean match(String classType) {
        return TYPE.equals(classType);
    }

    @Override
    public ClassInfoBO getClassInfo(String classId) {
        final SmallClass small = classClient.getSmall();
        return ClassInfoBO.builder()
                .type("2")
                .classId(classId)
                .lessonNo(small.getLessonNo()).lessonName(small.getLessonName())
                .build();
    }
}
