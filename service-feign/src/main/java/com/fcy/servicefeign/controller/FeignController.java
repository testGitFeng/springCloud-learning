package com.fcy.servicefeign.controller;

import com.fcy.servicefeign.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {

    @Autowired
    FeignService feignService;

    @RequestMapping(value = "/hi")
    public String FeignHello(@RequestParam(value = "name") String name){
        return feignService.feignHello(name);
    }
}
