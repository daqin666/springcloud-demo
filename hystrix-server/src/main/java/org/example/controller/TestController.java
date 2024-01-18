package org.example.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/test")
@DefaultProperties(defaultFallback = "globalFallback")
public class TestController {

    @HystrixCommand //(fallbackMethod = "helloFallback")
    @GetMapping(path = "/hello")
    public String hello() {
        // 测试一般异常
        int a = 1 / 0;

        // 测试超时
//        try {
//            Thread.sleep(8000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        String str = "hystrix-server test hello...";
        System.out.println(str);
        return str;
    }

    @HystrixCommand //(fallbackMethod = "helloFallback")
    @GetMapping(path = "/hello2")
    public String hello2() {
        // 测试一般异常
        int a = 1 / 0;

        // 测试超时
//        try {
//            Thread.sleep(8000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        String str = "hystrix-server test hello2...";
        System.out.println(str);
        return str;
    }

    public String helloFallback() {
        String str = "hystrix-server test hello helloFallback...";
        System.out.println(str);
        return str;
    }

    public String globalFallback() {
        String str = "hystrix-server test globalFallback...";
        System.out.println(str);
        return str;
    }
}
