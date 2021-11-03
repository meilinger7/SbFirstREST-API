package com.htlimst.sbfirstrestapi.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String helloWorld() {
        System.out.println("Compilliert...");
        return "Hawe dere";
    }

}
