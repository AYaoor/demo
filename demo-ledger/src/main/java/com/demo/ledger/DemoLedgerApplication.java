package com.demo.ledger;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.demo.ledger.feign")
@MapperScan("com.demo.ledger.dao")
@SpringBootApplication
public class DemoLedgerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoLedgerApplication.class, args);
    }

}
