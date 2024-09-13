package com.example.lab3_20211688.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {
    @GetMapping("/home")
    public String home(){
        return "home";
    }
}
