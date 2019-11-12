package com.fcy.servicefeign.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

//componet 注解必须加，否则报错
@Component
public class FeignServiceHystric implements FeignService {

    public String feignHello(@RequestParam(value = "name") String name){
        return "sorry," + name;
    }
}
