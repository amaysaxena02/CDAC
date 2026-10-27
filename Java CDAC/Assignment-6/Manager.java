class Person {
	String name;

	Person(String name) {
		this.name = name;
	}

	void displayPerson() {
		System.out.println("Name: " + name);
	}
}

class Employee extends Person {
	int empid;

	Employee(String name, int empid) {
		super(name);
		this.empid = empid;
	}

	void displayEmployee() {
		System.out.println("Employee ID: " + empid);
	}
}

class Manager extends Employee {
	String department;

	Manager(String name, int empid, String department) {
		super(name, empid);
		this.department = department;
	}

	void displayManager() {
		System.out.println("Department: " + department);
	}

	public static void main(String[] args) {
		Manager m = new Manager("Amay", 101, "IT");

		m.displayPerson();
		m.displayEmployee();
		m.displayManager();
	}
}