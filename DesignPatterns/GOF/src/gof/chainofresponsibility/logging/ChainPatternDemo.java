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
public class ChainPatternDemo {
	
   private static AbstractLogger getChainOfLoggers(){

      AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
      AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
      AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
      AbstractLogger databaseLogger = new DatabaseLogger(AbstractLogger.WARN);

      errorLogger.setNextLogger(fileLogger);
      fileLogger.setNextLogger(databaseLogger);
      databaseLogger.setNextLogger(consoleLogger);

      return errorLogger;	
   }
   
   private static AbstractLogger getChainOfLoggersOnce(){

      AbstractLogger errorLogger1 = new ErrorLogger(AbstractLogger.ERROR);
      //AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
      AbstractLogger consoleLogger1 = new ConsoleLogger(AbstractLogger.INFO);
      AbstractLogger databaseLogger1 = new DatabaseLogger(AbstractLogger.WARN);

      errorLogger1.setNextLogger(databaseLogger1);
      //fileLogger.setNextLogger(databaseLogger);
      databaseLogger1.setNextLogger(consoleLogger1);
      //consoleLogger1.setNextLogger(errorLogger1);

      return errorLogger1;
      
   }

   public static void main(String[] args) {
      AbstractLogger loggerChain = getChainOfLoggers();
      AbstractLogger loggerChain2 = getChainOfLoggersOnce();
      
      
      loggerChain.logMessage(AbstractLogger.INFO, 
         "This is an information.");

      loggerChain.logMessage(AbstractLogger.DEBUG, 
         "This is an debug level information.");

      loggerChain.logMessage(AbstractLogger.ERROR, 
         "This is an error information.");
      
      loggerChain.logMessage(AbstractLogger.WARN, 
              "This is a warning information");

      loggerChain2.logMessageOnce(AbstractLogger.INFO, 
         "This is an information.");

      loggerChain2.logMessageOnce(AbstractLogger.DEBUG, 
         "This is an debug level information.");

      loggerChain2.logMessageOnce(AbstractLogger.ERROR, 
         "This is an error information.");
      
      loggerChain2.logMessageOnce(AbstractLogger.WARN, 
              "This is a warning information");
   }
}
