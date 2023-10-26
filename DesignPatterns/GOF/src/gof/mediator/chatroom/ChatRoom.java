/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gof.mediator.chatroom;

import java.util.Date;

/**
 *
 * @author FA20-BSE-037
 */
public class ChatRoom {
    public static void showMessage(User user, MessageTarget target, String message){
      System.out.println( new Date().toString() + " [" + user.getName() + "] to [" + target.getName()+ "]"  + message);
    }
    public static void showMessage(Teacher teacher, MessageTarget target, String message){
        String name=target.getName();
        System.out.println(name);
        System.out.println(new Date().toString() + " [" + teacher.getName() + "] to [" + target.getName() + "] : " + message);
    }
    public static void showMessage(University university, String message){
      System.out.println(new Date().toString() + " [" + university.getName() + "] : " + message);
    } 
}
