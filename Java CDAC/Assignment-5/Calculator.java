class Calculator {
	int a;
	int b;

	Calculator(int a, int b) {
		this.a = a;
		this.b = b;
	}

	int addition() {
		return a + b;
	}

	int subtraction() {
		return a - b;
	}

	int multiplication() {
		return a * b;
	}

	int division() {
		return a / b;
	}

	int modulus() {
		return a % b;
	}

	public static void main(String[] args) {
		Calculator c = new Calculator(20, 6);

		System.out.println("Addition: " + c.addition());
		System.out.println("Subtraction: " + c.subtraction());
		System.out.println("Multiplication: " + c.multiplication());
		System.out.println("Division: " + c.division());
		System.out.println("Modulus: " + c.modulus());
	}
}