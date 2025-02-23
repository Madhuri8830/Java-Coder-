import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagementSystem {
    // Student class (Encapsulation used)
    static class Student {
        private String name;
        private int age;
        private int studentId;

        // Constructor
        public Student(String name, int age, int studentId) {
            this.name = name;
            this.age = age;
            this.studentId = studentId;
        }

        // Getters & Setters
        public String getName() { return name; }
        public int getAge() { return age; }
        public int getStudentId() { return studentId; }
        public void setName(String name) { this.name = name; }
        public void setAge(int age) { this.age = age; }

        // Display student details
        public void displayStudent() {
            System.out.println("ID: " + studentId + ", Name: " + name + ", Age: " + age);
        }
    }

    // ArrayList to store students
    private static ArrayList<Student> students = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nStudent Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Update Student");
            System.out.println("3. Display All Students");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1: addStudent(); break;
                case 2: updateStudent(); break;
                case 3: displayStudents(); break;
                case 4: System.out.println("Exiting program..."); return;
                default: System.out.println("Invalid choice. Try again.");
            }
        }
    }

    // Add new student
    private static void addStudent() {
        System.out.print("Enter Name: ");
        String name = scanner.next();
        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        System.out.print("Enter Student ID: ");
        int studentId = scanner.nextInt();

        students.add(new Student(name, age, studentId));
        System.out.println("Student added successfully!");
    }

    // Update student details
    private static void updateStudent() {
        System.out.print("Enter Student ID to update: ");
        int id = scanner.nextInt();
        for (Student s : students) {
            if (s.getStudentId() == id) {
                System.out.print("Enter new Name: ");
                String newName = scanner.next();
                System.out.print("Enter new Age: ");
                int newAge = scanner.nextInt();

                s.setName(newName);
                s.setAge(newAge);
                System.out.println("Student details updated!");
                return;
            }
        }
        System.out.println("Student ID not found.");
    }

    // Display all students
    private static void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students in the system.");
            return;
        }
        System.out.println("\nStudent Records:");
        for (Student s : students) {
            s.displayStudent();
        }
    }
}
