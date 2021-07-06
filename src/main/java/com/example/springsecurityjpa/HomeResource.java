package com.example.springsecurityjpa;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {
    
    @GetMapping("/")
    public String home(){
        return("Hayy");
    }

    @GetMapping("/user")
    public String user(){
        return("Hay User!!");
    }

    @GetMapping("/admin")
    public String admin(){
        return ("hay Admin");
    }
}
