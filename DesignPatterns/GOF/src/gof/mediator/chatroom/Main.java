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
=======
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gof.mediator.chatroom;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LAPTOP HOUSE
>>>>>>> 19654b74c37957d60db799a996325ab19a91a921
 */
public class Main {
    public static void main(String[] args) {
      User robert = new User("Robert");
      User john = new User("John");
      Teacher a = new Teacher("West");
      University uni= new University("COMSATS");

<<<<<<< HEAD
      robert.sendMessage(john,"Hi! John!");
      john.sendMessage(robert,"Hello! Robert!");
      a.sendMessage(john, "Info! Quiz!");
      uni.sendMessage("Warn! Don't do this!");
   }
    
=======
      robert.sendMessage(john, "Hi! John!");
      john.sendMessage( uni, "Hello! Robert!");
      a.sendMessage(uni, "Info! Quiz!");
      uni.sendMessage(robert, "Warn! Don't do this!");
      
      List<MessageTarget> col = new ArrayList<>();
        col.add(john);
        col.add(a);
        col.add(uni);

        robert.sendMessage1(col, "Hi, colleagues! Let's chat!");
    }
       
>>>>>>> 19654b74c37957d60db799a996325ab19a91a921
}
