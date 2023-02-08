package com.cooley;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] intArr = {1,2,3,4,5,6};
        System.out.println("Array before reversal" + Arrays.toString(intArr));
        reverseIntArray(intArr);
        System.out.println("Array after reversal" + Arrays.toString(intArr));

        //Test reverseAnyArray
        Integer[] intGenericArray = {1,2,3,4,5,6};
        System.out.println("Array before reversal" + Arrays.toString(intGenericArray));
        reverseAnyArray(intGenericArray);
        System.out.println("Array after reversal" + Arrays.toString(intGenericArray));

        //Test reverseAnyArray with Booleans
        Boolean[] boolGenericArr = {true, false, true, true, false, false};
        System.out.println("Array before reversal" + Arrays.toString(boolGenericArr));
        reverseAnyArray(boolGenericArr);
        System.out.println("Array after reversal" + Arrays.toString(boolGenericArr));

    }

    // 0, 4, 6, 5, 6, 8

    public static void reverseIntArray(int[] arr){
        int i = 0;
        int j = arr.length-1;
        while (i<j){
            int store = arr[i];
            arr[i] = arr[j];
            arr[j] = store;
            i++;
            j--;
        }
    }//END reverseArray

    //can work with any Generic type
    public static <T> void reverseAnyArray(T[] arr){
        int i = 0;
        int j = arr.length-1;
        while (i < j){
            T store = arr[i];
            arr[i] = arr[j];
            arr[j] = store;
            i++;
            j--;
        }
    }

}
