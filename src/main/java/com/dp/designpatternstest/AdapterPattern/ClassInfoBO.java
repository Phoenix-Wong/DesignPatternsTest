package com.dp.designpatternstest.AdapterPattern;

/**
 * @author MikeWang
 * @date 2022/11/25 10:56 AM
 */

import lombok.Builder;
import lombok.Data;

/**
 * 课程信息
 */
@Data
@Builder
public class ClassInfoBO {
    // 课程类型 1:1v1 2:small 3:big
    private String type;

    // 班级ID
    private String classId;
    // 课程编号
    private String lessonNo;
    // 课程名称
    private String lessonName;
}
