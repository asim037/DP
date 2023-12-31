/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gof.strategy.calculatoroperation;

/**
 *
 * @author FA20-BSE-037
 */
public class Main {
   public static void main(String[] args) {
      Context context = new Context(new OperationAdd());		
      System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

      context = new Context(new OperationSub());		
      System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

      context = new Context(new OperationMul());		
      System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
      
      System.out.println("Computer in Range 44 , 44 = "+context.executeInRange(44, 44));
      context.executeInRange(44, 144);
      
      context.executeInRange(120, 150);
      context.executeInRange(120, 1250);
      
       int executeInRange = context.executeInRange(10, 20);
       System.out.println("Print :"+ executeInRange);
      
   }
}