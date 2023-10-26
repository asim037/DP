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
public class Teacher implements MessageTarget {
    private String teacher;
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
public class Teacher implements MessageTarget {
    private String teacher;
    
    @Override
>>>>>>> 19654b74c37957d60db799a996325ab19a91a921
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
<<<<<<< HEAD
    
}
=======
    public void sendMessage1(List<MessageTarget> targets, String message) {
        ChatRoom.showMessage1(this, targets, message);
    }
    
}

    

>>>>>>> 19654b74c37957d60db799a996325ab19a91a921
