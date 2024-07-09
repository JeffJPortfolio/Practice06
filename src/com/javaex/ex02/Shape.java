package com.javaex.ex02;

public class Shape {
	private String fillColor;
	private String lineColor;
	
	public Shape() {
		System.out.println("shape 0 ");
	}
	public Shape(String f, String l) {
		this.fillColor = f;
		this.lineColor = l;
		System.out.println("shape 2 ");
	}

}

