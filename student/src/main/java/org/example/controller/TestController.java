package org.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = "/test")
public class TestController {

    @Value("{server.port}")
    private String port;

    @GetMapping(path = "/hello", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String hello() throws InterruptedException {
//        Thread.sleep(1500);
        System.out.println("student port: " + port);
        return "hello world!";
    }
    @GetMapping(path = "/hello2", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String hello2() {
        int i = 1/0;
        System.out.println("student port: " + port);
        return "hello world!";
    }

}
