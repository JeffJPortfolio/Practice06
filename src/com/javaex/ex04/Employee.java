package com.javaex.ex04;

public class Employee extends User {
	private int salary;
	
	public Employee() {
		
	}
	
	public Employee(String i, String p, String n, int s) {
		super(i, p , n);
		this.salary = s;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void showInfo() {
		System.out.print("#아이디" + id);
		System.out.print(", #패스워드" + password);
		System.out.print(", #이름" + name);
		System.out.println(", #월급" + salary);
		System.out.println(name + "의 월급은 " + salary + "입니다");

	}
	

	
}
