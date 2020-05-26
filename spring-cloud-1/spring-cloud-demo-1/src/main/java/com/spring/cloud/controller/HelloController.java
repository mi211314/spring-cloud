package com.spring.cloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloController
 * @Description HelloController
 * @Author miaolei
 * @Date 2020/5/26 23:06
 * @Version 1.0
 */
@Slf4j
@RestController
public class HelloController {

    /**
     * 返回Hello world
     * @return 响应对象
     */
    @GetMapping("/hello")
    public String hello() {
        log.info("Hello world!");
        return "Hello world!";
    }

}
