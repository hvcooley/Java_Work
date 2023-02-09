package com.cooley;

public class ExampleClass {
    private static int classCounter = 0;
    public final int instanceNumber;
    public final String name;

    public ExampleClass(String name){
        this.name = name;
        classCounter++;
        instanceNumber = classCounter;
        System.out.println(name + " is created with instance number " + instanceNumber);
    }

    public int getInstanceNumber() {
        return instanceNumber;
    }
}
