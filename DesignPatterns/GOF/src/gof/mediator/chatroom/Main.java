/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gof.mediator.chatroom;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LAPTOP HOUSE
 */
public class Main {
    public static void main(String[] args) {
      User robert = new User("Robert");
      User john = new User("John");
      Teacher a = new Teacher("West");
      University uni= new University("COMSATS");

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
       
}
