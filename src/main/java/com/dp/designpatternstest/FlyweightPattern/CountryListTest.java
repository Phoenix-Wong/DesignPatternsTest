package com.dp.designpatternstest.FlyweightPattern;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * @author MikeWang
 * @date 2022/12/2 6:12 PM
 */
@SpringBootTest
class CountryListTest {

    @Test
    void testFactory() {
        final CountryList cl = CountryListFactory.getDefaultCl();
        assertNotNull(cl);
    }
}
