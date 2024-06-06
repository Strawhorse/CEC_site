package com.cct_site.cct_site.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {


    @GetMapping("/index")
    public String home(){
        return "index";
    }

    @GetMapping("/account")
    public String account(){
        return "account";
    }

    @GetMapping("/register")
    public String register() {
        return "register"; // Corresponds to register.html in the templates directory
    }



}
