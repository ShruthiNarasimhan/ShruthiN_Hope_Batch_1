package com.studentdetails.src;
import com.studentdetails.src.StudentDAO;
import com.studentdetails.src.Student;
import java.sql.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws SQLException {
        StudentDAO dao = new StudentDAO();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\nStudent Database Management System");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter student marks: ");
                    int marks = sc.nextInt();
                    dao.addStudent(new Student(0, name, marks));
                    break;
                case 2:
                    System.out.println("All Students:");
                    dao.getAllStudents().forEach(student -> 
                        System.out.println("ID: " + student.getId() + ", Name: " + student.getName() + ", Marks: " + student.getMarks()));
                    break;
                case 3:
                    System.out.print("Enter student ID to update: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter new name: ");
                    String newName = sc.nextLine();
                    System.out.print("Enter new marks: ");
                    int newMarks = sc.nextInt();
                    dao.updateStudent(new Student(updateId, newName, newMarks));
                    break;
                case 4:
                    System.out.print("Enter student ID to delete: ");
                    int deleteId = sc.nextInt();
                    dao.deleteStudent(deleteId);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
