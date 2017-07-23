package com.mackie;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by mackie on 17-7-8.
 */
@FeignClient("spring-cloud-eureka-client")
public interface GreetingClient {
    @RequestMapping("/greeting")
    String greeting();
}
