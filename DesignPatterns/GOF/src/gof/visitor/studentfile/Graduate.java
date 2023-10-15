/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gof.visitor.studentfile;

/**
 *
 * @author LAPTOP HOUSE
 */
public class Graduate implements Student {
    final String name;
    final int age;

    public Graduate(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void accept(StudentVisitor visitor) {
        visitor.visit(this);
    }
    
}
