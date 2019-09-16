package com.github.zhangzt.demo.spring.boot.example;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@Slf4j
@SpringBootApplication
public class ExampleBootstrap {
    public static void main(String[] args) {
        ApplicationContext ac = SpringApplication.run(ExampleBootstrap.class, args);
        log.info(ac.getBean("operationBean").toString());
        log.info("漫漫长夜");
    }
}
