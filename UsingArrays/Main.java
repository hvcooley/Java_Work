package dev.cooley;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //Test arrays basics
        int[] myIntArray = new int[10];
        myIntArray[0] = 45;
        myIntArray[1] = 1;
        myIntArray[5] = 50;

        double[] myDoubleArray = new double[10];
        myDoubleArray[2] = 3.5;
        System.out.println(myDoubleArray[2]);

        int[] firstTen = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("first = " + firstTen[0]);
        int arrayLength = firstTen.length;
        System.out.println("length of array = " + arrayLength);
        System.out.println("last = " + firstTen[arrayLength - 1]);

        int[] newArray;
        newArray = new int[] {5, 4, 3, 2, 1};
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }

        //Testing Arrays collection framework helper class

        int[] firstArray = getRandomArray(10);
        System.out.println(Arrays.toString(firstArray));
        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));

        int[] secondArray = new int[10];
        System.out.println(Arrays.toString(secondArray));
        Arrays.fill(secondArray, 5);
        System.out.println(Arrays.toString(secondArray));

        int[] thirdArray = getRandomArray(10);
        System.out.println(Arrays.toString(thirdArray));

        int[] fourthArray = Arrays.copyOf(thirdArray, thirdArray.length);
        System.out.println(Arrays.toString(fourthArray));

        Arrays.sort(fourthArray);
        System.out.println(Arrays.toString(thirdArray));
        System.out.println(Arrays.toString(fourthArray));

        int[] smallerArray = Arrays.copyOf(thirdArray, 5);
        System.out.println(Arrays.toString(smallerArray));

        int[] largerArray = Arrays.copyOf(thirdArray, 15);
        System.out.println(Arrays.toString(largerArray));

        //Testing Arrays.binarySearch and Arrays.equals
        String[] sArray = {"Able", "Mark", "Han", "Luke", "Leia"};
        Arrays.sort(sArray);
        System.out.println(Arrays.toString(sArray));

        if (Arrays.binarySearch(sArray, "Luke") >= 0){
            System.out.println("Found Luke in the array");
        }

        int[] nums1 = {1,2,3,4,5};
        int[] nums2 = {1,2,3,4,5};

        if (Arrays.equals(nums1, nums2)){
            System.out.println("The two arrays are equal");
        }
        else {
            System.out.println("The two arrays are not equal");
        }

    }

    private static int[] getRandomArray(int len){
        Random random  = new Random();
        int[] newIntArr = new int[len];
        for (int i = 0; i < len; i++){
            newIntArr[i] = random.nextInt(100);
        }
        return newIntArr;
    }
}
