package com.example.MyBookShopApp.controllers;

import com.example.MyBookShopApp.data.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthorPagesController {

    private final AuthorService authorService;

    @Autowired
    public AuthorPagesController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping("/index.html")
    public String mainPage() {
        return "redirect:/bookshop/main";
    }

    @GetMapping("/authors/index.html")
    public String authorsPage(Model model) {
        model.addAttribute("authorData", authorService.getAuthorData());
        return "authors/index";
    }
}
