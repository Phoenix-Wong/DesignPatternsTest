package com.dp.designpatternstest.AdapterPattern;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @author MikeWang
 * @date 2022/11/25 10:57 AM
 */
@Component
@RequiredArgsConstructor
public class OneClassAdapter implements ClassService{
    private static final String TYPE = "1";

    private final RemoteClassClient classClient;

    @Override
    public boolean match(String classType) {
        return TYPE.equals(classType);
    }

    @Override
    public ClassInfoBO getClassInfo(String classId) {
        final OneClass one = classClient.getOne();
        return ClassInfoBO.builder()
                .type("1")
                .classId(classId)
                .lessonNo(one.getLessonNo()).lessonName(one.getLessonName())
                .build();
    }
}
