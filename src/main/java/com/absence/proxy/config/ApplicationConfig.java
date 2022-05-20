package com.absence.proxy.config;

import com.absence.proxy.security.JwtConfig;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApplicationConfig {

    @Bean
    public JwtConfig jwtConfig() {
        return new JwtConfig();
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean("ribbon-template")
    @LoadBalanced
    public RestTemplate restTemplateWithRibbon() {
        return new RestTemplate();
    }

}
