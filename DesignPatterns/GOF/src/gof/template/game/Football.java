/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gof.template.game;

/**
 *
 * @author FA20-BSE-037
 */
public class Football extends Game{

    @Override
    void initialize() {
        System.out.println("Football Game Initialized, Start Playing ");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void startPlay() {
        System.out.println("Football Game Started ");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void endPlay() {
        System.out.println("Football Game Finished");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
