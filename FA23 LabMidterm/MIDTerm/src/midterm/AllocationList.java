/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midterm;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LAPTOP HOUSE
 */
public class AllocationList {
     private List<Object> items;

    public AllocationList() {
        items = new ArrayList<>();
    }

    public void addItem(Object item) {
        items.add(item);
    }

    public AllocationIterator createIterator() {
        return new StudentListIterator(items);
    }
}
