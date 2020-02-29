package com.ntuzy.sidecar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.sidecar.EnableSidecar;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @Author IamZY
 * @create 2020/2/29 14:27
 */
@SpringBootApplication
@EnableSidecar
public class SidecarApplication {
    public static void main(String[] args){
        SpringApplication.run(SidecarApplication.class);
    }
}
