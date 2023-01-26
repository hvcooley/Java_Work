package dev.cooley;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Arrays;

public class MoreLists {
    public static void main(String[] args) {
        String[] items = {"apples", "bannanas", "milk", "eggs"};
        List<String> strList = List.of(items);

        System.out.println(strList);

        System.out.println(strList.getClass().getName());
        //Type List is immutable, can't be changed.

        //List is very helpful for creation of an ArrayList though
        ArrayList<String> groceries = new ArrayList<>(strList);
        System.out.println(groceries);

        //And this ArrayList can be modified
        groceries.add("Oreos");
        System.out.println(groceries);

        //Can do the above steps all in one line
        ArrayList<String> finalList = new ArrayList<>(List.of("Nutter Butter", "Chips Ahoy", "Milano Cookies"));
        System.out.println(finalList);

        //Can add all the elements of one ArrayList to another by using .addAll()
        groceries.addAll(finalList);
        System.out.println(groceries);

        //Can access items in an ArrayList by using .get(). No square bracket operator supported
        System.out.println("\nThe item at index 0 is " + groceries.get(0));

        //Contains method
        if (groceries.contains("Oreos")){
            System.out.println("The list contains Oreos");
        }

        //Also and indexOf() method and lastIndex() method to return index of an element
        // They return -1 if not present
        // indexOf returns first instance of the element

        groceries.add("apples");
        System.out.println(groceries);

        System.out.println("First index appearance of apples is " + groceries.indexOf("apples"));
        System.out.println("Last index appearance of apples is " + groceries.lastIndexOf("apples"));


        System.out.println(groceries);
        //Can also remove elements by index or by value
        groceries.remove(1);
        System.out.println(groceries);
        //Will only remove one instance of a value
        groceries.remove("apples");
        System.out.println(groceries);

        //Can remove multiple at a time with .removeAll() and List.of()
        groceries.removeAll(List.of("Milano Cookies", "Nutter Butter"));
        System.out.println(groceries);

        //Can remove every item in the list except some using .retainAll() and List.of()
        groceries.retainAll(List.of("milk", "eggs", "Oreos"));
        System.out.println(groceries);
        System.out.println();

        //Can clear all elements with .clear()
        groceries.clear();
        System.out.println(groceries);

        //Can check if its empty with .isEmpty()
        System.out.println("Grocery list empty?:" + groceries.isEmpty());
        //Using ternary operator
        String output = groceries.isEmpty() ? "The list is empty" : "The list is not empty";
        System.out.println(output);

        //Use ArrayList .adAll() to add multiple elements at a time
        groceries.addAll(List.of("apples", "milk", "mustard", "cheese"));
        groceries.addAll(Arrays.asList("Chocolate", "Pineapples", "Watermelon"));
        System.out.println("List after adding several elements with .addAll");
        System.out.println(groceries);

        //There's also a sort function on the ArrayList
        System.out.println("\nList after sorting:");
        groceries.sort(Comparator.naturalOrder());
        System.out.println(groceries);
        //Notice order is alphabetical, but capitalized letters have precedence

        //Can sort in reverse order
         groceries.sort(Comparator.reverseOrder());
         System.out.println("\nList after sorting in reverse: ");
         System.out.println(groceries);

         //Convert ArrayList into array
        var groceryArray = groceries.toArray(new String[groceries.size()]);
        System.out.println("\nConvert list into an array:");
        System.out.println(Arrays.toString(groceryArray));

    }
}
