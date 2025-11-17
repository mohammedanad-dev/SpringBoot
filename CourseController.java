
package com.codeline.mohasb;

import org.springframework.web.bind.annotation.*;

        import java.util.HashMap;
        import java.util.Map;

@RestController
public class CourseController {
    private Map<Integer,String> courses = new HashMap<>();
    private int idCounter = 1;

    @PostMapping("create")
    public String createCourse(@RequestParam String name){
        courses.put(idCounter , name);
        return "Course created with ID: " + idCounter++;
    }

    @GetMapping("getAll")
    public Map<Integer, String> getAllCourses(){
        return courses;
    }

    @GetMapping ("getById")
    public String getCourse(@RequestParam int id ){
        return courses.getOrDefault(id , "course not found");
    }

    @PutMapping("update")
    public String updateCourse(@RequestParam int id,@RequestParam String name){
        if (courses.containsKey(id)){
            courses.put(id, name);
            return  "course updated successfully";
        }
        return "course not found ";
    }

    @DeleteMapping("delete/{id}")
    public String deleteCourse(@PathVariable int id){
        if (courses.remove(id) != null){
            return "course deleted successfully";
        }
        return "course not found";
    }
}
