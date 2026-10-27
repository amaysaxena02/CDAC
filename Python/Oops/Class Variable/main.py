class Student:
    
    class_year = 2026
    student_count = 0
    
    def __init__(self, name, age):
        self.name = name
        self.age = age
        Student.student_count += 1

student1 = Student("Ashu", 20)
student2 = Student("Amay", 22)

student1.class_year = 2025

print(f"Student 1: {student1.name}, Age: {student1.age}, Class Year: {student1.class_year}")
print(f"Student 2: {student2.name}, Age: {student2.age}, Class Year: {student2.class_year}")
print(f"Total Students: {Student.student_count}")   