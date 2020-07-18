package com.didispace.alibabanacosdiscoveryserver03.Service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * @Title HelloService
 * @Author liWenBo
 * @Date 2020/7/17 10:01
 * @Description
 */
@Service
public class HelloService {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @SentinelResource(value = "doSomeThing", blockHandler = "exceptionHandler")
    public String hello(String str) {
        logger.info(str);
        return "hello";
    }

    // 降级
    public String exceptionHandler(String str, BlockException e) {
        logger.error("blockHandler：" + str, e);
        logger.error("默认处理：" + str, e);
        return "这里是默认处理方法";
    }

    // 熔断
    @SentinelResource(value = "doSomeThing2", fallback = "fallbackMethod")
    public String hi(String str) {
        logger.error("正常执行：" + str);
        Random random = new Random();
        if (random.nextInt() > 4){
            throw new RuntimeException("发生异常");
        }else {
            return "不大于四";
        }
    }

    // 熔断处理方法

    public String fallbackMethod(String str) {
        logger.error("这是fallbackMethod" + str);
        return "fallbackMethod";
    }
}
