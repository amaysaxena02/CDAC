class Armstrong {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int original = n;
		int temp = n;
		int digits = 0;
		int sum = 0;

		while (temp > 0) {
			digits++;
			temp = temp / 10;
		}
		temp = n;

		while (temp > 0) {
			int digit = temp % 10;
			sum = sum + (int)Math.pow(digit, digits);
			temp = temp / 10;
		}

		if (sum == original) {
			System.out.println("Armstrong Number");
		}
		else {
			System.out.println("Not an Armstrong Number");
		}
	}
}