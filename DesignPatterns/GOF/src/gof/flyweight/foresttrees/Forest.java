/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gof.flyweight.foresttrees;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;

/**
 *
 * @author LAPTOP HOUSE
 */
public class Forest extends JFrame{
    
    public static int CANVAS_SIZE = 500;

    private List<Tree> trees = new ArrayList<>();

    public int getCanvasSize() {
        return CANVAS_SIZE;
    }

    public void plantTree(int x, int y, String name, Color color, String otherTreeData, boolean isFruitTree, int countOfFruits) {
        TreeType type = TreeFactory.getTreeType(name, color, otherTreeData, isFruitTree, countOfFruits);
        Tree tree = new Tree(x, y, type);
        trees.add(tree);
    }

    @Override
    public void paint(Graphics graphics) {
        for (Tree tree : trees) {
            tree.draw(graphics);
        }
    }

//    static int CANVAS_SIZE;
//    private List<Tree> trees = new ArrayList<>();
//
//    public void plantTree(int x, int y, String name, Color color, String otherTreeData, boolean isFruitTree, int countOfFruits) {
//        TreeType type = TreeFactory.getTreeType(name, color, otherTreeData, isFruitTree, countOfFruits);
//        Tree tree = new Tree(x, y, type);
//        trees.add(tree);
//    }
//    public int getCanvasSize() {
//        return CANVAS_SIZE;
//    }
//
//
//    @Override
//    public void paint(Graphics graphics) {
//        for (Tree tree : trees) {
//            tree.draw(graphics);
//        }
//    }
}
