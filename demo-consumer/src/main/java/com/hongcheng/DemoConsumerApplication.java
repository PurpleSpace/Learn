package com.hongcheng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(value = {"consumer.xml"})	//TODO 不知道为啥，反正不写就报错
public class DemoConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoConsumerApplication.class, args);
	}

}
