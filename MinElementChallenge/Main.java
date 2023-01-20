package dev.cooley;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] myArray = readIntegers();
        System.out.println("The numbers in an array of ints are :" + Arrays.toString(myArray));
        int myMin = findMin(myArray);
        System.out.println("The minimum number in the array is " + myMin);
    }

    private static int[] readIntegers(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a list of integers separated by commas: ");
        String numsAsString = scanner.nextLine();

        System.out.println("The numbers entered are: " + numsAsString);

        String[] strArray = numsAsString.split(",");
        System.out.println("The numbers in an array of strings are: " + Arrays.toString(strArray));

        //Make new array
        int[] nums = new int[strArray.length];


        for (int i = 0; i < strArray.length; i++){
            nums[i] = Integer.parseInt(strArray[i].trim()); //use .trim to get rid of whitespace
        }

        return nums;
    }

    private static int findMin(int[] arr){
        //Using sort, T: O(nlog(n))
//        Arrays.sort(arr);
//        //could also do int min = Integer.MAX_VALUE;
//        int min = arr[0];
//        return min;

        //Using loop, more efficient T: O(n)
        int loopMin = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < loopMin){
                loopMin = arr[i];
            }
        }
        return loopMin;
    }
}
