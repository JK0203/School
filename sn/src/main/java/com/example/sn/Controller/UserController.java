package com.example.sn.Controller;


import com.example.sn.Entity.User;
import com.example.sn.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    /**** Render welcome page ***/
    @GetMapping("/")
    public String welcome(){
        return "welcome";
    }

    /**** Go to register form ***/
    @GetMapping("/register")
    public String registerUser(Model model){
        User user = new User();
        model.addAttribute("user", user);
        List<String> cities = Arrays.asList("Malmö", "Göteborg", "Stockholm");
        model.addAttribute("cities", cities);
        return "register";
        //return "register_form";
}

    /**** Submit user register form ***/
    @PostMapping("/register")
    public String submitRegistrationForm(@ModelAttribute("user") User user,
                                         @RequestParam("password") String passwordOne,
                                         @RequestParam("passwordTwo") String passwordTwo){
        if (passwordOne.equals(passwordTwo)){
            return "login";
        }
        return "failed";
    }

    /**** Go to login form ***/
    @GetMapping("/login")
    public String loginUser(Model model,
                            User user){
        model.addAttribute("user", user);
        return "login";
    }

    /**** Log in user and go to user's main page ***/
    @PostMapping ("/login")
    public String logIn(@ModelAttribute("user") User user,
                        @RequestParam("login") String loginInput,
                        @RequestParam("password") String password){




        return "myposts";
    }


}
