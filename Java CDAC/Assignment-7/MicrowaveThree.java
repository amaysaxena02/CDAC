abstract class ApplianceThree {
	String brand;
	double powerConsumption;

	ApplianceThree(String brand, double powerConsumption) {
		this.brand = brand;
		this.powerConsumption = powerConsumption;
	}

	abstract void turnOn();
}

class WashingMachineThree extends ApplianceThree {
	WashingMachineThree(String brand, double powerConsumption) {
		super(brand, powerConsumption);
	}

	void turnOn() {
		System.out.println("Washing Machine is ON");
		System.out.println("Brand: " + brand);
		System.out.println("Power Consumed: " + powerConsumption + " W");
	}
}

class RefrigeratorThree extends ApplianceThree {
	RefrigeratorThree(String brand, double powerConsumption) {
		super(brand, powerConsumption);
	}

	void turnOn() {
		System.out.println("Refrigerator is ON");
		System.out.println("Brand: " + brand);
		System.out.println("Power Consumed: " + powerConsumption + " W");
	}
}

class MicrowaveThree extends ApplianceThree {
	MicrowaveThree(String brand, double powerConsumption) {
		super(brand, powerConsumption);
	}

	void turnOn() {
		System.out.println("Microwave is ON");
		System.out.println("Brand: " + brand);
		System.out.println("Power Consumed: " + powerConsumption + " W");
	}

	public static void main(String[] args) {
		WashingMachineThree w = new WashingMachineThree("LG", 500);
		RefrigeratorThree r = new RefrigeratorThree("Samsung", 200);
		MicrowaveThree m = new MicrowaveThree("IFB", 1200);

		w.turnOn();
		System.out.println();

		r.turnOn();
		System.out.println();

		m.turnOn();
	}
}