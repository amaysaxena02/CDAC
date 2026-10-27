class Calc{
	public static void main(String[] args) {
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[2]);

		char c = args[1].charAt(0);

		switch(c){
		case '+':
			System.out.println(a + " + " + b + " = " + (a+b));
			break;
		case '-':
			System.out.println(a +  " - " +  b + " = " + (a-b));
			break;
		case 'x':
			System.out.println(a + " * " + b + " = " + (a*b));
			break;
		case '/':
			System.out.println(a + "/" + b + " = " + (a/b));
			break;
		default:
			System.out.println("Enter a valid operator");
		}
	}
}