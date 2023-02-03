package dev.cooley;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Integer boxedInt = Integer.valueOf(15);   //preferred but unecessary
        Integer deprecatedBoxing = new Integer(15); //deprecated since JDK 19
        int manualUnbox = boxedInt.intValue();

        //Automatic boxing.unboxing
        Integer autoboxed = 15;
        int unboxed = autoboxed;

        System.out.println(autoboxed.getClass().getName());
        //System.out.println(unboxed.getClass().getName());   won't work bc int is a primitive type, so no class

        Double resultBoxed = getLiteralDoublePrimitive();
        double resultUnboxed = getDoubleObject();

        Integer[] wrapperArray = new Integer[5];
        wrapperArray[0] = 50;
        System.out.println(Arrays.toString(wrapperArray));
        //prints [50, null, null, null, null]
        // the default value for Integer is null

        //Confirms that the first element is the wrapper class Integer
        System.out.println(wrapperArray[0].getClass().getName());


        //JVM autoboxes the char literals
        Character[] characterArray = {'a', 'b', 'c', 'd'};
        System.out.println(Arrays.toString(characterArray));

        //Convert list of ints to Arraylist of Integers
        var myArrayList = getList(25,47,10,17);
        System.out.println(myArrayList);

        //remember list is unmodifiable
        var otherAList = List.of(1,2,3,4,5);
        System.out.println(otherAList);

    }

    //unboxing to put in a list, two ways. Java will autobox/unbox either way. Can essentially use int and Integer
    // interchangeably
    //private static ArrayList<Integer> getList(int... varargs){
    private static ArrayList<Integer> getList(Integer... varargs){

        ArrayList<Integer> aList = new ArrayList<>();

        for (int i: varargs){
            aList.add(i);
        }
        return aList;
    }

    //can autobox/unbox by returning from functions
    private static Integer returnInteger(int i){
        return i;
    }

    private static Integer returnInt(int i){
        return i;
    }

    private static Double getDoubleObject(){
        return Double.valueOf(100.00);
    }

    private static double getLiteralDoublePrimitive(){
        return 100.00;
    }
}
