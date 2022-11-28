package com.dp.designpatternstest.AdapterPattern;

/**
 * @author MikeWang
 * @date 2022/11/25 11:01 AM
 */

import org.springframework.stereotype.Component;

/**
 * 小班课适配器(类适配器)
 */
@Component
public class SmallClassAdapter2 extends RemoteClassClientImpl implements ClassService {
    private static final String TYPE = "2";

    @Override
    public boolean match(String classType) {
        return TYPE.equals(classType);
    }

    @Override
    public ClassInfoBO getClassInfo(String classId) {
        final SmallClass small = super.getSmall();
        return ClassInfoBO.builder()
                .type("2")
                .classId(classId)
                .lessonNo(small.getLessonNo()).lessonName(small.getLessonName())
                .build();
    }
}
