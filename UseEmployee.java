package com.day14.Collection2;

import java.util.HashMap;

public class UseEmployee {
	public static void main(String[] args) {
		Employee e1 = new Employee("Raj", 1452, "male", 19200);
		Employee e2 = new Employee("Mani", 1500, "male", 20000);
		Employee e3 = new Employee("Shanmu", 1845, "female", 18000);
		Employee e4 = new Employee("jamuna", 7845, "female", 23000);
		Employee e5 = new Employee("Selvi", 1253, "female", 14000);
		Employee e6 = new Employee("karthi", 4561, "male", 18500);
		Employee e7 = new Employee("surya", 1254, "male", 30000);
		Employee e8 = new Employee("siva", 2365, "male", 27000);
		Employee e9 = new Employee("Riya", 2368, "female", 31000);
		Employee e10 = new Employee("nila", 1452, "female", 24000);
		HashMap<Integer, Employee> k = new HashMap<>();
		k.put(e1.getEmpId(), e1);
		k.put(e2.getEmpId(), e2);
		k.put(e3.getEmpId(), e3);
		k.put(e4.getEmpId(), e4);
		k.put(e5.getEmpId(), e5);
		k.put(e6.getEmpId(), e6);
		k.put(e7.getEmpId(), e7);
		k.put(e8.getEmpId(), e8);
		k.put(e9.getEmpId(), e9);
		k.put(e10.getEmpId(), e10);
//		for (Employee s : k.values()) {
//			if (s.getGender().equalsIgnoreCase("Female")) {
//				System.out.println(s);
//			}
//		}

		for (Employee p : k.values()) {
			if (p.getSalary() > 25000 && p.getSalary() < 40000) {
				int netSalary = p.getSalary() + (p.getSalary() * 5 / 100);
				p.setSalary(netSalary);
			} else if (p.getSalary() > 15000 && p.getSalary() < 25000) {
				int netSalary = p.getSalary() + (p.getSalary() * 3 / 100);
				p.setSalary(netSalary);
			}
			else {
				int netSalary = p.getSalary() + (p.getSalary() * 2 / 100);
				p.setSalary(netSalary);
				
				
			}
		}
		System.out.println(k);

	}

}


