/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midterm;

/**
 *
 * @author LAPTOP HOUSE
 */
public class Computers {
    private String compile;
    private String os;
    private String tools;
    private Student allocatedStudent;

    public Computers(String compile, String os, String tools) {
        this.compile = compile;
        this.os = os;
        this.tools = tools;
    }

    public String getOS() {
        return os;
    }

    public void setAllocatedStudent(Student student) {
        this.allocatedStudent = student;
    }

    public Student getAllocatedStudent() {
        return allocatedStudent;
    }
}
    

