package com.studentapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main3 {

	private static List<Student> studentList;
	
	public static void main(String[] args) {
		System.out.println("*************** Student Management System *******************");
		System.out.println("******************* Welcome ****************************");
		
		studentList= new ArrayList<Student>();
		
		//Read Input from Terminal
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Student Name...");
		String name = scanner.next(); // read input in string format
		System.out.println("You have entered name "+ name);
		
		// To read integer value from terminal
		System.out.println("Enter Student Age...");
		int age = scanner.nextInt(); // read input in int format
		System.out.println("The student age is "+ age);
		
	}
	
}
