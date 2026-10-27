class PersonThree {
	String name;
	int age;

	PersonThree() {
		name = "Unknown";
		age = 0;
	}

	PersonThree(String name) {
		this.name = name;
		age = 0;
	}

	PersonThree(String name, int age) {
		this.name = name;
		this.age = age;
	}

	void display() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}

	public static void main(String[] args) {
		PersonThree p1 = new PersonThree();
		PersonThree p2 = new PersonThree("Amay");
		PersonThree p3 = new PersonThree("Amay", 22);

		p1.display();
		p2.display();
		p3.display();
	}
}