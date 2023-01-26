package dev.cooley;

import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name, String type, int count){
    public GroceryItem(String name){
        this(name, "DAIRY", 1);
    }

    @Override
    public String toString(){
        return String.format("%d %s in %s", count, name.toUpperCase(), type);
    }

}

public class ArrayListPrac {
    public static void main(String[] args){
        GroceryItem[] groceryArray = new GroceryItem[3];
        groceryArray[0] = new GroceryItem("Milk");
        groceryArray[1] = new GroceryItem("Apples", "PRODUCE", 6);
        groceryArray[2] = new GroceryItem("Oranges", "PRODUCE", 5);

        System.out.println(Arrays.toString(groceryArray));

        //if a type isn't specified with ArrayList, it will use Object by default
        ArrayList objectList = new ArrayList();

        //Use .add to add elements to the list
        objectList.add(new GroceryItem("Butter"));
        objectList.add("Yogurt");

        //Specify a type for the arrayList like so
        ArrayList<GroceryItem> groceryList = new ArrayList<>();
        //the diamond operator <> at the end is necessary to specify compile time type checking

        //This notation is permissable but not as good
        //ArrayList<GroceryItem> groceryList = new ArrayList<GroceryItem>();

        groceryList.add(new GroceryItem("Butter"));
        groceryList.add(new GroceryItem("Cheese"));
        groceryList.add(new GroceryItem("Milk"));

        //Can add to a specific index
        groceryList.add(0, new GroceryItem("Apples", "PRODUCE", 10));

        //To print out an ArrayList, can just pass to System.out.println()
        System.out.println(groceryList);

        //Can replace a specific index with .set
        groceryList.set(3, new GroceryItem("Chocolate Milk", "DAIRY", 1));
        //Can't set an index that doesn't exist yet though, will throw error

        System.out.println(groceryList);

        //Remove an item at an index
        groceryList.remove(1);




    }
}
