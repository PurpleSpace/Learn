package com.hongcheng.service.impl;

import com.example.service.SayHelloService;
import org.springframework.stereotype.Service;

/**
 * @author BaiYu
 * @date 2021/4/26 14:03
 */
@Service
public class SayHelloServiceImpl implements SayHelloService {
    @Override
    public String buildString(String userName) {
//        System.out.println("provider");
        return String.format("用户:%s", userName);
    }
}
