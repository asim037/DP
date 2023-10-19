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
public class User implements MessageTarget {
     private String name;

     @Override
   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public User(String name){
      this.name  = name;
   }

   public void sendMessage(MessageTarget target, String message){
      ChatRoom.showMessage(this, target, message);
   }
   public void sendMessage1(List<MessageTarget> targets, String message) {
        ChatRoom.showMessage1(this, targets, message);
    }
    
}
