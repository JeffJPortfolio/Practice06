package com.javaex.ex01;

public class Customer extends Person{
	private int cNo;
	private int point;
	
	public Customer() {
		
	}
	
	public Customer(String name, String hp, int cNo, int point) {
		super(name, hp);
		this.cNo = cNo;
		this.point = point;
	}

	public int getcNo() {
		return cNo;
	}

	public void setcNo(int cNo) {
		this.cNo = cNo;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
	
	public void showInfo() {
	    super.showInfo();  // Call super class showInfo() which will print name and hp
	    System.out.print(", #고객번호: " + this.cNo + ", #포인트점수: " + this.point);
	}
	
}
