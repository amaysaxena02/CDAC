class Rectangle {
	double length;
	double width;

	Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	double area() {
		return length * width;
	}

	double perimeter() {
		return 2 * (length + width);
	}

	public static void main(String[] args) {
		Rectangle r = new Rectangle(10, 5);

		System.out.println("Length: " + r.length);
		System.out.println("Width: " + r.width);
		System.out.println("Area: " + r.area());
		System.out.println("Perimeter: " + r.perimeter());
	}
}