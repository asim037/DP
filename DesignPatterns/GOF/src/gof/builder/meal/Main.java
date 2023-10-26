/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gof.builder.meal;

import java.util.Scanner;

/**
 *
 * @author FA20-BSE-037
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();                                                                                                                                                                                                                 
        Meal meal = new Meal();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Meal Builder!");

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Prepare Veg Meal");
            System.out.println("2. Prepare Non-Veg Meal");
            System.out.println("3. Prepare Diet Meal");
            System.out.println("4. Prepare Tea");
            System.out.println("5. Show Meal and Total Cost");
            System.out.println("6. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    meal = mealBuilder.prepareVegMeal();
                    break;
                case 2:
                    meal = mealBuilder.prepareNonVegMeal();
                    break;
                case 3:
                    meal = mealBuilder.prepareDietMeal();
                    break;
                case 4:
                    meal = mealBuilder.prepareTeaMeal();
                    break;
                case 5:
                    System.out.println("Meal Details:");
                    meal.showItems();
                    System.out.println("Total Cost: " + meal.getCost());
                    break;
                case 6:
                    System.out.println("Thank you for using the Meal Builder. Goodbye!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
                    break;
            }
        }
    }
}
//    public static void main(String[] args) {
//        MealBuilder mealBuilder = new MealBuilder();
//        Meal meal = new Meal();
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Welcome to the Meal Builder!");
//
//        while (true) {
//            System.out.println("\nChoose an option:");
//            System.out.println("1. Prepare Veg Meal");
//            System.out.println("2. Prepare Non-Veg Meal");
//            System.out.println("3. Prepare Diet Meal");
//            System.out.println("4. Prepare Tea");
//            System.out.println("5. Add Sweetness to Tea");
//            System.out.println("6. Add Cream to Tea");
//            System.out.println("7. Show Meal and Total Cost");
//            System.out.println("8. Exit");
//
//            int choice = scanner.nextInt();
//
//            switch (choice) {
//                case 1:
//                    meal = mealBuilder.prepareVegMeal();
//                    break;
//                case 2:
//                    meal = mealBuilder.prepareNonVegMeal();
//                    break;
//                case 3:
//                    meal = mealBuilder.prepareDietMeal();
//                    break;
//                case 4:
//                    meal = mealBuilder.prepareTeaMeal();
//                    break;
//                case 5:
////                    if (meal.getItems().size() > 0 && meal.getItems().get(meal.getItems().size() - 1) instanceof DecBevarages) {
//                    if (meal.addItem().size() > 0 && meal.addItem().get(meal.addItem().size() - 1) instanceof DecBevarages) {
//                        System.out.print("Enter Sweetness Type: ");
//                        String sweetnessType = scanner.next();
//                        System.out.print("Enter Sweetness Amount in Spoons: ");
//                        int sweetnessAmount = scanner.nextInt();
//                        ((DecBevarages) meal.getItems().get(meal.getItems().size() - 1)).addSweetness(sweetnessType, sweetnessAmount);
//                        System.out.println("Sweetness added to the tea.");
//                    } else {
//                        System.out.println("Please prepare tea first before adding sweetness.");
//                    }
//                    break;
//                case 6:
//                    if (meal.getItems().size() > 0 && meal.getItems().get(meal.getItems().size() - 1) instanceof DecBevarages) {
//                        ((DecBevarages) meal.getItems().get(meal.getItems().size() - 1)).addCream();
//                        System.out.println("Cream added to the tea.");
//                    } else {
//                        System.out.println("Please prepare tea first before adding cream.");
//                    }
//                    break;
//                case 7:
//                    System.out.println("Meal Details:");
//                    meal.showItems();
//                    System.out.println("Total Cost: " + meal.getCost());
//                    break;
//                case 8:
//                    System.out.println("Thank you for using the Meal Builder. Goodbye!");
//                    scanner.close();
//                    System.exit(0);
//                    break;
//                default:
//                    System.out.println("Invalid choice. Please select a valid option.");
//                    break;
//            }
//        }
//    }
//}

   
//      MealBuilder mealBuilder = new MealBuilder();
//
//      Meal vegMeal = mealBuilder.prepareVegMeal();
//      System.out.println("Veg Meal");
//      vegMeal.showItems();
//      System.out.println("Total Cost: " + vegMeal.getCost());
//
//      Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
//      System.out.println("\n\nNon-Veg Meal");
//      nonVegMeal.showItems();
//      System.out.println("Total Cost: " + nonVegMeal.getCost());
   
    

