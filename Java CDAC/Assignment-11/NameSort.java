import java.util.*;
class NameSort {
    public static void main(String[] args) {
        ArrayList<Student> arr = new ArrayList<Student>();
        arr.add(new Student(1, "Amay", 89.5));
        arr.add(new Student(2, "Ashu", 85.0));
        arr.add(new Student(3, "Arthur", 95.5));
        arr.add(new Student(4, "John", 75.0));
        arr.add(new Student(5, "Jack", 87.5));

        Collections.sort(arr, new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                return s1.name.compareTo(s2.name);
            }
        });

        System.out.println("Students sorted by name:");
        for (Student student : arr) {
            System.out.println(student.id + " - " + student.name + " - " + student.grade);
        }
    }
    
}
class Student{
    public int id;
    public String name;
    public double grade;

    Student(int id, String name, double grade){
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

}