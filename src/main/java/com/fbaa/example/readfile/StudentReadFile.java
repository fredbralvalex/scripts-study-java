package com.fbaa.example.readfile;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class StudentReadFile {

	public static void main(String[] args) {
		StudentReadFile solution = new StudentReadFile();
		System.out.println(solution.getStudentInfo());
	}

	private StudentInfo getStudentInfo() {
		StudentInfo studentInfo = null;

		JSONParser parser = new JSONParser();
		try {
			FileReader reader = new FileReader("./StudentCourses.json");
			Object obj = parser.parse(reader);
			JSONObject json = (JSONObject) obj;

			JSONArray jsonStudentList = (JSONArray) json.get("students");
			JSONArray jsonCourseList = (JSONArray) json.get("courses");

			List<StudentInfo> studentList = new ArrayList<>();
			for (Object el : jsonStudentList) {
				if (el != null) {
					Function<JSONObject, StudentInfo> parseStudent = (JSONObject o) -> new StudentInfo(o.get("name"),
							o.get("id"), o.get("course"));

					studentList.add(parseStudent.apply((JSONObject)el));
				}
			}
			
			studentList.stream().forEach(System.out::println);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return studentInfo;
	}

}

class StudentInfo {
	private String name;
	private Integer id;
	private Integer course;

	public StudentInfo(Object name, Object id, Object course) {
		this.name = name.toString();
		this.id = Integer.parseInt(id.toString());
		this.course = Integer.parseInt(course.toString());
	}

	public StudentInfo(String name, Integer id, Integer course) {
		this.name = name;
		this.id = id;
		this.course = course;
	}

	@Override
	public String toString() {
		return String.format("{id: %d, name: %s, course: %d}", id, name, course);
	}
}
