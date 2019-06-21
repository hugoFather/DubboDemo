package com.alibaba.dubbo.demo;

import java.util.List;

/**
 * Create by Administrator on 2019-06-17.
 */
public interface  DemoService {
    List<String> getPermissions(Long id);
}