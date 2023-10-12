/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gof.iterator.sequencenames;

/**
 *
 * @author FA20-BSE-037
 */
public interface Iterator {
   public boolean hasNext();
   public Object next(); 
   Object previous();
    void moveToLast();
    void moveToFirst();
}
