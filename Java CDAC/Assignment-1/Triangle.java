class Triangle{
	public static void main(String[] args) {
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		double c = Double.parseDouble(args[2]);

		double semi = (a+b+c)/2;
		double area = Math.sqrt(semi*(semi-a)*(semi-b)*(semi-c));

		System.out.println("Semi Perimeter of the Triangle: " + semi+ " cm");
		System.out.println("Area of the Triangle: " + area + " cm^2");
	}
}