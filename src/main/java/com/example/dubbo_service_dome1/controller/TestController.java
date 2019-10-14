package com.example.dubbo_service_dome1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : 妖妖
 * @date : 11:56 2019/10/11
 */
@RestController
public class TestController {

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String hello(){
        return "hello";
    }
}
