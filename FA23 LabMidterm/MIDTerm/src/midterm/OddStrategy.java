/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midterm;

import java.util.List;
import java.util.Map;

/**
 *
 * @author LAPTOP HOUSE
 */
public class OddStrategy implements AllocationStrategy{
    
   public void allocateComputers(List<Student> students, Map<String, Computers> computers) {
        int index = 0;
        for (Student student : students) {
            if (index % 2 != 0) {
                for (Computers computer : computers.values()) {
                    if (computer.getOS().equals("Linux") && computer.getAllocatedStudent() == null) {
                        computer.setAllocatedStudent(student);
                        break;
                    }
                }
            }
            index++;
        }
    }
}
