package com.dp.designpatternstest.AdapterPattern;

import lombok.Builder;
import lombok.Data;

/**
 * @author MikeWang
 * @date 2022/11/25 10:53 AM
 */
@Data
@Builder
public class OneClass {
    // 课程编号
    private String lessonNo;
    // 课程名称
    private String lessonName;

    // 其他信息
    private String one;
}
