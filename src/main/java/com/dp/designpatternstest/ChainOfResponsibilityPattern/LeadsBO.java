package com.dp.designpatternstest.ChainOfResponsibilityPattern;

import lombok.Builder;
import lombok.Data;

/**
 * @author MikeWang
 * @date 2022/11/28 10:27 AM
 */

@Data
@Builder
public class LeadsBO {
    // 渠道号
    private String channel;
    // 推荐人ID
    private Long referrerId;
    // 学科 1:中文 2:英文
    private Integer subject;
    // 落地页版本(Landing Page Version)
    private String lpv;
    // 偏好语言
    private String preferenceLanguage;

    // 责任链回写
    // 数据是否有效
    @Builder.Default
    private boolean valid = true;
    // 异常信息(错误日志)
    private String errMsg;
}
