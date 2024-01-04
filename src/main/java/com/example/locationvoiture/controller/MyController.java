package com.example.locationvoiture.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {


    @GetMapping({"/home", "/"})
    public String home() {
        return "home";
    }
    @GetMapping("/hello")
    public String hello() {
        return "index";
    }
    @GetMapping("/login")
    public String login() {

        return "login";
    }



}
