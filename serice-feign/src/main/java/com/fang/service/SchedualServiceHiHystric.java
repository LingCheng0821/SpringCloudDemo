package com.fang.service;

import org.springframework.stereotype.Component;

/**
 * Created by Laura on 2018/4/3.
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
