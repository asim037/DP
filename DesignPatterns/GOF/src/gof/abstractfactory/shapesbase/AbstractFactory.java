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
public abstract class AbstractFactory {
   abstract Shapes getShape(String shapeType) ;
}
