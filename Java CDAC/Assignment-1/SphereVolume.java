class SphereVolume{
	public static void main(String[] args) {
		double radius = Double.parseDouble(args[0]);
		double volume = (4.0/3.0)*Math.PI*Math.pow(radius, 3);

		System.out.println("Volume of the sphere: " + volume + "cm^3");
	}
}