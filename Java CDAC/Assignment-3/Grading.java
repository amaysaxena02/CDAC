class Grading {
	public static void main(String[] args) {
		double perc = Double.parseDouble(args[0]);

		if (perc > 100.0 || perc < 0.0) {
			System.out.println("Invalid Percentage.");
			return;
		}

		// if (perc >= 90.0) {
		// 	System.out.println("A");
		// }
		// else if (perc >= 80.0) {
		// 	System.out.println("B");
		// }
		// else if (perc >= 70.0) {
		// 	System.out.println("C");
		// }
		// else if (perc >= 60.0) {
		// 	System.out.println("D");
		// }
		// else {
		// 	System.out.println("F");
		// }

		switch ((int)(perc/10.0)){
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
		}
	}
}