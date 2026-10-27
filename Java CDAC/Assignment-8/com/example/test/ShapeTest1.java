package com.example.test;

import com.example.anonymous.Shape;

class ShapeTest1 {
	void createShape() {
		Shape s = new Shape() {
			public void draw() {
				System.out.println("Drawing Shape");
			}
		};

		s.draw();
	}

	public static void main(String[] args) {
		ShapeTest1 obj = new ShapeTest1();

		obj.createShape();
	}
}