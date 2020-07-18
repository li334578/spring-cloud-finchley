package com.didispace.alibabanacosconfigclient.Controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Title HelloController
 * @Author liWenBo
 * @Date 2020/7/16 17:05
 * @Description
 */
@Slf4j
@RestController
@RefreshScope
public class HelloController {

    @Value("${didispace.title:}")
    private String title;

    @GetMapping("/hello")
    public String hello() {
        return title;
    }
}
