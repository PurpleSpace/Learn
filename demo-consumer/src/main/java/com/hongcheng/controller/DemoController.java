package com.hongcheng.controller;

import com.example.service.SayHelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author BaiYu
 * @date 2021/4/26 14:21
 */
@RestController
public class DemoController {

    @Resource
    SayHelloService sayHelloService;

    @ResponseBody
    @RequestMapping("/hi")
    public String say(@RequestParam(name = "userName") String userName, @RequestParam(name = "age") String age) {
        String name = sayHelloService.buildString(userName);
        return String.format(("%s 的年龄为 %s"), name, age);
    }

}
