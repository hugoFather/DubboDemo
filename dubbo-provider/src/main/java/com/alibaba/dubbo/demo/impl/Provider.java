package com.alibaba.dubbo.demo.impl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Create by Administrator on 2019-06-17.
 */
public class Provider {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("provider.xml");
        System.out.println("**********"+context.getDisplayName() + ": here");
        context.start();
        System.out.println("**********服务已经启动...");
        //防止启动实例结束
        System.in.read();
    }

}
