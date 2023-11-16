/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midterm;

/**
 *
 * @author LAPTOP HOUSE
 */
class Student {
    private String name;
    private String regNo;
    private String discp;
    private int semester;

    public Student(String name, String regNo, String discp, int semester) {
        this.name = name;
        this.regNo = regNo;
        this.discp = discp;
        this.semester = semester;
    }

    public String getName() {
        return name;
    }

    public String getRegNo() {
        return regNo;
    }
    public String getDiscp() {
        return discp;
    }

    public int getSemester() {
        return semester;
    }
}
