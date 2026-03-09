package com.in28minutes.springboot.learn_spring_boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;



@SpringBootApplication
public class LearnSpringBootApplication {

	@Autowired
	private Student student;

	public static void main(String[] args) {
		SpringApplication.run(LearnSpringBootApplication.class, args);
	}

	@RestController
	public static class CourseController {

		@RequestMapping("/courses")
		public List<Course> retrieveAllCourses(){
			return Arrays.asList(
					new Course(1, "Learn AWS", "in28minutes"),
					new Course(2, "Learn AWS", "in28minutes"),
					new Course(3, "Learn AWS", "in28minutes"),
					new Course(4, "Learn AWS", "in28minutes")
			);
		}
	}

	public static class Course {
		private long id;
		private String name;
		private String author;

		public Course(long id, String name, String author) {
			this.id = id;
			this.name = name;
			this.author = author;
		}

		public String getAuthor() {
			return author;
		}

		public String getName() {
			return name;
		}

		public long getId() {
			return id;
		}

		@Override
		public String toString() {
			return "Course{" +
					"id=" + id +
					", name='" + name + '\'' +
					", author='" + author + '\'' +
					'}';
		}


	}
}
