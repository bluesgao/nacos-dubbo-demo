package com.bluesgao.ndd.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.bluesgao.ndd.api.HelloService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@DubboService
@Slf4j
public class HelloServiceImpl implements HelloService {
    @Value("${msg}")
    private String msg;
    @Value("${mark}")
    private String mark;

    @SentinelResource(fallback = "sayHelloFallback", blockHandler = "sayHelloBlockHandler")
    @Override
    public String hi(String userName) {
        log.info("HelloServiceImpl->hi:{}",userName);
        return msg + userName + mark;
    }

    /**
     * fallback处理
     *
     * @param name
     * @return
     */
    public String sayHelloFallback(String name) {
        log.info("provider sayHelloFallback");
        return "provider sayHelloFallback -> " + name;
    }

    /**
     * 限流处理
     *
     * @param name
     * @param ex
     * @return
     */
    public String sayHelloBlockHandler(String name, BlockException ex) {
        log.info("provider sayHelloBlockHandler");
        return "provider sayHelloBlockHandler -> " + name;
    }

}
