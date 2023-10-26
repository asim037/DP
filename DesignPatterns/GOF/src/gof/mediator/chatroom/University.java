/*
<<<<<<< HEAD
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
=======
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gof.mediator.chatroom;

import java.util.List;

/**
 *
 * @author LAPTOP HOUSE
 */
public class University implements MessageTarget {
    
    private String university;
    @Override
>>>>>>> 19654b74c37957d60db799a996325ab19a91a921
    public String getName() {
      return university;
   }

   public void setName(String university) {
      this.university = university;
   }
    public University(String university){
        this.university = university;
        
    }
<<<<<<< HEAD
    public void sendMessage(String message){
      ChatRoom.showMessage(this,message);
   }
=======
    public void sendMessage(MessageTarget target, String message){
      ChatRoom.showMessage(this, target,message);
   }
    public void sendMessage1(List<MessageTarget> targets, String message) {
        ChatRoom.showMessage1(this, targets, message);
    }
>>>>>>> 19654b74c37957d60db799a996325ab19a91a921
}
