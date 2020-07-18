package com.didispace.alibabanacosdiscoveryclientcommon2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AlibabaNacosDiscoveryClientCommon2Application {

    public static void main(String[] args) {
        SpringApplication.run(AlibabaNacosDiscoveryClientCommon2Application.class, args);
    }

}
