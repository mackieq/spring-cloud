package com.mackie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mackie on 17-7-8.
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @RequestMapping("/greeting")
    public String greeting() {
        return "Hello from EurekaClient!";
    }
}
