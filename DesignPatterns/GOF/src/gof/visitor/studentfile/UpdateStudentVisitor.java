/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gof.visitor.studentfile;

/**
 *
 * @author LAPTOP HOUSE
 */
public class UpdateStudentVisitor implements StudentVisitor{
    private String nameToUpdate;
    private int ageToUpdate;

    public UpdateStudentVisitor(String nameToUpdate, int ageToUpdate) {
        this.nameToUpdate = nameToUpdate;
        this.ageToUpdate = ageToUpdate;
    }

    @Override
    public void visit(Undergraduate student) {
        student.name = nameToUpdate;
        student.age = ageToUpdate;
    }

    @Override
    public void visit(Graduate student) {
//        student.name = nameToUpdate;
//        student.age = ageToUpdate;
//        student.name = nameToUpdate;
//        student.age = ageToUpdate;
    }
}
