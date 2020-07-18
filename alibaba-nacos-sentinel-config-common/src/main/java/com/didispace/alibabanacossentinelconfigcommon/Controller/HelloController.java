package com.didispace.alibabanacossentinelconfigcommon.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Title HelloController
 * @Author liWenBo
 * @Date 2020/7/17 9:37
 * @Description
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "didispace.com";
    }
}
