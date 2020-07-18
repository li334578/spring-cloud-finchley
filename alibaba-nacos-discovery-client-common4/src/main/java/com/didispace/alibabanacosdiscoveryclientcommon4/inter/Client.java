package com.didispace.alibabanacosdiscoveryclientcommon4.inter;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Title Client
 * @Author liWenBo
 * @Date 2020/7/16 16:45
 * @Description
 */
@FeignClient("alibaba-nacos-discovery-server")
public interface Client {
    @GetMapping("/hello")
    String hello(@RequestParam(name = "name") String name);
}
