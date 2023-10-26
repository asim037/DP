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
public class Main {
    public static void main(String[] args) {
      User robert = new User("Robert");
      User john = new User("John");
      Teacher a = new Teacher("West");
      University uni= new University("COMSATS");

      robert.sendMessage(john,"Hi! John!");
      john.sendMessage(robert,"Hello! Robert!");
      a.sendMessage(john, "Info! Quiz!");
      uni.sendMessage("Warn! Don't do this!");
   }
    
}
