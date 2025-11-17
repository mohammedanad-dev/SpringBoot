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
  @GetMapping("/sum")
    public int sum(@RequestParam int a, @RequestParam int b) {
        return a + b;

    }
  @GetMapping("/greet")
    public String greet(@RequestParam String name) {
        return "Hello " + name;
    }
  @GetMapping("/upper")
    public String upper(@RequestParam String text) {
        return text.toUpperCase();
    }
   @GetMapping("/random")
    public int random() {
        return (int) (Math.random()*100)+1;
    }
 //    public record info(String name, String city, String language) {
//    }
//
//    @GetMapping("/info")
//    public info info() {
//        return new info("Mohammed", "Alamerat", "java");
//    }

    @GetMapping("/info")
    public Info getInfo() {
        return new Info("Mohammed", "Alamerat", "java");
}
}
