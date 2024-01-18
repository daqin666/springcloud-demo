package org.example.controller;

import org.example.feign.StudentFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/test")
public class TestController {

    @Autowired
    private StudentFeign studentFeign;

    @GetMapping(path = "/hello2")
    public String hello() {
        return studentFeign.hello2();
    }
}
