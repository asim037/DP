/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gof.mediator.chatroom;

/**
 *
 * @author FA20-BSE-037
 */
public class University {
    private String university;
    public String getName() {
      return university;
   }

   public void setName(String university) {
      this.university = university;
   }
    public University(String university){
        this.university = university;
        
    }
    public void sendMessage(String message){
      ChatRoom.showMessage(this,message);
   }
}
