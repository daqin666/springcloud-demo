package org.example.fallback;

import feign.hystrix.FallbackFactory;
import org.example.feign.StudentFeign;
import org.springframework.stereotype.Component;

@Component
public class StudentFallback implements FallbackFactory<StudentFeign> {

    @Override
    public StudentFeign create(Throwable throwable) {
        return new StudentFeign() {
            @Override
            public String hello() {
                return "student hello fallback...";
            }

            @Override
            public String hello2() {
                return "student hello2 fallback...";
            }
        };
    }
}
