/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gof.chainofresponsibility.logging;

/**
 *
 * @author FA20-BSE-037
 */
public class DatabaseLogger extends AbstractLogger{

    DatabaseLogger(int WARN) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void write(String message) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Database Logger : " + message);
    }
    
}