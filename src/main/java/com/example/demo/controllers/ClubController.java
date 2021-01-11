package com.example.demo.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ClubController {
    @GetMapping("/club/{id}")
    public String getClub(@PathVariable Long id) {
        return "club id" + id;
    }

    @PostMapping("/club")
    public String addClub(@RequestParam String name) {
        return "You successfully added club with name: " + name;
    }

    @DeleteMapping("/club")
    public String deleteClub(@RequestParam Long id) {
        return "You successfully deleted club with ID: " + id;
    }


    @GetMapping("/category/{id}")
    public String getCategory(@PathVariable Long id) {
        return "category " + id;
    }

    @PostMapping("/category")
    public String addCategory(@RequestParam String name) {
        return "You successfully added category with name: " + name;
    }

    @DeleteMapping("/category")
    public String deleteCategory(@RequestParam Long id) {
        return "You successfully deleted category with ID: " + id;
    }


    @GetMapping("/activity/{id}")
    public String getActivity(@PathVariable Long id) {
        return "activity " + id;
    }

    @PostMapping("/activity")
    public String addActivity(@RequestParam String name) {
        return "You successfully added activity with name: " + name;
    }

    @DeleteMapping("/activity")
    public String deleteActivity(@RequestParam Long id) {
        return "You successfully deleted activity with ID: " + id;
    }

    @GetMapping("/club/{clubId}/contact/{contactId}")
    public String getClubContact(@PathVariable Long clubId,
                                 @PathVariable Long contactId) {
        return "club id " + clubId + " contact id " + contactId;
    }

    @PostMapping("/club/{id}/contact")
    public String addClubContact(
            @PathVariable Long id,
            @RequestParam String name) {
        return "You successfully added contact with name: " + name + " for club " + id;
    }

    @DeleteMapping("/club/{clubId}/contact")
    public String deleteClubContact(
            @PathVariable Long clubId,
            @RequestParam Long id) {
        return "You successfully deleted contact with id: " + id + " for club id: " + clubId;
    }

    @GetMapping("/club/{clubId}/rate/{rateId}")
    public String getClubRate(@PathVariable Long clubId,
                                 @PathVariable Long rateId) {
        return "club id " + clubId + " rating id " + rateId;
    }

    @PostMapping("/club/{id}/rate")
    public String addClubRate(
            @PathVariable Long id,
            @RequestParam String name) {
        return "You successfully added rate with name: " + name + " for club " + id;
    }

    @DeleteMapping("/club/{clubId}/rate")
    public String deleteClubRate(
            @PathVariable Long clubId,
            @RequestParam Long id) {
        return "You successfully deleted rate with id: " + id + " for club id: " + clubId;
    }
}
