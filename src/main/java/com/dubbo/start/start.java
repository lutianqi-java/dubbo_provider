package com.dubbo.start;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class start {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] {"dubbo_provider.xml"});
        context.start();
        // press any key to exit
        System.in.read();
    }
}
