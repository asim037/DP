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
public class DoubleBordersFactory extends AbstractFactory{
    @Override
   public Shapes getShape(String shapeType){    
      if(shapeType.equalsIgnoreCase("RECTANGLE")){
         return new DBRectangle();         
      }else if(shapeType.equalsIgnoreCase("SQUARE")){
         return new DBSquare();
      }else if(shapeType.equalsIgnoreCase("TRIANGLE")) {
          return new DBTriangle();
      }
          
      return null;
   }
    
}
