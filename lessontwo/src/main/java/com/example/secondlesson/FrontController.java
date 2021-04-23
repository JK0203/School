package com.example.secondlesson;

import com.example.secondlesson.Entity.User;
import com.example.secondlesson.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@Controller
public class FrontController {

    @Autowired
    private UserService userService;

    @GetMapping("/home") // url path
    public String welcome(@ModelAttribute("user") User user, Model model){
        model.addAttribute("users", userService.getAllUsers());
        return "index"; // open this file /templates/index.html
    }

    @GetMapping("/saveUser")
    public String saveUser(@ModelAttribute("user") User user){
        userService.saveUser(user);
        return "redirect:/home";

    }
}
