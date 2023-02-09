package com.cooley;

public class Main {
    public static void main(String[] args) {
        ExampleClass one = new ExampleClass("One");
        ExampleClass two = new ExampleClass("Two");
        ExampleClass three = new ExampleClass("Three");

        System.out.println(one.getInstanceNumber());
        System.out.println(two.getInstanceNumber());
        System.out.println(three.getInstanceNumber());

        int pswrd = 123456;
        Password storePass = new Password(pswrd);
        //Password storePass = new ExtendedPassword(pswrd);
        storePass.storePassword();

        storePass.logIn(123);
        storePass.logIn(4);
        storePass.logIn(123456);


        //Testing Static Initialization Block
        System.out.println("Main method called");
        SIBTest test = new SIBTest();
        test.someMethod();
        System.out.println("Owner is " + SIBTest.owner);

    }
}
