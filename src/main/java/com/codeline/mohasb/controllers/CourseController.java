package com.codeline.mohasb.controllers;

import com.codeline.mohasb.utility.Course;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@CrossOrigin(origins = "*")
@RestController
public class CourseController {

    private List<Course> courseList = new ArrayList<>();
    private int idCounter = 1;

    @PostMapping("create")
    public String createCourse(@RequestBody Course requestObj) {

        requestObj.setId(idCounter);
        requestObj.setCreatedDate(new Date());
        requestObj.setIsActive(true);

        courseList.add(requestObj);

        return "Course created with ID: " + idCounter++;
    }

    @GetMapping("getAll")
    public List<Course> getAllCourses() {
        List<Course> activeCourses = new ArrayList<>();

        for (Course c : courseList) {
            if (c.getIsActive()) {
                activeCourses.add(c);
            }
        }
        return activeCourses;
    }

    @GetMapping("getById")
    public Course getCourse(@RequestParam int id) {
        for (Course c : courseList) {
            if (c.getId() == id && c.getIsActive()) {
                return c;
            }
        }
        return Course.builder().build();
    }

    @PutMapping("update")
    public String updateCourse(@RequestBody Course updateObj) {

        if (updateObj != null && updateObj.getId() != null) {

            Course existingCourse = findCourseById(updateObj.getId());

            courseList.remove(existingCourse);

            existingCourse.setName(updateObj.getName());
            existingCourse.setInstructor(updateObj.getInstructor());
            existingCourse.setUpdatedDate(new Date());

            courseList.add(existingCourse);

            return "Course updated successfully";
        }
        return "Course not found";
    }

    @DeleteMapping("delete/{id}")
    public String deleteCourse(@PathVariable int id) {

        Course existingCourse = findCourseById(id);

        if (existingCourse.getId() > 0) {
            courseList.remove(existingCourse);

            existingCourse.setIsActive(false);
            existingCourse.setUpdatedDate(new Date());

            courseList.add(existingCourse);

            return "Course deleted successfully";
        }
        return "Invalid id";
    }

    public Course findCourseById(int id) {
        for (Course c : courseList) {
            if (c.getId() == id) {
                return c;
            }
        }
        return Course.builder().id(-1).build();
    }
}
