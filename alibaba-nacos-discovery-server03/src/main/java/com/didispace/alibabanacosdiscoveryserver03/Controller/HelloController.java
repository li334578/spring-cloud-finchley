package com.didispace.alibabanacosdiscoveryserver03.Controller;

import com.didispace.alibabanacosdiscoveryserver03.Service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Title HelloController
 * @Author liWenBo
 * @Date 2020/7/17 9:59
 * @Description
 */
@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @RequestMapping("/hello")
    public String hello() {
        String hello = helloService.hello("lwb");
        return hello;
    }


    @RequestMapping("/hi")
    public String hi() {
        String hi = helloService.hi("lwb");
        return hi;
    }
}
