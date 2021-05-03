package com.example.practice.controller;

import com.example.practice.entity.Car;
import com.example.practice.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping("showCar")
    public String showCar(@ModelAttribute("car") Car car, Model model){
        model.addAttribute("cars", carService.getAllCars());
        return "index";
    }

    @PostMapping("saveCar")
    public String saveCar(@ModelAttribute("car") Car car){
        carService.saveCar(car);
        return "redirect:/showMain";
    }
}
