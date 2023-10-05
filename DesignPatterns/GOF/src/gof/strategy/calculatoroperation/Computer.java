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
abstract class Computer implements Strategy {
    Computer nextStrategy = null;
    public abstract int ComputeRange(int num1, int num2);
    
}
