class Address {
	String street;
	String city;
	String state;

	Address(String street, String city, String state) {
		this.street = street;
		this.city = city;
		this.state = state;
	}

	void display() {
		System.out.println("Street: " + street);
		System.out.println("City: " + city);
		System.out.println("State: " + state);
	}
}

class Person1 {
	String name;
	Address address;

	Person1(String name, Address address) {
		this.name = name;
		this.address = address;
	}

	void display() {
		System.out.println("Name: " + name);
		address.display();
	}

	public static void main(String[] args) {
		Address a = new Address("MG Road", "Hyderabad", "Telangana");

		Person p = new Person("Amay", a);

		p.display();
	}
}