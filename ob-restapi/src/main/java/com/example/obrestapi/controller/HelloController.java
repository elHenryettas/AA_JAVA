package com.example.obrestapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @GetMapping("/hola")
    public String holamundo(){
        return "hola mundosssssssssssss";
    }
}
