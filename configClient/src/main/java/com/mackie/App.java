package com.mackie;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mackie on 17-7-23.
 */
@RestController
public class App {
    @Value("${neo.hello}")
    private String hello;

    @Value("${user.nameC}")
    private String userName;

    @RequestMapping("/hello")
    public String from() {
        return this.hello + " : " + userName;
    }
}
