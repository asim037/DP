/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gof.adapter.mediaplayer;

/**
 *
 * @author FA20-BSE-037
 */
public class VlcPlayer implements AdvancedMediaPlayer {

    @Override
    public void playmp4(String FileName) {
        //System.out.println("Playing VLC file......"+ FileName);
        
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void playvlc(String FileName) {
        System.out.println("Playing VLC file......"+ FileName);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
