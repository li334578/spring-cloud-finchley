package com.didispace.alibabanacosdiscoveryclientcommon4.Controller;


import com.didispace.alibabanacosdiscoveryclientcommon4.inter.Client;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Title HelloController
 * @Author liWenBo
 * @Date 2020/7/16 16:44
 * @Description
 */
@Slf4j
@RestController
public class HelloController {
    @Autowired
    Client client;

    @GetMapping("/hello")
    public String hello() {
        String result = client.hello("didi");
        return "Return : " + result;
    }
}
