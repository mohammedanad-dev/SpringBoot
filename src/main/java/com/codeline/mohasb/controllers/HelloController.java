package com.codeline.mohasb.controllers;

import com.codeline.mohasb.utility.Info;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {


    @GetMapping("/hello")
    public String hello() {
        return "Hello Guest";
    }

    @GetMapping("/hellow")
    public String hello(@RequestParam String name) {
        return "Hello " + name;
    }

    @GetMapping("/sum")
    public int sum(@RequestParam int a, @RequestParam int b) {
        return a + b;

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
//new tasks
//    private Map<Integer,String> courses = new HashMap<>();
//    private int idCounter = 1;
//
//    @PostMapping("create")
//    public String createCourse(@RequestParam String name){
//        courses.put(idCounter , name);
//        return "Course created with ID: " + idCounter++;
//    }
//
//    @GetMapping("getAll")
//    public Map<Integer, String> getAllCourses(){
//        return courses;
//    }
//
//    @GetMapping ("getById")
//    public String getCourse(@RequestParam int id ){
//        return courses.getOrDefault(id , "course not found");
//    }
//
//    @PutMapping("update")
//    public String updateCourse(@RequestParam int id,@RequestParam String name){
//        if (courses.containsKey(id)){
//            courses.put(id, name);
//            return  "course updated successfully";
//        }
//        return "course not found ";
//    }
//
//    @DeleteMapping("delete/{id}")
//    public String deleteCourse(@PathVariable int id){
//        if (courses.remove(id) != null){
//            return "course deleted successfully";
//        }
//        return "course not found";
//    }
}
