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
public class Keyboard implements ComputerPart{
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
      computerPartVisitor.visit(this);
   }
   

}
