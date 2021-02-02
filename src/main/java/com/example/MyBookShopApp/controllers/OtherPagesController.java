package com.example.MyBookShopApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OtherPagesController {

    @GetMapping("/genres/index.html")
    public String genresPage() {
        return "genres/index";
    }

    @GetMapping("/index.html")
    public String mainPage() {
        return "redirect:/bookshop/main";
    }

    @GetMapping("/authors/index.html")
    public String authorsPage() {
        return "authors/index";
    }
}
