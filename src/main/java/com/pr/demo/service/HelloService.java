package com.pr.demo.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Service;

/**
 * @ClassName HelloService
 * @Description: TODO
 * @Author lxc
 * @Date 2020/3/28 15:14
 * @Version V1.0
 **/
@Service
public class HelloService {
    @SentinelResource("test")
    public String hello() {
        return "Hello World Sentinel";
    }
}
