/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gof.flyweight.foresttrees;

import java.awt.Graphics;

/**
 *
 * @author LAPTOP HOUSE
 */
public class Tree {
    
    private int x;
    private int y;
    private TreeType type;

    public Tree(int x, int y, TreeType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void draw(Graphics g) {
        type.draw(g, x, y);
    }
    
    
//    private int x;
//    private int y;
//    private TreeType type;
//
//    public Tree(int x, int y, TreeType type) {
//        this.x = x;
//        this.y = y;
//        this.type = type;
//    }
//
//    public void draw(Graphics g) {
//        type.draw(g, x, y);
//    }
    
}
