package com.example.MyBookShopApp.controllers;

import com.example.MyBookShopApp.data.Author;
import com.example.MyBookShopApp.data.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;
import java.util.Map;

@Controller
public class AuthorController {

    private final AuthorService authorService;

    @Autowired
    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @ModelAttribute("authorMap")
    public Map<String, List<Author>> authorsMap() {
        return authorService.getAuthorsMap();
    }

    @GetMapping("/authors")
    public String authorsPage(Model model) {
        model.addAttribute("authorsActive", "true");
        return "authors/index";
    }
}
