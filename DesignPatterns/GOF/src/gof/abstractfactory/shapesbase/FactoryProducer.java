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
public class FactoryProducer {

   public static AbstractFactory getFactory(boolean rounded, boolean doubleborders){   

      if(rounded){
         return new RoundedShapeFactory();         
      }
      else if(doubleborders){
         return new DoubleBordersFactory();
      }
      else{
         return new ShapeFactory();
      }
   }
}
