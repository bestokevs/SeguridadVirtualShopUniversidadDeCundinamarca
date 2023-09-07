package com.example.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;

@Controller
public class camas {

    @GetMapping("/camas")
    public String showIndex(Model model) {
        model.addAttribute("title", "camas");
        
        return "index";
    }
}
