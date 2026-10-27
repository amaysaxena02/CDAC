class Person {
	String name;
	int age;

	void setData(String name, int age) {
		this.name = name;
		this.age = age;
	}

	void getData() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
}

class Employee extends Person {
	int empid;
	double salary;

	void setData(String name, int age, int empid, double salary) {
		this.name = name;
		this.age = age;
		this.empid = empid;
		this.salary = salary;
	}

	@Override
	void getData() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Employee ID: " + empid);
		System.out.println("Salary: " + salary);
	}

	public static void main(String[] args) {
		Person p = new Person();
		p.setData("Amay", 21);
		p.getData();

		System.out.println();

		Employee e = new Employee();
		e.setData("Rahul", 25, 101, 50000);
		e.getData();
	}
}