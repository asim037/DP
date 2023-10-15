/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gof.visitor.studentfile;

import java.util.List;

/**
 *
 * @author LAPTOP HOUSE
 */
public class DeleteStudentVisitor implements StudentVisitor{
    private List<Student> students;
    private Student studentToDelete;

    public DeleteStudentVisitor(List<Student> students, Student studentToDelete) {
        this.students = students;
        this.studentToDelete = studentToDelete;
    }

    @Override
    public void visit(Undergraduate student) {
        students.remove(studentToDelete);
    }

    @Override
    public void visit(Graduate student) {
        students.remove(studentToDelete);
    }
    
}
