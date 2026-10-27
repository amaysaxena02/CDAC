class IncomeTax{
	public static void main(String[] args) {
		double income = (Double.parseDouble(args[0]))/10000;

		if(income<0){
			System.out.println("Enter a valid income");
			return;
		}

		// if(income <=25){
		// 	System.out.println("No Tax");
		// }
		// else if(income <= 50){
		// 	System.out.println("5% Tax");
		// }
		// else if(income <= 100){
		// 	System.out.println("20% Tax");
		// }
		// else{
		// 	System.out.println("30% Tax");
		// }

		switch((int)(income)){
		case 25:
			System.out.println("No Tax");
			break;
		case 50:
			System.out.println("5% Tax");
			break;
		case 100:
			System.out.println("20% Tax");
			break;
		default:
			System.out.println("30% Tax");
			break;
		}
	}
}