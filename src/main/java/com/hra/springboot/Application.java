package com.hra.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
@ComponentScan("com.hra")
public class Application {
    public static void main (String[] args){
        ApplicationContext ctx= SpringApplication.run(Application.class, args);
    }

    @Profile("prod")
    @Bean
    public String dummy (){
        return "something";
    }

}
