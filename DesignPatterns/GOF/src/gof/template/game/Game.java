/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gof.template.game;

/**
 *
 * @author FA20-BSE-037
 */
public abstract class Game {
    abstract void initialize();
   abstract void startPlay();
   abstract void endPlay();

   public final void play(){

      initialize();

      startPlay();

      endPlay();
   }
}
