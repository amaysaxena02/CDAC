class MemberSix {
	String name;
	int age;
	String phoneNumber;
	String address;
	double salary;

	void printSalary() {
		System.out.println("Salary: " + salary);
	}

	void display() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Phone Number: " + phoneNumber);
		System.out.println("Address: " + address);
		printSalary();
	}
}

class EmployeeSix extends MemberSix {
	String specialization;

	void displayEmployee() {
		display();
		System.out.println("Specialization: " + specialization);
	}
}

class ManagerSix extends MemberSix {
	String department;

	void displayManager() {
		display();
		System.out.println("Department: " + department);
	}

	public static void main(String[] args) {
		EmployeeSix e = new EmployeeSix();

		e.name = "Amay";
		e.age = 22;
		e.phoneNumber = "9876543210";
		e.address = "Hyderabad";
		e.salary = 50000;
		e.specialization = "Java";

		ManagerSix m = new ManagerSix();

		m.name = "Rahul";
		m.age = 30;
		m.phoneNumber = "9876501234";
		m.address = "Mumbai";
		m.salary = 80000;
		m.department = "IT";

		System.out.println("Employee Details:");
		e.displayEmployee();

		System.out.println();

		System.out.println("Manager Details:");
		m.displayManager();
	}
}