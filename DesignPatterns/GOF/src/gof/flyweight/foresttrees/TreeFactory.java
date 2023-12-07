/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gof.flyweight.foresttrees;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author LAPTOP HOUSE
 */
public class TreeFactory {
    
    static Map<String, TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreeType(String name, Color color, String otherTreeData, boolean isFruitTree, int countOfFruits) {
        TreeType result = treeTypes.get(name);
        if (result == null) {
            result = new TreeType(name, color, otherTreeData, isFruitTree, countOfFruits);
            treeTypes.put(name, result);
        }
        return result;
    }
    
    
//    static Map<String, TreeType> treeTypes = new HashMap<>();
//
//    public static TreeType getTreeType(String name, Color color, String otherTreeData, boolean isFruitTree, int countOfFruits) {
//        TreeType result = treeTypes.get(name);
//        if (result == null) {
//            result = new TreeType(name, color, otherTreeData, isFruitTree, countOfFruits);
//            treeTypes.put(name, result);
//        }
//        return result;
//    }
}
