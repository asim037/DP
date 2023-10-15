/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gof.visitor.studentfile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LAPTOP HOUSE
 */
public class Main {
    public static void main(String[] args) throws IOException {
        List<Student> students = new ArrayList<>();
        students.add(new Undergraduate("Alice", 20));
        students.add(new Graduate("Bob", 25));

        // Add a student
        Student addStudent = new Undergraduate("Charlie", 22);
        addStudent.accept(new AddStudentVisitor(students));

        // View students
        System.out.println("View Students:");
        for (Student student : students) {
            student.accept(new ViewStudentVisitor());
        }

        // Update a student
        Student updateStudent = students.get(0);
        updateStudent.accept(new UpdateStudentVisitor("Alicia", 21));

        // Delete a student
        Student deleteStudent = students.get(1);
        deleteStudent.accept(new DeleteStudentVisitor(students, deleteStudent));

        // View updated students
        System.out.println("View Updated Students:");
        for (Student student : students) {
            student.accept(new ViewStudentVisitor());
        }
    }
    
}
