package com.example11.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = {"/","/home"})
public class HomeController {

    @GetMapping
    public String getHomePage(Model model) {
        model.addAttribute("title","Home");
        model.addAttribute("bodyContent","home");

        return "master-template";

    }

    @GetMapping("/access_denied")
    public String accessDeniedPage(Model model){
        return "access_denied";

    }
}
