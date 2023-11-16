/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midterm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author LAPTOP HOUSE
 */
public class Teacher {
    private Map<String, Computers> computers;
    private List<Student> students;

    public Teacher() {
        computers = new HashMap<>();
        students = new ArrayList<>();
    }

    public void addComputer(String cNumber, String os, String tools) {
        Computers computer = new Computers(cNumber, os, tools);
        computers.put(cNumber, computer);
    }

    public void addStudent(String name, String regNo, String discp, int semester) {
        Student student = new Student(name, regNo, discp, semester);
        students.add(student);
    }

    public void allocateComputers(AllocationStrategy strategy) {
        strategy.allocateComputers(students, computers);
    }

    public AllocationIterator createIterator() {
        AllocationList allocationList = new AllocationList();
        allocationList.addItem(students);
        allocationList.addItem(computers.values());
        return allocationList.createIterator();
    }
    
}
