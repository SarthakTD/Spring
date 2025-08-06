package com.bmt.Spring.controller;
import java.security.Principal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MessageController {
    @GetMapping("/dashboard")
    public String dashboard(Model model, Principal principal) {
        model.addAttribute("username", principal.getName());
        return "dashboard";
    }

}
