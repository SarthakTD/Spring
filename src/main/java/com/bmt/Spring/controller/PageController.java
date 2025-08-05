package com.bmt.Spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    // Redirect root to login page
    @GetMapping("/")
    public String home() {
        return "redirect:/message";
    }

    // Show login page
    @GetMapping("/api/login")
    public String loginPage() {
        return "login"; // loads login.html from templates/
    }

    // Show signup page
    @GetMapping("/api/signup")
    public String signupPage() {
        return "signup"; // loads signup.html from templates/
    }

    // Show message page (after login or signup)
    @GetMapping("/message")
    public String messagePage() {
        return "message"; // loads message.html from templates/
    }

}
