package com.example.starthere7;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
//FeignClient
//@EnableFeignClients(basePackages = "com.example.starthere7.proxy")
public class ProjectConfig {

    //WebClient
    @Bean
    public WebClient webClient() {
        return WebClient.builder().build();
    }
}


