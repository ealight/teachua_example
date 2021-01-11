package com.example.demo.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class NewsController {
    @GetMapping("/new/{id}")
    public String getNew(@PathVariable Long id) {
        return "new " + id;
    }

    @PostMapping("/new")
    public String addCenter(@RequestParam String name) {
        return "You successfully added new with name: " + name;
    }

    @DeleteMapping("/new")
    public String deleteCetner(@RequestParam Long id) {
        return "You successfully deleted new with ID: " + id;
    }
}
