/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gof.mediator.chatroom;

import java.util.List;

/**
 *
 * @author LAPTOP HOUSE
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

    

