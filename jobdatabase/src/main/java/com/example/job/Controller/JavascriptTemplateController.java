package com.example.job.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JavascriptTemplateController {

    @GetMapping("/showPage")
    public String showPage(){
        return "javascriptTemplate";
    }
}
