package com.cooley;

public class StaticTest {

    //Static fields are associated with the class rather than any particular instance of it.
    private static int numInstances = 0;
    private String name;

    public StaticTest(String name){
        this.name = name;
        numInstances++;
    }

    //It is better practice to have a function that returns/uses a static field to also be static
    public static int getNumInstances() {
        return numInstances;
    }

    public String getName() {
        return name;
    }
}
