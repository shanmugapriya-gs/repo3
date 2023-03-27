package com.day14.Collection2;

import java.util.ArrayList;
import java.util.HashMap;

public class UseStudent {
	public static void main(String[] args) {
		Student s1=new Student("Ravi",123,"Male",13);
		Student s2=new Student("Manju",253,"Female",15);
		Student s3=new Student("seetha",452,"Female",19);
		Student s4=new Student("lokesh",321,"Male",18);
		Student s5=new Student("raju",621,"Male",17);
		Student s6=new Student("madhu",450,"Female",10);
		HashMap<Integer,Student> k=new HashMap<>();
		k.put(s1.getRollNo(), s1);
		k.put(s2.getRollNo(), s2);
		k.put(s3.getRollNo(), s3);
		k.put(s4.getRollNo(), s4);
		k.put(s5.getRollNo(), s5);
		k.put(s6.getRollNo(), s6);
		ArrayList<Student> s=new ArrayList<>();
		for(Student m:k.values()) {
			if(m.getAge()>15) {
				s.add(m);
			}
		}
		
		
		

	}

}
