package com.example.starthere7;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "com.example.starthere7.proxy")
public class ProjectConfig {
}
