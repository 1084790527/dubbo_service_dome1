package com.example.dubbo_service_dome1.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.dubbo_service_dome1.service.TestService;
import org.springframework.stereotype.Component;

/**
 * @author : 妖妖
 * @date : 14:57 2019/10/11
 */
@Service
@Component
public class TestServiceImpl implements TestService {

    @Override
    public String dubbo(String s) {
        return "888--"+s;
    }
}
