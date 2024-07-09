package com.javaex.ex02;

public class Triangle extends Shape{
	private int width;
	private int height;
	
	public Triangle() {
		System.out.println("trianlge 0 ");
	}
	
	public Triangle(int w, int h) {
		super("black", "black");
		this.width = w;
		this.height = h;
		System.out.println("trianlge 2 ");
	}
	
	public Triangle(String f, String l, int w, int h) {
		super(f, l );
		this.width = w;
		this.height = h;
		System.out.println("trianlge 4 ");
	}
}


