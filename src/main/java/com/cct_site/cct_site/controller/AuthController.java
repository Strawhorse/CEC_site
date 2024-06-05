package com.cct_site.cct_site.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {

//    controller which is scanned by Spring on incoming requests


//    handler for homepage requests; maps a HTTP GET request to the /index path
//    When someone makes a GET request to this URL, the home() method is run
//    method returns the String "index", the name of the view template

    @GetMapping("/index")
    public String home(){
        return "index";
    }

    @GetMapping("/account")
    public String account(){
        return "account";
    }



}
