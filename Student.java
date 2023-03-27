package com.day14.Collection2;

public class Student {
	private String name;
	private int rollNo;
	private String gender;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Student(String name, int rollNo, String gender,int age) {
		this.name = name;
		this.rollNo = rollNo;
		this.gender = gender;
		this.age=age;
	}
	public String toString() {
		return "Student name=" + name + ", rollNo=" + rollNo + ", gender=" + gender+", age= "+ age;
	}
	

}
