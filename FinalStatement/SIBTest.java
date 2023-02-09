package com.cooley;

public class SIBTest {
    public static final String owner;

    static {
        owner = "Harrison";
        System.out.println("Inside first static initilization block");
    }

    public SIBTest(){
        System.out.println("SIB constructor called");
    }

    static {
        System.out.println("Second static initilization block called");
    }

    public void someMethod(){
        System.out.println("Some method called");
    }
}
