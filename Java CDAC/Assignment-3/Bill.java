class Bill{
	public static void main(String[] args) {
		
		double unit = Double.parseDouble(args[0]);
		
		if (unit < 0.0){
			System.out.println("Invalid Entry");
			return;
		}

		// if (unit<=100.0){
		// 	System.out.println("Bill: " + (unit*5));
		// }
		// else if(unit<=200.0){
		// 	System.out.println("Bill: " + (unit*6));
		// }
		// else if(unit<=300.0){
		// 	System.out.println("Bill: " + (unit*7));
		// }
		// else{
		// 	System.out.println("Bill: " + (unit*8));
		// }

		switch((int)(unit/100)){
		case 0:
		case 1:
			System.out.println("Bill: " + (unit*5));
			break;
		case 2:
			System.out.println("Bill: " + (unit*6));
			break;
		case 3:
			System.out.println("Bill: " + (unit*7));
			break;
		default:
			System.out.println("Bill: " + (unit*8));
			break;
		}
	}
}