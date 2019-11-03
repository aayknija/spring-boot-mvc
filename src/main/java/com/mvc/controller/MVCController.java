package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MVCController {

    @GetMapping("/welcome")
    public String welcome(Model model){
        return "index";
    }
}
