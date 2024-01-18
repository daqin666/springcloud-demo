//package org.example.config;
//
//import feign.Request;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.util.concurrent.TimeUnit;
//
//@Configuration
//public class FeignConfiguration {
//
//    @Bean
//    public Request.Options options() {
//        return new Request.Options(8, TimeUnit.SECONDS, 8, TimeUnit.SECONDS, true);
//    }
//
//}