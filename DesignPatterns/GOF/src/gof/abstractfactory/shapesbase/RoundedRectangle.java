/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gof.abstractfactory.shapesbase;

/**
 *
 * @author FA20-BSE-037
 */
public class RoundedRectangle implements Shapes {
    @Override
   public void draw() {
      System.out.println("Inside RoundedRectangle::draw() method.");
   }
}
