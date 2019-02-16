package com.abhijit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class RadioApp {
//Earlier it didnt work since we didnt have the component scan path declared
    public static void main(String... args){
        SpringApplication.run(RadioApp.class,args);
    }

}

