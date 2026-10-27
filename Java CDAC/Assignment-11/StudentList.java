import java.util.*;
class StudentList{
	public int id;
	public String name;
	public String grade;

	StudentList(int id, String name, String grade){
		this.id = id;
		this.name = name;
		this.grade = grade;
	}

	public static void main(String[] args) {
		
		ArrayList<StudentList> arr = new ArrayList<StudentList>();
		arr.add(new StudentList(1, "Amay", "A+"));
		arr.add(new StudentList(2, "Ashu", "B"));
		arr.add(new StudentList(3, "Arthur", "A+"));
		arr.add(new StudentList(4, "John", "C"));
		arr.add(new StudentList(5, "Jack", "B+"));

		for (int i=0; i<5 ; i++ ) {
			System.out.println(arr.get(i).id + " " + arr.get(i).name + " " + arr.get(i).grade);
		}
	}
}