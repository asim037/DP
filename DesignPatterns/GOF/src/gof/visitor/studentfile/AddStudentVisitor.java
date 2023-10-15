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
public class AddStudentVisitor implements StudentVisitor{
    private List<Student> students;

    public AddStudentVisitor(List<Student> students) {
        this.students = students;
    }

    @Override
    public void visit(Undergraduate student) {
        students.add(student);
    }

    @Override
    public void visit(Graduate student) {
        students.add(student);
    }
}
