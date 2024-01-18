package org.example.feign;

import org.example.fallback.StudentFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

//@FeignClient(name = "student", url = "localhost:7003/student")
@FeignClient(value = "student", path = "student", fallbackFactory = StudentFallback.class)
public interface StudentFeign {

    @GetMapping(path = "test/hello")
    public String hello();

    @GetMapping(path = "test/hello2")
    public String hello2();
}
