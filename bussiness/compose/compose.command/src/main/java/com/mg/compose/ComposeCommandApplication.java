package com.mg.compose;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
//@EnableEurekaClient
@EnableAsync
@EnableFeignClients
public class ComposeCommandApplication {

    @Autowired

    public static void main(String[] args) {
        SpringApplication.run(ComposeCommandApplication.class, args);
    }

}
