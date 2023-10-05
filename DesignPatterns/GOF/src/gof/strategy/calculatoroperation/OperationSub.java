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
public class OperationSub extends Computer implements Strategy {
//    
    

    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int ComputeRange(int num1, int num2) {
        if(num1<=1000 && num1>100 && num2<=1000 && num2>100)
            return num1+num2;
        if(nextStrategy!=null)
            nextStrategy.ComputeRange(num1, num2);
        System.out.println("Invalid data range");
        return 0;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
