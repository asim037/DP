/*
Problem: Here we are creating list of numbers and making sum of even numbers without any software principles using ArrayList..
 */
package withprinciple;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author FA20-BSE-037
 */
public class WithPrinciple {
    public static void main(String[] args) {
        
         List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.clear();
        numbers.add(12);
        
        int sum = 0;
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                sum += number;
            }
        }
        System.out.println("Sum of even numbers without principles: " + sum);
    }
    
}
