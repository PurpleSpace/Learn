package com.example.service;

/**
 * @author BaiYu
 * @date 2021/4/25 17:29
 */
public interface SayHelloService {
    /**
     * sayHello
     * @param userName get from controller
     * @return Say hello : {username}
     */
    public String buildString(String userName);
}
