class Power {
	public static void main(String[] args) {
		int base = Integer.parseInt(args[0]);
		int exponent = Integer.parseInt(args[1]);

		int result = 1;

		for (int i = 1; i <= exponent; i++) {
			result = result * base;
		}

		System.out.println(base + " raised to the power " + exponent + " = " + result);
	}
}