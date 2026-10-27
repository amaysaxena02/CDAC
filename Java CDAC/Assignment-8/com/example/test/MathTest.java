package com.example.test;

import com.example.math.Calculator;

class MathTest {
	public static void main(String[] args) {
		Calculator c = new Calculator();

		System.out.println("Addition: " + c.addition(10, 5));
		System.out.println("Subtraction: " + c.subtraction(10, 5));
	}
}