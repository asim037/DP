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
public class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer advancedMusicPlayer;
    public MediaAdapter(String AudioType){
   
      if(AudioType.equalsIgnoreCase("vlc") ){
         advancedMusicPlayer = new VlcPlayer();			
         
      }else if (!AudioType.equalsIgnoreCase("mp4")){
      } else {
          advancedMusicPlayer = new Mp4Player();
      }	
   }

    @Override
    public void play(String FileName, String AudioType) {
        if(AudioType.equalsIgnoreCase("vlc")){
         advancedMusicPlayer.playvlc(FileName);
      }
      else if(AudioType.equalsIgnoreCase("mp4")){
         advancedMusicPlayer.playmp4(FileName);
      }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
