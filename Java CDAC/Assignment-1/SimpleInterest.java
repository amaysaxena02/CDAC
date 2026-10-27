class SimpleInterest{
	public static void main(String[] args) {
		float p = Float.parseFloat(args[0]);
		float r = Float.parseFloat(args[1]);
		float t = Float.parseFloat(args[2]);

		System.out.println("Simple Interest: " + ((p*r*t)/100));
	}
}