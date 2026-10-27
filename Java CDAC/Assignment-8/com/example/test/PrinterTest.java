package com.example.test;

import com.example.anonymous.Printer;

class PrinterTest {
	void createPrinter() {
		Printer p = new Printer() {
			public void printMessage() {
				System.out.println("This is the customized printer");
			}
		};

		p.printMessage();
	}

	public static void main(String[] args) {
		PrinterTest obj = new PrinterTest();

		obj.createPrinter();
	}
}