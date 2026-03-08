package com.in28minutes.springboot.learn_spring_boot;

import org.springframework.stereotype.Component;

@Component
public class Student {
	int rollNumber;
	int age;
	String gender;
	String department;
	String email;

	// this is comment
	public Student(int rollNumber, int age, String gender, String department, String email) {
		this.rollNumber = rollNumber;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.email = email;
	}
	public Student(int age, String gender, String department, String email) {
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.email = email;
	}
	public Student(String gender, String department, String email) {
		this.gender = gender;
		this.department = department;
		this.email = email;
	}
	public Student(String x, String y) {
		this.gender = x;
		this.department = y;
	}

	static String principal;

	public Student() {
	}
}