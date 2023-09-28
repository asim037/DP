/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulation;

/**
 *
 * @author FA20-BSE-037
 */
public class Encapsulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    Account acc=new Account();  
    acc.setAcc_no(7560504000L);  
    acc.setName("Asim Tariq");  
    acc.setEmail("asim123@gmail.com");  
    acc.setAmount(500000);  
    System.out.println(acc.getAcc_no()+" "+acc.getName()+" "+acc.getEmail()+" "+acc.getAmount());  
    }
    
}
