package com.mark.bankapp.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
@RestController
public class BankController {


    @GetMapping("/")
    public String home(){
        return "Welcome";
    }
}
