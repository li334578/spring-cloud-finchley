package com.didispace.alibabanacosdiscoveryclientcommon4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
public class AlibabaNacosDiscoveryClientCommon4Application {

    public static void main(String[] args) {
        SpringApplication.run(AlibabaNacosDiscoveryClientCommon4Application.class, args);
    }

}
