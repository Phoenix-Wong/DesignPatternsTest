package com.dp.designpatternstest.AdapterPattern;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author MikeWang
 * @date 2022/11/25 11:01 AM
 */
@SpringBootTest
class ClassServiceTest {

    @Autowired
    private ClassAdapterFactory adapterFactory;

    @Test
    void testOne() {
        String classType = "1";
        String classId = "11111111";
        Optional.ofNullable(adapterFactory.getAdapter(classType)).ifPresent(ad -> {
            final ClassInfoBO classInfo = ad.getClassInfo(classId);
            assertEquals("one", classInfo.getLessonNo());
        });
    }

    @Test
    void testSmall() {
        String classType = "2";
        String classId = "22222222";
        Optional.ofNullable(adapterFactory.getAdapter(classType)).ifPresent(ad -> {
            final ClassInfoBO classInfo = ad.getClassInfo(classId);
            assertEquals("small", classInfo.getLessonNo());
        });
    }

    @Test
    void testBig() {
        String classType = "3";
        String classId = "33333333";
        Optional.ofNullable(adapterFactory.getAdapter(classType)).ifPresent(ad -> {
            final ClassInfoBO classInfo = ad.getClassInfo(classId);
            assertEquals("big", classInfo.getLessonNo());
        });
    }
}
