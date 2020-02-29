package com.ntuzy.service.conotroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author IamZY
 * @create 2020/2/29 15:14
 */
@RestController
public class JavaController {
    @Autowired
    private RestTemplate restTemplate;
    @RequestMapping("/java-user")
    public String JavaUser() {
        return "{'username': 'java', 'password': 'java'}"  ;
    }
    @RequestMapping("/python-user")
    public String PythonUser() {
        return restTemplate.getForEntity("http://py-sidecar/hello", String.class).getBody();
    }
}
