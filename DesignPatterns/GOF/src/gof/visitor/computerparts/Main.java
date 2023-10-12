/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gof.visitor.computerparts;

/**
 *
 * @author FA20-BSE-037
 */
public class Main {
    public static void main(String[] args) {

      ComputerPart computer = new Computer();
      computer.accept(new ComputerPartDisplay());
//      ComputerPart keyboard = new Keyboard();
//      keyboard.accept(new ComputerPartDisplay());
   }
    
}
