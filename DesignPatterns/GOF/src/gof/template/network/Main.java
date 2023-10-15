/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gof.template.network;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input user name: ");
        String userName = reader.readLine();
        System.out.print("Input password: ");
        String password = reader.readLine();
        
        while (true) {
            System.out.print("Enter message description: ");
            String description = reader.readLine();
            System.out.print("Enter message type (ERROR, WARNING, INFO): ");
            MessageType messageType = MessageType.valueOf(reader.readLine());
            System.out.print("Enter network type (FACEBOOK, TWITTER, LINKEDIN, or leave empty for all): ");
            String networkTypeInput = reader.readLine();
            NetworkType networkType = (networkTypeInput.isEmpty()) ? null : NetworkType.valueOf(networkTypeInput);
            
            MessageDesc messageDesc = new MessageDesc(description, messageType, networkType);      
            Network network = null;
            
            if (messageDesc.getNetworkType() == null) {
                network = new Facebook(userName, password);
                network.post(messageDesc.getDescription());
                network = new Twitter(userName, password);
                network.post(messageDesc.getDescription());
                network = new LinkedIn(userName, password);
                network.post(messageDesc.getDescription());
            } else {
                switch (messageDesc.getNetworkType()) {
                    case FACEBOOK:
                        network = new Facebook(userName, password);
                        network.post(messageDesc.getDescription());
                        break;
                    case TWITTER:
                        network = new Twitter(userName, password);
                        network.post(messageDesc.getDescription());
                        break;
                    case LINKEDIN:
                        network = new LinkedIn(userName, password);
                        network.post(messageDesc.getDescription());
                        break;
                }
            }
            System.out.print("Continue (Y/N)? ");
            String continueInput = reader.readLine();
            if (!continueInput.equalsIgnoreCase("Y")) {
                break;
            }
        }
    }
}

//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
///**
// *
// * @author FA20-BSE-037
// */
//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        Network network = null;
//        System.out.print("Input user name: ");
//        String userName = reader.readLine();
//        System.out.print("Input password: ");
//        String password = reader.readLine();
//        while(true){
//         
//        // Enter the message.
//        System.out.print("Input message: ");
//        String message = reader.readLine();
//        System.out.print("Enter message description: ");
//        String description = reader.readLine();
//        System.out.print("Enter message type (ERROR, WARNING, INFO): ");
//        MessageType messageType = MessageType.valueOf(reader.readLine());
//        System.out.print("Enter network type (FACEBOOK, TWITTER, LINKEDIN, or leave empty for all): ");
//        String networkTypeInput = reader.readLine();
//        
//        NetworkType networkType = (networkTypeInput.isEmpty()) ? null : NetworkType.valueOf(networkTypeInput);
//
//        MessageDesc message1 = new MessageDesc(description, messageType, networkType);
//
//            // Logic to send the message based on the Message object.
//            if (message1.getNetworkType() == null) {
//                // Send the message to all networks.
//                network = new Facebook("your_fb_user", "your_fb_password");
//                network.post(message1.getDescription());
//                network = new Twitter("your_twitter_user", "your_twitter_password");
//                network.post(message1.getDescription());
//                network = new LinkedIn("your_linkedin_user", "your_linkedin_password");
//                network.post(message1.getDescription());
//            } else {
//                // Send the message to the specified network.
//                switch (message1.getNetworkType()) {
//                    case FACEBOOK:
//                        network = new Facebook("your_fb_user", "your_fb_password");
//                        network.post(message1.getDescription());
//                        break;
//                    case TWITTER:
//                        network = new Twitter("your_twitter_user", "your_twitter_password");
//                        network.post(message1.getDescription());
//                        break;
//                    case LINKEDIN:
//                        network = new LinkedIn("your_linkedin_user", "your_linkedin_password");
//                        network.post(message1.getDescription());
//                        break;
//                }
//            }
//
//            // Prompt to continue or stop.
//            System.out.print("Continue (Y/N)? ");
//            String continueInput = reader.readLine();
//            if (!continueInput.equalsIgnoreCase("Y")) {
//                // Exit the program.
//                break;
//            }
//        
//
////        System.out.println("\nChoose social network for posting message.\n" +
////                "1 - Facebook\n" +
////                "2 - Twitter\n"  +
////                "3 - LinkedIn");
////        int choice = Integer.parseInt(reader.readLine());
////
////        // Create proper network object and send the message.
////        if (choice == 1) {
////            network = new Facebook(userName, password);
////        } else if (choice == 2) {
////            network = new Twitter(userName, password);
////        }
////        else if(choice == 3){
////            network = new LinkedIn(userName, password);
////            
////        }
////        network.post(message);
//        }// end of while
//    }
//}
    

