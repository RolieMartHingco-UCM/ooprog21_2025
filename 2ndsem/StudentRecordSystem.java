import java.util.ArrayList;

public class StudentRecordSystem {

    
    static class Student {
        private String studentID;
        private String name;
        private String course;
        private int yearLevel;

     
        public Student(String studentID, String name, String course, int yearLevel) {
            this.studentID = studentID;
            this.name = name;
            this.course = course;
            this.yearLevel = yearLevel;
        }

      
        public void displayInfo() {
            System.out.println("Student ID: " + studentID);
            System.out.println("Name: " + name);
            System.out.println("Course: " + course);
            System.out.println("Year Level: " + yearLevel);
            System.out.println();
        }
    }

  
    static class StudentManager {
        private ArrayList<Student> students = new ArrayList<>();

        public void addStudent(Student student) {
            students.add(student);
        }

        public void displayAllStudents() {
            for (Student student : students) {
                student.displayInfo();
            }
        }
    }
    public static void main(String[] args) {

        StudentManager manager = new StudentManager();

       
        Student s1 = new Student("2024-001", "Juan Dela Cruz", "BSIT", 2);
        Student s2 = new Student("2024-002", "Maria Santos", "BSCS", 1);
        Student s3 = new Student("2024-003", "Pedro Reyes", "BSIS", 3);

        manager.addStudent(s1);
        manager.addStudent(s2);
        manager.addStudent(s3);

     
        manager.displayAllStudents();
    }
}
