/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gof.builder.meal;

/**
 *
 * @author FA20-BSE-037
 */
public class DietPepsi extends ColdDrink implements DietDrink {
    @Override
    public float price() {
        return 40.0f; 
    }

    @Override
    public String name() {
        return "Diet Pepsi";
    }
}

