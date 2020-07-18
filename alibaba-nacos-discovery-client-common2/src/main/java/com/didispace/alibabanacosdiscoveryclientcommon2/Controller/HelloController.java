package com.didispace.alibabanacosdiscoveryclientcommon2.Controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Title HelloController
 * @Author liWenBo
 * @Date 2020/7/16 15:21
 * @Description
 */
@Slf4j
@RestController
public class HelloController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/hello")
    public String hello(){
        String result = restTemplate.getForObject("http://alibaba-nacos-discovery-server/hello?name=didi", String.class);
        return "Return : " + result;
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
