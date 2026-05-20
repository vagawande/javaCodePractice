package com.studentapp;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Student {

	private String name;
	private int age;
	private String studentId;
	private List<String> courses;
	
	public Student(String name, int age, String studentId) {
		super();
		if(validateAge(age) && validateName(name) && validateStudentID(studentId)) {
			this.name = name;
			this.age = age;
			this.studentId = studentId;
			courses = new ArrayList<String>();
		}		
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", studentId=" + studentId + ", courses=" + courses + "]";
	}

	public void enrollCourse(String course) {
		if(validateCourseName(course)) {
			if(!courses.contains(course)) {
				courses.add(course);
				System.out.println("Student is enrolled to "+ course+ " successfully!");
			} else {
				System.err.println("Student is already enrolled to the Course "+course);
			}
		}
	}
	
	public void printStudentInfo() {
		System.out.println("========= Student Information =========");
		System.out.println("Student Name: "+name);
		System.out.println("Student Age: "+age);
		System.out.println("Student ID: "+studentId);
		System.out.println("Enrolled for: "+courses);
	}
	
	//Validation methods 
	
	public boolean validateAge(int age) {
		if(age>=19 && age<=35) {
			return true;
		} else {
			System.err.println("Invalid age!! Student age needs to be between 19 and 35.");
			return false;
		}
	}
	
	public boolean validateName(String name) {
		String nameRegex = "^[a-zA-Z\\s]+$";
		Pattern namePattern = Pattern.compile(nameRegex);
		Matcher nameMatcher = namePattern.matcher(name);
		if(nameMatcher.matches()) {
			return true;
		} else {
			System.err.println("Invalid Name!!! Please enter alphabets only.");
			return false;
		}
	}
	
	private boolean validateStudentID(String studentId) {
		//String studentIDRegex = "S-[0-9]+$"; //S-12332
		String studentIDRegex = "S-\\d+$";
		Pattern studentIDPattern = Pattern.compile(studentIDRegex);
		Matcher studentIDMatcher = studentIDPattern.matcher(studentId);
		if(studentIDMatcher.matches()) {
			return true;
		} else {
			System.err.println("Invalid Student ID...... Use the format Ex. S-4535");
			return false;
		}		
	}
	
	public boolean validateCourseName(String course) {
		if(course.equalsIgnoreCase("Java") || course.equalsIgnoreCase("DSA") || course.equalsIgnoreCase("Devops")) {
			return true;
		} else {
			System.err.println("Invalid Course Name!! Please select courses from the List!! [Java,DSA,DevOps]");
			return false;
		}
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getStudentId() {
		return studentId;
	}

	public List<String> getCourses() {
		return courses;
	}

}
