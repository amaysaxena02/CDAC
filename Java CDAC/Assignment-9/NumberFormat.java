class NumberFormat {
	public static void main(String[] args) {
		String str = args[0];

		try {
			int num = Integer.parseInt(str);
			System.out.println("Integer value: " + num);
		}
		catch (NumberFormatException e) {
			System.out.println("Invalid number format.");
		}
		finally {
			System.out.println("Operation complete.");
		}
	}
}