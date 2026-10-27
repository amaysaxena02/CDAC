interface VehicleFive {
	default void startEngine() {
		System.out.println("Engine started");
	}
}

class CarFive implements VehicleFive {
	public void startEngine() {
		System.out.println("Car engine started");
	}

	public static void main(String[] args) {
		CarFive c = new CarFive();

		c.startEngine();
	}
}