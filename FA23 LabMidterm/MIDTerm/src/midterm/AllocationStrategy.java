/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package midterm;

import java.util.List;
import java.util.Map;

/**
 *
 * @author LAPTOP HOUSE
 */
public interface AllocationStrategy {
    
    void allocateComputers(List<Student> students, Map<String, Computers> computers);
}

