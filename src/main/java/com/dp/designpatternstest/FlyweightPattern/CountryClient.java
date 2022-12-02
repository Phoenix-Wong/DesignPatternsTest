package com.dp.designpatternstest.FlyweightPattern;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author MikeWang
 * @date 2022/12/2 5:58 PM
 */
@Service
public class CountryClient {

    public List<Country> getCountryList(){
        Country country = new Country();
        country.setCode("US");
        country.setNameZh("美国");
        country.setNameEn("United States");
        country.setTel("+1");
        country.setPyName("mg");
        country.setSortNo("1");
        country.setAreaId(0);
        List<Country> countryList = new ArrayList<>();
        countryList.add(country);
        return countryList;
    }
}
