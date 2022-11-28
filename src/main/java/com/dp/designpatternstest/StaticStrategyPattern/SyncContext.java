package com.dp.designpatternstest.StaticStrategyPattern;

/**
 * @author MikeWang
 * @date 2022/11/24 5:55 PM
 */

import lombok.Builder;
import lombok.Data;

/**
 * 同步上下文
 *
 */
@Data
@Builder
public class SyncContext {
    // 任务ID
    private Long taskId;
    // 任务类型 1: 自然注册; 2: 团购用户; 3: 落地页留资
    private Integer taskType;
    // 所有留资相关信息(忽略细节)
    private Object reqVO;

    // 存储执行策略名称(伪装执行结果)
    private String respVO;
}
