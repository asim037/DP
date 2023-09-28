/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gof.chainofresponsibility.logging;

/**
 *
 * @author FA20-BSE-037
 */
public abstract class AbstractLogger {
   public static int INFO = 1;
   public static int DEBUG = 2;
   public static int ERROR = 3;
   public static int WARN = 4;

   protected int level;

   //next element in chain or responsibility
   protected AbstractLogger nextLogger;

   public void setNextLogger(AbstractLogger nextLogger){
      this.nextLogger = nextLogger;
   }

   public void logMessage(int level, String message){
      if(this.level <= level){
         write(message);
      }
     if(nextLogger != null){
         nextLogger.logMessage(level, message);
      }
   }
   
   public void logMessageOnce(int level, String message){
      if(this.level == level){
         write(message);
      }
      else if(nextLogger !=null){
         nextLogger.logMessageOnce(level, message);
      }
      else {
          System.out.println("Support not available");
      }
   }

   abstract protected void write(String message);
	
}