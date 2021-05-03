package com.example.practice.controller;

import com.example.practice.entity.Customer;
import com.example.practice.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("showCustomer")
    public String showCustomer(@ModelAttribute("customer")Customer customer, Model model){
        model.addAttribute("customers", customerService.getAllCustomers());
        return "index";
    }

    @PostMapping("saveCustomer")
    public String saveCustomer(@ModelAttribute("customer") Customer customer){
        customerService.saveCustomer(customer);
        return "redirect:/showCustomer";
    }
}
