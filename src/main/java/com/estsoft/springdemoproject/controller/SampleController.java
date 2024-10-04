package com.estsoft.springdemoproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SampleController {

    @GetMapping("hello2")
    public String hello2() {
        return "hi";
    }
}
