class CheckLargest{
	public static void main(String[] args) {
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		double c = Double.parseDouble(args[2]);

		if (a<c && b<c ){
			System.out.println(c + " is the largest.");
		}
		else if (a>b && a>c){
			System.out.println(a + " is the largest.");
		}
		else{
			System.out.println(b + " is the largest.");	
		}
	}
}