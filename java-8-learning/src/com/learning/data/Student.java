package com.learning.data;

import java.util.List;

public class Student {
	
	private String name;
	private int gradeLevel;
	private double gpa;
	private String gender;
	private List<String> hobbies;	
	
	
	
	public Student(String name, int gradeLevel, double gpa, String gender, List<String> hobbies) {
		super();
		this.name = name;
		this.gradeLevel = gradeLevel;
		this.gpa = gpa;
		this.gender = gender;
		this.hobbies = hobbies;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getGradeLevel() {
		return gradeLevel;
	}



	public void setGradeLevel(int gradeLevel) {
		this.gradeLevel = gradeLevel;
	}



	public double getGpa() {
		return gpa;
	}



	public void setGpa(double gpa) {
		this.gpa = gpa;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public List<String> getHobbies() {
		return hobbies;
	}



	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}



	@Override
	public String toString() {
		return "Student [name=" + name + ", gradeLevel=" + gradeLevel + ", gpa=" + gpa + ", gender=" + gender
				+ ", hobbies=" + hobbies + "]";
	}
	
	
}
