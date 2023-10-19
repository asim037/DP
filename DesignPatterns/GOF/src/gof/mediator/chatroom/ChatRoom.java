/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gof.mediator.chatroom;

import java.util.Date;
import java.util.List;

/**
 *
 * @author LAPTOP HOUSE
 */
public class ChatRoom {
    public static void showMessage(User user, MessageTarget target, String message){
      System.out.println(new Date().toString() + " [" + user.getName() + "] to [" + target.getName() + "]" + message);
    }
    public static void showMessage(Teacher teacher, MessageTarget target, String message){
      System.out.println(new Date().toString() + " [" + teacher.getName() + "] to [" + target.getName() + "] " + message);
    }
    public static void showMessage(University university, MessageTarget target, String message){
      System.out.println(new Date().toString() + " [" + university.getName() + "] to [" + target.getName() + "] " + message);
    } 
    public static void showMessage1(User user, List<MessageTarget> targets, String message){
      System.out.println(new Date().toString() + " [" + user.getName() + "]");
      for (MessageTarget target : targets) {
            System.out.print("[" + target.getName() + "] ");
        }
        System.out.println(message);
    }
    public static void showMessage1(Teacher teacher, List<MessageTarget> targets, String message){
      System.out.println(new Date().toString() + " [" + teacher.getName() + "]");
      for (MessageTarget target : targets) {
            System.out.print("[" + target.getName() + "] ");
        }
        System.out.println(message);
    }
    public static void showMessage1(University uni, List<MessageTarget> targets, String message){
      System.out.println(new Date().toString() + " [" + uni.getName() + "]");
      for (MessageTarget target : targets) {
            System.out.print("[" + target.getName() + "] ");
        }
        System.out.println(message);
    }
    
}
