package com.testy.testyapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/demo")
public class Demo {

    //Get endpoint to serve /demo/data.
    @GetMapping(value = "/data")
    public String getDemoData() {
        System.out.println("Executing getDemoData method");
        return "Demo Data";
    }
}
