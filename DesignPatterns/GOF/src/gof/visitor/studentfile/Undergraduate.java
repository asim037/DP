/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gof.visitor.studentfile;

/**
 *
 * @author LAPTOP HOUSE
 */
public class Undergraduate implements Student {
    
    String name;
    int age;

    public Undergraduate(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public void accept(StudentVisitor visitor) {
        visitor.visit(this);
    }
}


