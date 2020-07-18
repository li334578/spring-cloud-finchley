package com.didispace.alibabanacosdiscoveryserver02.Controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Title HelloController
 * @Author liWenBo
 * @Date 2020/7/16 13:30
 * @Description
 */
@RestController
@Slf4j
public class HelloController {

    @GetMapping("/hello")
    public String hello(@RequestParam String name) {
        log.info("invoked name = " + name);
        return "hello " + name;
    }
}
