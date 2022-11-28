package com.dp.designpatternstest.ChainOfResponsibilityPattern;

/**
 * @author MikeWang
 * @date 2022/11/28 10:28 AM
 */
/**
 * 线索过滤器
 */
public interface Filter {

    void process(LeadsBO bo);
}
