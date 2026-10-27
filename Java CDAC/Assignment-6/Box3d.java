class Box {
	double length;
	double breadth;

	Box(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	void setLength(double length) {
		this.length = length;
	}

	void setBreadth(double breadth) {
		this.breadth = breadth;
	}

	double area() {
		return length * breadth;
	}
}

class Box3d extends Box {
	double height;

	Box3d(double length, double breadth, double height) {
		super(length, breadth);
		this.height = height;
	}

	void setHeight(double height) {
		this.height = height;
	}

	double volume() {
		return length * breadth * height;
	}

	public static void main(String[] args) {
		Box3d b = new Box3d(10, 5, 4);

		System.out.println("Length: " + b.length);
		System.out.println("Breadth: " + b.breadth);
		System.out.println("Height: " + b.height);
		System.out.println("Area: " + b.area());
		System.out.println("Volume: " + b.volume());
	}
}