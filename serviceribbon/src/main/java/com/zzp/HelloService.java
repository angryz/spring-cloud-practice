package com.zzp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author Zheng Zhipeng
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    public String helloService(String name) {
        return restTemplate.getForObject("http://SERVICE-HELLO/hello?name=" + name, String.class);
    }
}
