package com.day14.Collection2;

public class Employee {
	private String name;
	private int empId;
	private String gender;
	private int salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Employee(String name, int empId, String gender, int salary) {
		super();
		this.name = name;
		this.empId = empId;
		this.gender = gender;
		this.salary = salary;
	}
	public String toString() {
		return "Name= " + name + ", empId= " + empId + ", gender= " + gender + ", salary= " + salary;
	}
	

}
