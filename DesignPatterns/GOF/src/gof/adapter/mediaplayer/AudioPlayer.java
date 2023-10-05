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
public class AudioPlayer implements MediaPlayer {
    MediaAdapter media;

    @Override
    public void play(String FileName, String AudioType) {
        if(AudioType.equalsIgnoreCase("mp3")){
         System.out.println("Playing mp3 file.... Name: " + FileName);			
      } 
      else if(AudioType.equalsIgnoreCase("vlc") || AudioType.equalsIgnoreCase("mp4")){
         media = new MediaAdapter(AudioType);
         media.play(AudioType, FileName);
      }
      
//      else{
//         System.out.println("Invalid media.... " + AudioType + " format not supported");
//      }
        


//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
