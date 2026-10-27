interface ShapeSix {
	void draw();
	double calculateArea();
}

interface ColorfulSix extends ShapeSix {
	void fillColor();
}

class CircleSix implements ColorfulSix {
	double radius;

	CircleSix(double radius) {
		this.radius = radius;
	}

	public void draw() {
		System.out.println("Drawing Circle");
	}

	public double calculateArea() {
		return Math.PI * radius * radius;
	}

	public void fillColor() {
		System.out.println("Filling Circle with color");
	}

	public static void main(String[] args) {
		CircleSix c = new CircleSix(5);

		c.draw();
		System.out.println("Area: " + c.calculateArea());
		c.fillColor();
	}
}