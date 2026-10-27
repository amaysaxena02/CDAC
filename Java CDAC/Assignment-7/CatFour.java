interface AnimalFour {
	void makeSound();
	void eat();
}

class DogFour implements AnimalFour {
	public void makeSound() {
		System.out.println("Dog says: Woof Woof");
	}

	public void eat() {
		System.out.println("Dog eats meat");
	}
}

class CatFour implements AnimalFour {
	public void makeSound() {
		System.out.println("Cat says: Meow");
	}

	public void eat() {
		System.out.println("Cat eats fish");
	}

	public static void main(String[] args) {
		DogFour d = new DogFour();
		CatFour c = new CatFour();

		d.makeSound();
		d.eat();

		System.out.println();

		c.makeSound();
		c.eat();
	}
}