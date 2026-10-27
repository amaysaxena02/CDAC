class PerfectSquare {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		boolean square = false;

		for (int i = 1; i * i <= num; i++) {
			if (i * i == num) {
				square = true;
				break;
			}
		}

		if (square) {
			System.out.println(num + " is a perfect square.");
		}
		else {
			System.out.println(num + " is not a perfect square.");
		}
	}
}