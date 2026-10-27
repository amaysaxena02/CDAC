abstract class ShapeNine {
	abstract void draw();
}

class ShapeDemoNine {
	void createShape() {
		ShapeNine s = new ShapeNine() {
			public void draw() {
				System.out.println("Drawing Shape");
			}
		};

		s.draw();
	}

	public static void main(String[] args) {
		ShapeDemoNine obj = new ShapeDemoNine();

		obj.createShape();
	}
}