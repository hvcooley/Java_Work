package dev.cooley;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        //Create a random array of integers, then sort it in descending order

        int[] testArray = getRandomArray(10);

        System.out.println("The array before sorting is " + Arrays.toString(testArray));

        sortArrayLowToHigh(testArray);

        System.out.println("The array after sorting is " + Arrays.toString(testArray));

    }

    private static int[] getRandomArray(int len){
        Random random  = new Random();
        int[] newIntArr = new int[len];
        for (int i = 0; i < len; i++){
            newIntArr[i] = random.nextInt(100);
        }
        return newIntArr;
    }

    //Naive solution: Search linearly through the array for the minimum then switch to front.
    // then repeat searches excluding the previous front index until at the end of the array.
    private static void sortArrayLowToHigh(int[] arr){
        int front = 0;
        while (front != arr.length){
            int minElement = arr[front];
            int minElIndex = front;
            for (int i = front; i < arr.length; i++){
                if (arr[i] < minElement){
                    minElement = arr[i];
                    minElIndex = i;
                }
            }//END for
            //Perform swap of front and min
            arr[minElIndex] = arr[front];
            arr[front] = minElement;
            front += 1;
        }
    }
}
