abstract class ShapeOne {
	abstract double area();
}

class CircleOne extends ShapeOne {
	double radius;

	CircleOne(double radius) {
		this.radius = radius;
	}

	double area() {
		return Math.PI * radius * radius;
	}
}

class RectangleOne extends ShapeOne {
	double length;
	double width;

	RectangleOne(double length, double width) {
		this.length = length;
		this.width = width;
	}

	double area() {
		return length * width;
	}

	public static void main(String[] args) {
		CircleOne c = new CircleOne(5);
		RectangleOne r = new RectangleOne(10, 5);

		System.out.println("Area of Circle: " + c.area());
		System.out.println("Area of Rectangle: " + r.area());
	}
}