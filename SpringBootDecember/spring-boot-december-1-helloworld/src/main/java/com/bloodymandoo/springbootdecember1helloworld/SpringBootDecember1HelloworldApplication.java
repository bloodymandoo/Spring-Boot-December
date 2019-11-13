package com.bloodymandoo.springbootdecember1helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootDecember1HelloworldApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDecember1HelloworldApplication.class, args);
    }

    @GetMapping("/Hello")
    public String sayHello(@Reque){

    }
}
