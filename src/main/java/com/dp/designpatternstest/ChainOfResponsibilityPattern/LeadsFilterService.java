package com.dp.designpatternstest.ChainOfResponsibilityPattern;

import java.util.List;

/**
 * 线索拦截器
 */
public interface LeadsFilterService {

    void filter(LeadsBO bo, List<String> filterChain);
}
