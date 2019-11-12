package com.fcy.servicefeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "springcloud", fallback = FeignServiceHystric.class)
public interface FeignService {
    @RequestMapping(value = "hi", method = RequestMethod.GET)
    public String feignHello(@RequestParam(value = "name") String name);
}
