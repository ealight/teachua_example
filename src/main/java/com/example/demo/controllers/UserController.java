package com.example.demo.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserController {
    @GetMapping("/user/{id}")
    public String getUser(@PathVariable Long id) {
        return "user " + id;
    }

    @PostMapping("/user")
    public String addUser(@RequestParam String name) {
        return "You successfully added user with name: " + name;
    }

    @DeleteMapping("/user")
    public String deleteUser(@RequestParam Long id) {
        return "You successfully deleted user with ID: " + id;
    }

    @GetMapping("/role/{id}")
    public String getRole(@PathVariable Long id) {
        return "Role ID: " + id;
    }

    @PostMapping("/role")
    public String addRole(@RequestParam String name) {
        return "You successfully added role with name " + name;
    }

    @DeleteMapping("/role")
    public String deleteRole(@RequestParam Long id) {
        return "You successfully deleted role  ID #" + id;
    }

    @PostMapping("/signin")
    public String signIn(@RequestParam String email,
                         @RequestParam String password) {
        return "You successfully login into system " + email + " pass: " + password;
    }

    @DeleteMapping("/signin")
    public String signOut(@RequestParam Long id) {
        return "You successfully logout from system " + id;
    }

    @PostMapping("/signup")
    public String signUn(@RequestParam String email,
                         @RequestParam String password) {
        return "You successfully registered into system " + email + " pass: " + password;
    }
}
