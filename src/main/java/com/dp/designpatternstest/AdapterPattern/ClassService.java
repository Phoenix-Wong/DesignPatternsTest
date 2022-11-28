package com.dp.designpatternstest.AdapterPattern;

/**
 * @author MikeWang
 * @date 2022/11/25 10:56 AM
 * 目标接口
 */
public interface ClassService {
    boolean match(String classType);

    ClassInfoBO getClassInfo(String classId);
}
