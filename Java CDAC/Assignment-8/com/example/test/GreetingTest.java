package com.example.test;

import com.example.greeting.Greeting;

class GreetingTest {
	void generateGreeting() {
		Greeting g = new Greeting() {
			public void sayHello() {
				System.out.println("Hello! Welcome to Java.");
			}
		};

		g.sayHello();
	}

	public static void main(String[] args) {
		GreetingTest obj = new GreetingTest();

		obj.generateGreeting();
	}
}