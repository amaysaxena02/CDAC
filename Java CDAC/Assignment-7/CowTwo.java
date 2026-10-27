abstract class AnimalTwo {
	abstract void sound();
}

class DogTwo extends AnimalTwo {
	void sound() {
		System.out.println("Dog says: Woof Woof");
	}
}

class CatTwo extends AnimalTwo {
	void sound() {
		System.out.println("Cat says: Meow");
	}
}

class CowTwo extends AnimalTwo {
	void sound() {
		System.out.println("Cow says: Moo");
	}

	public static void main(String[] args) {
		DogTwo d = new DogTwo();
		CatTwo c = new CatTwo();
		CowTwo w = new CowTwo();

		d.sound();
		c.sound();
		w.sound();
	}
}