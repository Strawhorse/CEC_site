package com.cct_site.cct_site.controller;


import com.cct_site.cct_site.dto.TeacherDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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


    // handler method to handle teacher registration form request
//    unsure whether this should be GET or POST

    @GetMapping("/register")
    public String showRegistrationForm(Model model) {

        // create model object to store form data
        TeacherDTO teacher = new TeacherDTO();
        model.addAttribute("teacher", teacher);
        return "register";
    }



}
