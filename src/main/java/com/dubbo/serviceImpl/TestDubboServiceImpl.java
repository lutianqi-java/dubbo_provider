package com.dubbo.serviceImpl;

import com.dubbo.service.TestDubboService;

public class TestDubboServiceImpl implements TestDubboService {

    public String eat() {
        System.err.println("111111");
        return "测试成功";
    }
}
