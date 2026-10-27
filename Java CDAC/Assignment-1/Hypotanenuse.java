class Hypotanenuse{
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		System.out.println("Hypotenuse of the triangle is: " + (Math.sqrt((a*a)+(b*b))) + "cm");
	}
}