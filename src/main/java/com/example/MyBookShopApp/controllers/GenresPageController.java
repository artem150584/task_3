package com.example.MyBookShopApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GenresPageController {

    @GetMapping("/genres/index.html")
    public String genresPage() {
        return "genres/index";
    }

    @GetMapping("/index.html")
    public String mainPage(Model model) {
        return "redirect:/bookshop/main";
    }
}
