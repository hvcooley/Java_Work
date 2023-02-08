package com.cooley;

public class Main {

    public static int multiplier = 7;
    public static void main(String[] args) {


        StaticTest firstInstance = new StaticTest("1st Instance");
        System.out.println(firstInstance.getName() + " is instance number " + firstInstance.getNumInstances());

        StaticTest secondInstance = new StaticTest("2nd Instance");
        System.out.println(secondInstance.getName() + " is instance number " + secondInstance.getNumInstances());

        //Both print instance 1 when numInstances variable defined normally, bc they are different objects

        //But by making the NumInstances a static field, it will actually keep proper track of number of instances

        //Even just generating a new instance but calling getNumInstances from a previous object will work
        StaticTest thirdInstance = new StaticTest("3rd Instance");
        System.out.println(thirdInstance.getName() + " is instance number " + secondInstance.getNumInstances());

        //When the method is also static you don't even need to instantiate an object to use it
        System.out.println(StaticTest.getNumInstances());

        //The reason the main method is static is that there is no object created yet at the start of a program.
        // So it means the first function to run the program needs to be called from the class itself

        //Run on the command line with a command like:
        // java com.cooley.Main

        //Other functions in the Main class also need the static keyword for similiar reasons. There is no
        // instance of the class created yet, so to run a function in Main, java needs to call it from the
        // Static class itself

        int answer = multiply(7);
        System.out.println("7 times the multiplier is " + answer);

        //Static method/variables are also often referred to class methods/variables

    }

    public static int multiply(int num){
        return num*multiplier;
    }


}
