class Average {
	public static void main(String[] args) {
		double sum = 0;

		for (int i = 0; i < args.length; i++) {
			sum = sum + Double.parseDouble(args[i]);
		}

		double average = sum / args.length;

		System.out.println("Average = " + average);
	}
}