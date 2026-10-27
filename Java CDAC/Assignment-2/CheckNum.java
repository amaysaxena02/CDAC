class CheckNum{
	public static void main(String[] args) {
		double n = Double.parseDouble(args[0]);
		if (n<0){
			System.out.println("Number is negative.");
		}
		else if (n>0){
			System.out.println("Number is positive.");
		}
		else if (n==0){
			System.out.println("Number is 0.");
		}
		else{
			System.out.println("Please enter a valide integer.");
		}
	}
}