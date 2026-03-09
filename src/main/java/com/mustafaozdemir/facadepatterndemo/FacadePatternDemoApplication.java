package com.mustafaozdemir.facadepatterndemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages= {"com.mustafaozdenmir"})
@ComponentScan(basePackages = {"com.mustafaozdemir"})
public class FacadePatternDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(FacadePatternDemoApplication.class, args);
    }

}
