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