class PersonFour {
	String name;
	int age;

	PersonFour(String name, int age) {
		this.name = name;
		this.age = age;
	}

	void display() {
		System.out.println("Name: " + this.name);
		System.out.println("Age: " + this.age);
	}

	void compareAge(PersonFour p) {
		if (this.age > p.age) {
			System.out.println(this.name + " is older than " + p.name);
		}
		else if (this.age < p.age) {
			System.out.println(this.name + " is younger than " + p.name);
		}
		else {
			System.out.println(this.name + " and " + p.name + " are of the same age.");
		}
	}

	public static void main(String[] args) {
		PersonFour p1 = new PersonFour("Amay", 22);
		PersonFour p2 = new PersonFour("Rahul", 25);

		p1.display();
		p2.display();

		p1.compareAge(p2);
	}
}