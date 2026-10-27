class Person{
	String name;
	int age;
	static String country = "India";

	public void setPerson(String n, int a){
		name = n;
		age = a;
	}

	public void getPerson(){
		System.out.println(name + " " + age + " " + country);
	}

	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
		p1.setPerson("Amay", 21);
		p2.setPerson("Ashu", 22);
		p1.getPerson();
		p2.getPerson();
	}
}