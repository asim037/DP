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
public interface DecBevarages extends Item {
    void addSweetness(String sweettype, int amountspoons);
    void addCream();
    float getDecorationCost();
//    float price();
//    String name();
}

