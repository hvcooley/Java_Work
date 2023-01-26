package dev.cooley;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args){

        //Having a list backed by the array
        //All the operations on the list will also be done to the array

        String[] originalArray = new String[] {"First", "Second", "Third"};
        var originalList = Arrays.asList(originalArray);

        originalList.set(0, "one");
        System.out.println(originalList);
        System.out.println(Arrays.toString(originalArray ));

        originalList.sort(Comparator.naturalOrder());
        System.out.println(Arrays.toString(originalArray));

        //Since the list is backed by an array we can't remove or add elements
        //originalList.remove(0);
        //originalList.add("Four");

        //This is like dressing up the array as a list. Can be helpful for matching types or even just
        // using the List.sort() function on an array


        //Can also use Arrays .asList() and pass the elements as multiple arguments
        List<String> newList = Arrays.asList("Sunday", "Monday", "Tuesday");
        System.out.println(newList);
    }
}
