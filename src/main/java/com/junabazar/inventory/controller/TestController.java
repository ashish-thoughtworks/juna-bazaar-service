package com.junabazar.inventory.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dharihar on 14/11/2016.
 */
@RestController
public class TestController {

    @RequestMapping("/")
    public String getHome() {
        return "Hello";
    }

    @RequestMapping("/test")
    public String test() {
        return "Test";
    }
}
