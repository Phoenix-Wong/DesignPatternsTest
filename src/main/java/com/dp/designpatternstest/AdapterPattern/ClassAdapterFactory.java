package com.dp.designpatternstest.AdapterPattern;

/**
 * @author MikeWang
 * @date 2022/11/25 11:00 AM
 */

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 课程信息适配器工厂
 */
@Service
@RequiredArgsConstructor
public class ClassAdapterFactory {
    private final List<ClassService> classServiceList;

    ClassService getAdapter(String classType) {
        return classServiceList.stream()
                .filter(cs -> cs.match(classType)).findFirst()
                .orElse(null);
    }
}
