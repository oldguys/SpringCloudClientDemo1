package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Value;
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

    @RequestMapping(value = "/hi")
    public String hi(){
        return foo;
    }
}