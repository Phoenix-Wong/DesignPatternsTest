package com.dp.designpatternstest.FlyweightPattern;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author MikeWang
 * @date 2022/12/2 5:55 PM
 */
@Slf4j
@Component
@RequiredArgsConstructor
public class CountryListFactory {
    private static final String DEFAULT = "DEFAULT";
    private static final Map<String, CountryList> CL_MAP = new HashMap<>();

    private final CountryClient countryClient;

    @PostConstruct
    public void init() {
        final List<Country> countryList = countryClient.getCountryList();
        CL_MAP.put(DEFAULT, new CountryList(countryList));
    }

    public static CountryList getDefaultCl() {
        return CL_MAP.get(DEFAULT);
    }
}
