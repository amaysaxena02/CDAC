class PersonFour {
	PersonFour() {
		System.out.println("Person constructor called");
	}
}

class EmployeeFour extends PersonFour {
	EmployeeFour() {
		super();
		System.out.println("Employee constructor called");
	}

	public static void main(String[] args) {
		System.out.println("Creating Person object:");
		PersonFour p = new PersonFour();

		System.out.println();

		System.out.println("Creating Employee object:");
		EmployeeFour e = new EmployeeFour();
	}
}