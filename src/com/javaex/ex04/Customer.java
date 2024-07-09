package com.javaex.ex04;

public class Customer extends User {
	private int point;
	
	public Customer() {
		
	}
	
	public Customer(String i, String p, String n, int po) {
		super(i, p , n);
		this.point = po;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
	
	public void showInfo() {
		System.out.print("#아이디" + id);
		System.out.print(", #패스워드" + password);
		System.out.print(", #이름" + name);
		System.out.println(", #포인트" + point);
	}
	
}
