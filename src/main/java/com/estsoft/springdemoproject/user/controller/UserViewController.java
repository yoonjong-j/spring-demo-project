package com.estsoft.springdemoproject.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserViewController {
    // GET /login  -> login 페이지 연결
    @GetMapping("/login")
    public String login() {
        return "login";
    }

    // GET /signup -> 회원가입 페이지 연결
    @GetMapping("/signup")
    public String signup() {
        return "signup";
    }
}
