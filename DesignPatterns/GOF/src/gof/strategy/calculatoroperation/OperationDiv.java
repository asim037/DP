/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gof.strategy.calculatoroperation;

/**
 *
 * @author FA20-BSE-037
 */
public class OperationDiv extends Computer{
    
    public OperationDiv(){}
    public OperationDiv(OperationPow operationpow) {
        this.nextStrategy = operationpow;
    }

    @Override
    public int doOperation(int num1, int num2) {
        if(num2==0){
            return -1;
        }else{
        return num1/num2;
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    @Override
    public int ComputeRange(int num1, int num2) {
        if(num1<=5000 && num1>10000 && num2<=5000 && num2>10000)
            return num1+num2;
        if(nextStrategy!=null)
            nextStrategy.ComputeRange(num1, num2);
        System.out.println("Invalid data range");
        return 0;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    
}
