package com.zzp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Zheng Zhipeng
 */
@RestController
public class HelloController {

    @Autowired
    SchedualServiceHelllo schedualServiceHelllo;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(@RequestParam String name) {
        return schedualServiceHelllo.sayHiFromClientOne(name);
    }
}
