package com.example.job.Controller;


import com.example.job.Entity.User;
import com.example.job.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    /***********Hantera formuläret************/
    // Hämtar info "get" och renderar en vy

    @GetMapping("/showFormUser")
    public String showFormUser(@ModelAttribute("user")User user, Model model){
        model.addAttribute("users", userService.getAllUsers());
        return "user";
    }

    // Skicka info "post" sparar en användare

    @PostMapping ("/saveUser")
    public String saveUser(@ModelAttribute("user") User user){
        userService.saveUser(user);
        return "redirect:/showFormUser";
    }
}
