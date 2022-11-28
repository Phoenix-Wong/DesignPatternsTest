package com.dp.designpatternstest.ChainOfResponsibilityPattern;

import com.sun.tools.javac.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author MikeWang
 * @date 2022/11/28 10:36 AM
 */
@SpringBootTest
class LeadsFilterServiceTest {

    @Autowired
    LeadsFilterService service;

    @Test
    void testChannel() {
        final LeadsBO bo = LeadsBO.builder().build();
        service.filter(bo, List.of("channel", "subject", "lpv", "referrer"));
        assertFalse(bo.isValid());
    }

    @Test
    void testReferrer() {
        final LeadsBO bo = LeadsBO.builder().channel("LP-XX-XX-01").referrerId(123L).build();
        service.filter(bo, List.of("channel", "subject", "lpv", "referrer"));
        assertEquals(1, bo.getSubject());
        assertTrue(bo.isValid());
    }
}
