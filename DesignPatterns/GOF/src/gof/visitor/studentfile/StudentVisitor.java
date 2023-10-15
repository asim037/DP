/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package gof.visitor.studentfile;

/**
 *
 * @author LAPTOP HOUSE
 */
public interface StudentVisitor {
    void visit(Undergraduate student);
    void visit(Graduate student);
}
