import java.util.*;
class StudentGrade{
	public int id;
	public String name;
	public double grade;

	StudentGrade(int id, String name, double grade){
		this.id = id;
		this.name = name;
		this.grade = grade;
	}

	public static void main(String[] args) {
		
		ArrayList<StudentGrade> arr = new ArrayList<StudentGrade>();
		arr.add(new StudentGrade(1, "Amay", 89.5));
		arr.add(new StudentGrade(2, "Ashu", 85.0));
		arr.add(new StudentGrade(3, "Arthur", 95.5));
		arr.add(new StudentGrade(4, "John", 75.0));
		arr.add(new StudentGrade(5, "Jack", 87.5));

		StudentGrade highest = arr.get(0);
		for(StudentGrade student : arr){
			if(student.grade > highest.grade){
				highest = student;
			}
		}
		System.out.println("Student with highest grade: " + highest.name + " - " + highest.grade);
	}
}