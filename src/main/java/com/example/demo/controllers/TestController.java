package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huangrenhao
 * @date 2019/2/28
 */
@RestController
public class TestController {

    @Value("${foo}")
    private String foo;

    @Value("${foo1}")
    private String foo1;

    @Autowired
    private Environment env;

    @RequestMapping(value = "/hi")
    public String hi(){

        return env.getProperty("foo");
    }

    @RequestMapping(value = "/foo1")
    public String foo1(){
        return foo1;
    }
}
