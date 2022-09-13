package com.learning.data;

import java.util.Arrays;
import java.util.List;

public class StudentDataBase {
	
	public static List<Student> getAllStudents() {
		
		Student s1 = new Student("Nikhil", 2, 3.5, "MALE", Arrays.asList("Swimming", "Cricket", "Badminton"));
		
		Student s2 = new Student("Nagesh", 3, 3.6, "MALE", Arrays.asList("Swimming", "Cricket", "Walking"));
		
		return Arrays.asList(s1,s2);
	}
	

}
