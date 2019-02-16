package com.abhijit.config;

//import org.springframework.context.annotation.ComponentScan;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Configuration()
public class ServiceConfig {

    @Value("${example.property}")
    String test;

    public String getTest() {
        return test;
    }
}
