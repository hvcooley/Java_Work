package dev.cooley;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("\nHello welcome to the grocery list program where you can add and remove items");
        System.out.println(" from a grocery list...\n");

        GroceryList myList = new GroceryList();

        boolean done = false;
        while (done == false){
            String choice = getUserInput();
            int choiceAsInt;

            try {
                choiceAsInt = Integer.parseInt(choice);

            } catch (final NumberFormatException e) {
                choiceAsInt = 3;
                //Make the choice 3, because it means the user didn't enter a number, so should ask them again
            }

            //System.out.println("The integer is " + choiceAsInt);

            switch(choiceAsInt){
                case 0 -> {
                    System.out.println("Program quitting");
                    done = true;
                }
                case 1 -> myList.addItemsV2(); //myList.addItems();
                case 2 -> myList.removeItemsV2(); //myList.removeItems();
                default -> {
                    System.out.println("Sorry this is not a valid entry please try again");
                }
            }//END switch
        }
    }//END Main
    //Have function getUserInput
    public static String getUserInput(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number for the following options:");
        System.out.println("0. Quit Program");
        System.out.println("1. Add items to grocery list");
        System.out.println("2. Remove items from grocery list");

        String input = scanner.nextLine();

        return input;
    }
}
