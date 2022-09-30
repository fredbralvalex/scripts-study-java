package com.fbaa.functionalprogramming;

import java.util.List;

public class FP01Exercises {

	public static void main (String [] args) {
		List<String> courses = List.of("Spring", "Springboot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
		printAllCourses(courses);
		printAllCoursesContaining(courses, "Spring");
		printAllCoursesWithMinLength(courses, 4);
		printAllCoursesNumberOfCharacters(courses);
	}
	
	private static void printAllCoursesWithMinLength(List<String> courses, int length) {
		System.out.println();
		courses.stream()
			.filter(name->name.length()>=length)
			.forEach(System.out::println);
		
	}

	private static void printAllCoursesContaining(List<String> courses, String string) {
		System.out.println();
		courses.stream()
			.filter(name->name.contains(string))
			.forEach(System.out::println);
	}

	private static void printAllCourses(List<String> courses) {
		System.out.println();
		courses.stream()
			.forEach(System.out::println);
		
	}
	
	private static void printAllCoursesNumberOfCharacters(List<String> courses) {
		System.out.println();
		courses.stream()
			.map(course->course.length())
			.forEach(System.out::println);
		
	}
}
