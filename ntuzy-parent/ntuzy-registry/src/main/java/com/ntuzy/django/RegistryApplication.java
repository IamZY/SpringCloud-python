package com.ntuzy.django;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author IamZY
 * @create 2020/2/29 14:13
 */
@SpringBootApplication
@EnableEurekaServer
public class RegistryApplication {
    public static void main(String[] args){
        SpringApplication.run(RegistryApplication.class);
    }
}
