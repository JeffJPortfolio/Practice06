package com.javaex.ex02;

public class ShapeApp {

	public static void main(String[] args) {
		//shape 2 , triangle 0 , shape2 triangle 2 , shape 2 triangle 4
		Shape s1 = new Shape("파랑", "파랑");
		System.out.println("================");
		
		Triangle t1 = new Triangle();
		System.out.println("================");
		//shape  0 triangle 0 
		
		
		Triangle t2 = new Triangle(3, 4);
		System.out.println("================");
		
		Shape t3 = new Triangle("빨강", "빨강", 15, 15);
		System.out.println("================");
		
	}

}

