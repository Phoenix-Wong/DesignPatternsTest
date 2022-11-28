package com.dp.designpatternstest.AdapterPattern;

/**
 * @author MikeWang
 * @date 2022/11/25 10:55 AM
 */
public interface RemoteClassClient {
    default OneClass getOne() {
        return OneClass.builder().lessonNo("one").lessonName("1V1").build();
    }

    default SmallClass getSmall() {
        return SmallClass.builder().lessonNo("small").lessonName("小班课").build();
    }

    default BigClass getBig() {
        return BigClass.builder().lessonNo("big").lessonName("大班课").build();
    }
}
