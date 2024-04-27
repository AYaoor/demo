package com.demo.notepad;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient // 启用服务发现客户端的功能，让服务发现组件可以找到当前服务（zk，nacos等）
@EnableFeignClients(basePackages = "com.demo.notepad.feign") // 启用feign客户端功能
@MapperScan("com.demo.notepad.dao") // 用于指定mapper接口的扫描包路径
@SpringBootApplication
public class DemoNotepadApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoNotepadApplication.class, args);
    }

}
