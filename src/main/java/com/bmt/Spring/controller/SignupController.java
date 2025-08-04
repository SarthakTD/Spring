package com.bmt.Spring.controller;
import com.bmt.Spring.model.User;
import com.bmt.Spring.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SignupController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/signup")
    public String showSignupForm(User user) {
        return "signup"; // shows signup.html template
    }

    @PostMapping("/signup")
    public String processSignup(@ModelAttribute("user") User user) {
        // Save user to PostgreSQL
        userRepository.save(user);
        return "redirect:/login"; // redirect to login after signup
    }
}
