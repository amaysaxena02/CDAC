interface GreetingEight {
	void sayHello();
}

class GreetingDemoEight {
	void generateGreeting() {
		GreetingEight g = new GreetingEight() {
			public void sayHello() {
				System.out.println("Hello! Welcome to Java.");
			}
		};

		g.sayHello();
	}

	public static void main(String[] args) {
		GreetingDemoEight obj = new GreetingDemoEight();

		obj.generateGreeting();
	}
}