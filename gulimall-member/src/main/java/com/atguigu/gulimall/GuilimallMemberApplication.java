package com.atguigu.gulimall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/*
* 想要远程调用别的服务：
* 1.引入openFeign
* 2.编写一个接口，告诉SpringCloud这个接口需要调用远程服务
* 3.开启远程调用功能
* */
@EnableFeignClients(basePackages = "com.atguigu.gulimall.member.feign")
@EnableDiscoveryClient
@SpringBootApplication
public class GuilimallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(GuilimallMemberApplication.class, args);
    }

}
