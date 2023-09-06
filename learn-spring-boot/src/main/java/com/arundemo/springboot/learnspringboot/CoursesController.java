package com.arundemo.springboot.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CoursesController {
	
	@RequestMapping("/Courses")
	public List<Course> retrieveAllCourses(){
		return Arrays.asList(
				new Course(1,"Manual Testing","com.ArunDemo"),
				new Course(2,"Automation Testing","com.ArunDemo")
				);
	}

}
