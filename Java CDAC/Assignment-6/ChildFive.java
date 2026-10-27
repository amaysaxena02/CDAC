class ParentFive {
	void parentMethod() {
		System.out.println("This is parent class");
	}
}

class ChildFive extends ParentFive {
	void childMethod() {
		System.out.println("This is child class");
	}

	public static void main(String[] args) {
		ParentFive p = new ParentFive();
		ChildFive c = new ChildFive();

		System.out.println("1. Parent method using parent object:");
		p.parentMethod();

		System.out.println("2. Child method using child object:");
		c.childMethod();

		System.out.println("3. Parent method using child object:");
		c.parentMethod();
	}
}