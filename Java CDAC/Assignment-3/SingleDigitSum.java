class SingleDigitSum {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);

		while (num >= 10) {
			int sum = 0;

			while (num > 0) {
				int digit = num % 10;
				sum = sum + digit;
				num = num / 10;
			}

			num = sum;
		}

		System.out.println("Single digit sum = " + num);
	}
}