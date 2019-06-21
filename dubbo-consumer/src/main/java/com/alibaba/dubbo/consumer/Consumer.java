package com.alibaba.dubbo.consumer;

import com.alibaba.dubbo.demo.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Create by Administrator on 2019-06-17.
 */
public class Consumer {
    public static void main(String[] args) {
        //测试常规服务
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        System.err.println("consumer.xml start");
        DemoService demoService = context.getBean(DemoService.class);
        System.err.println("consumer.xml");
        System.out.println(demoService.getPermissions(1L));
    }
}
