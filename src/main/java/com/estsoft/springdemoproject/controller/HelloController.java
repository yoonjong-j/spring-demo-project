package com.estsoft.springdemoproject.controller;

import com.estsoft.springdemoproject.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private HelloService service;

    public HelloController(HelloService service) {  // 생성자 주입(Dependency Injection) - DI 사용해서 spring에게 제어권 맡김
        this.service = service;
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "param", defaultValue = "Spring") String param) {
        // 객체 직접 생성(객체 직접 제어 예시), 호출
//        HelloService service = new HelloService();
//        return service.printHello(param);

        return service.printHello(param);
    }
}