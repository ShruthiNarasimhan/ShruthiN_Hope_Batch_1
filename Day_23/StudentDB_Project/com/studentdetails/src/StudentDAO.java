package com.studentdetails.src;
import java.sql.*;
//Data Access Object
import java.util.ArrayList;
import java.util.List;
public class StudentDAO {
    public void addStudent(Student s) throws SQLException {
        String query="INSERT INTO student_details(name,marks) VALUES(?,?)";
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, s.getName());
            ps.setInt(2, s.getMarks());
            ps.executeUpdate();
            System.out.println("Student added successfully");
        } catch(SQLException e) {
            System.out.println("Error adding student: "+e.getMessage());
        }
    }
    public List<Student> getAllStudents() throws SQLException {
        String query="SELECT * FROM student_details";
        List<Student> list=new ArrayList<>();
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(query);
             ResultSet res = ps.executeQuery()) {
            while(res.next()) {
                list.add(new Student(res.getInt("id"), res.getString("name"), res.getInt("marks")));
            }
        } catch(SQLException e) {
            System.out.println("Error fetching students: "+e.getMessage());
        }
        return list;
    }
    public void updateStudent(Student s) throws SQLException {
        String query="UPDATE student_details SET name=?, marks=? WHERE id=?";
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, s.getName());
            ps.setInt(2, s.getMarks());
            ps.setInt(3, s.getId());
            ps.executeUpdate();
            System.out.println("Student updated successfully");
        } catch(SQLException e) {
            System.out.println("Error updating student: "+e.getMessage());
        }
    }
    public void deleteStudent(int id) throws SQLException {
        String query="DELETE FROM student_details WHERE id=?";
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Student deleted successfully");
        } catch(SQLException e) {
            System.out.println("Error deleting student: "+e.getMessage());
        }
    }
}
