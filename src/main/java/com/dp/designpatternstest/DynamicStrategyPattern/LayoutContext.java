package com.dp.designpatternstest.DynamicStrategyPattern;

/**
 * @author MikeWang
 * @date 2022/11/24 6:16 PM
 */

import lombok.Builder;
import lombok.Data;

/**
 * 布局上下文
 *
 */
@Data
@Builder
public class LayoutContext {
    // 落地页版本(Landing Page Version)
    private String lpv;

    // 国家地区
    private String country;
    // 渠道号
    private String channel;

    // 最终处理结果 拿到布局ID
    private String layoutId;
}
