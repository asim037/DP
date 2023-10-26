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
public class Main {
    public static void main(String[] args) {
      //get shape factory
      AbstractFactory shapeFactory = FactoryProducer.getFactory(false, false);
      //get an object of Shape Rectangle
      Shapes shape1 = shapeFactory.getShape("RECTANGLE");
      //call draw method of Shape Rectangle
      shape1.draw();
      //get an object of Shape Square 
      Shapes shape2 = shapeFactory.getShape("SQUARE");
      //call draw method of Shape Square
      shape2.draw();
      Shapes shape3 = shapeFactory.getShape("TRIANGLE");
      //call draw method of Shape Square
      shape3.draw();
      //get shape factory
      AbstractFactory shapeFactory1 = FactoryProducer.getFactory(true, true);
      //get an object of Shape Rectangle
      Shapes shape4 = shapeFactory1.getShape("RECTANGLE");
      //call draw method of Shape Rectangle
      shape4.draw();
      //get an object of Shape Square 
      Shapes shape5 = shapeFactory1.getShape("SQUARE");
      //call draw method of Shape Square
      shape5.draw();
      Shapes shape6 = shapeFactory1.getShape("TRIANGLE");
      //call draw method of Shape Square
      shape6.draw();
      
   }
    
}
