package com.learning.functionalInterfaces.consumer;

import java.util.List;
import java.util.function.Consumer;

import com.learning.data.Student;
import com.learning.data.StudentDataBase;

public class ConsumerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Consumer<Student> consumer = (s) -> System.out.println(s.getName());
		
		Consumer<Student> consumer2 = (s) -> System.out.println(s.getGender());
		
		Consumer<Student> consumer3 = (s) -> System.out.println(s.getGpa());
		
		
		List<Student> s = StudentDataBase.getAllStudents();
		
		s.forEach(consumer.andThen(consumer2).andThen(consumer3));
		

	}

}
