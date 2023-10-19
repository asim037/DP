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
public class ComputerPartDisplay implements ComputerPartVisitor {

    @Override
    public void visit(Computer computer) {
        System.out.println("Display Computer");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Display Mouse");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Display keyboard");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Display Monitor");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public void visit(Multimedia multimedia) {
        System.out.println("Display Multimedia");
    }

    
    
}
