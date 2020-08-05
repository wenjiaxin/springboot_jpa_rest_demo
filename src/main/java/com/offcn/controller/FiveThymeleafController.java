package com.offcn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FiveThymeleafController {

    @RequestMapping("/five")
    public String indexPage(Model model){
        model.addAttribute("flag","yes");
        model.addAttribute("menu","admin");
        model.addAttribute("manager","manager");
        return "index";
    }

    @RequestMapping("/six")
    public String index(Model model){

        return "index";
    }
}
