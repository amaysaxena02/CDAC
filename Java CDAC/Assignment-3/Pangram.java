class Pangram {
	public static void main(String[] args) {
		String str = args[0].toLowerCase();
		boolean pangram = true;

		for (char c = 'a'; c <= 'z'; c++) {
			if (str.indexOf(c) == -1) {
				pangram = false;
				break;
			}
		}

		if (pangram) {
			System.out.println("Pangram");
		}
		else {
			System.out.println("Not a Pangram");
		}
	}
}