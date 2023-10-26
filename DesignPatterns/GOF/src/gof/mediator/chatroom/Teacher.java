/*
<<<<<<< HEAD
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gof.mediator.chatroom;

import java.util.List;

/**
 *
 * @author FA20-BSE-037
 */
public class Teacher implements MessageTarget {
    private String teacher;
    
    @Override
    public String getName() {
      return teacher;
   }

   public void setName(String teacher) {
      this.teacher = teacher;
   }
    public Teacher(String teacher){
        this.teacher = teacher;
        
    }
    public void sendMessage(MessageTarget target, String message){
      ChatRoom.showMessage(this, target, message);
   }
    public void sendMessage1(List<MessageTarget> targets, String message) {
        ChatRoom.showMessage1(this, targets, message);
    }
    
}