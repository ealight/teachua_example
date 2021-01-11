package com.example.demo.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class CenterController {
    @GetMapping("/center/{id}")
    public String getCenter(@PathVariable Long id) {
        return "center " + id;
    }

    @PostMapping("/center")
    public String addCenter(@RequestParam String name) {
        return "You successfully added center with name: " + name;
    }

    @DeleteMapping("/center")
    public String deleteCetner(@RequestParam Long id) {
        return "You successfully deleted center with ID: " + id;
    }
}
