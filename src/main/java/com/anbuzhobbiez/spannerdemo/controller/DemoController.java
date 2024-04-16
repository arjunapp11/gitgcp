package com.anbuzhobbiez.spannerdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

//    @Autowired
//    EmployeeRepository employeeRepository;

    @GetMapping("/greet")
    public String greet(){
        return "welcome------";
    }
}
