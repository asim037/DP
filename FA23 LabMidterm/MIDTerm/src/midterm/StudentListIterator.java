/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midterm;

import java.util.List;

/**
 *
 * @author LAPTOP HOUSE
 */
public class StudentListIterator implements AllocationIterator {
    private final List<Object> items;
    private int index;

    public StudentListIterator(List<Object> items) {
        this.items = items;
        this.index = 0;
    }

    public boolean hasNext() {
        return index < items.size();
    }

    public Object next() {
        if (hasNext()) {
            Object currentItem = items.get(index);
            index++;
            return currentItem;
        }
        return null;
    }
}
