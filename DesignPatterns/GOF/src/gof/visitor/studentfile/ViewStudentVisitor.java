/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gof.visitor.studentfile;

/**
 *
 * @author LAPTOP HOUSE
 */
public class ViewStudentVisitor implements StudentVisitor {
    @Override
    public void visit(Undergraduate student) {
        System.out.println("Undergraduate Student: " + student.getName() + ", Age: " + student.getAge());
    }

    @Override
    public void visit(Graduate student) {
        System.out.println("Graduate Student: " + student.getName() + ", Age: " + student.getAge());
    }
}
