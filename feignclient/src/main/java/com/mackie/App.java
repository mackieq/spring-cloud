package com.mackie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by mackie on 17-7-8.
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@Controller
public class App {
    @Autowired
    private GreetingClient greetingClient;

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @RequestMapping("/get-greeting")
    public String greeting(Model model) {
        model.addAttribute("greeting", greetingClient.greeting());
        return "greeting-view";
    }
}
