class Student{
	private int rollno;
	private String name;
	private int age;
	private static String org = "C-DAC";

	void setStudent(int r, String n, int a){
		rollno = r;
		name = n;
		age = a;
	}	
	void getStudent(){
		System.out.println(rollno + " " + name + " " + age + " " + org);
	}

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setStudent(05, "Amay", 21);
		Student s2 = new Student();
		s2.setStudent(Integer.parseInt(args[0]),args[1],Integer.parseInt(args[2]));
		s1.getStudent();
		s2.getStudent();
	}
}