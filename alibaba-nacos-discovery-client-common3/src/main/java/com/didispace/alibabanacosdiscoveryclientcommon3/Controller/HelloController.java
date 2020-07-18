package com.didispace.alibabanacosdiscoveryclientcommon3.Controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

/**
 * @Title HelloController
 * @Author liWenBo
 * @Date 2020/7/16 16:35
 * @Description
 */
@RestController
@Slf4j
public class HelloController {

    @Autowired
    private WebClient.Builder webClientBuilder;

    @GetMapping("/hello")
    public Mono<String> hello() {
        Mono<String> result = webClientBuilder.build()
                .get()
                .uri("http://alibaba-nacos-discovery-server/hello?name=didi")
                .retrieve()
                .bodyToMono(String.class);
        return result;
    }

    @Bean
    @LoadBalanced
    public WebClient.Builder loadBalancedWebClientBuilder() {
        return WebClient.builder();
    }
}
