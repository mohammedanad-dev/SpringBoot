package com.codeline.mohasb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

 @GetMapping("/hello")
    public String hello() {
        return "Hello Guest";
    }
}
