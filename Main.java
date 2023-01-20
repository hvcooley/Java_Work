package dev.cooley;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){

        //Demonstrating how array variables are references to array objects in memory
        int[] myArray = new int[5];
        int[] anotherArray = myArray;

        System.out.println(Arrays.toString(myArray));
        System.out.println(Arrays.toString(anotherArray));

        //Change affects both myArray and anotherArray. Shows how they reference same array object in memory
        anotherArray[0] = 1;
        System.out.println("The contents of myArray after the change are: " +
                Arrays.toString(myArray));
        System.out.println("The contents of anotherArray after the change are: " +
                Arrays.toString(anotherArray));

        //Passing reference of an array to a function
        changeArray(myArray);
        changeArray(anotherArray);

        System.out.println("The contents of myArray after the fucniton are: " +
                Arrays.toString(myArray));
        System.out.println("The contents of anotherArray after the function are: " +
                Arrays.toString(anotherArray));

    }

    //Using an array in a function parameter is also passing a reference to it
    private static void changeArray(int[] arr){
        arr[1] = 2;
    }
}
