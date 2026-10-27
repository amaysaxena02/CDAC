class PrinterTen {
	void printMessage() {
		System.out.println("This is the original printer");
	}
}

class PrinterDemoTen {
	void createPrinter() {
		PrinterTen p = new PrinterTen() {
			public void printMessage() {
				System.out.println("This is the customized printer");
			}
		};

		p.printMessage();
	}

	public static void main(String[] args) {
		PrinterDemoTen obj = new PrinterDemoTen();

		obj.createPrinter();
	}
}