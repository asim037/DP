/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gof.abstractfactory.shape;

/**
 *
 * @author FA20-BSE-037
 */
public interface AbstractFactory {
   abstract Shapes getShape(String shapeType) ;
}
