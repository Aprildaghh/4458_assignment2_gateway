package com._3.midterm.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/4453")
public class MainRESTController {

    @RequestMapping("/hello")
    public String hello() {
        return "hello, class";
    }

}
