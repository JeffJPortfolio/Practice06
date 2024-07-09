package com.javaex.ex05;

public class Depart extends Employee{

	 //코드작성
	private String department;
	
	public Depart() {
		
	}
	
	public Depart(String n,int s, String d) {
		super(n, s);
		this.department = d;
	}
	
	public void showInformation() {
		
		System.out.println("이름:" + this.getName() + " 연봉:" + this.getSalary() + " 부서:" + department);
	}
	
}
