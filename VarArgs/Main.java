package dev.cooley;

public class Main {
    public static void main(String... args) {
        System.out.println("Hello World");

        String[] myText = "My name is Harrison".split(" ");
        printStrings(myText);

        System.out.println("_".repeat(20));
        printStrings("Hello");

        System.out.println("_".repeat(20));
        printStrings("Hello", "my", "name", "is", "Dracula");

        //Can join an array of Strings into one string
        String[] sArray = {"I", "am", "your", "bell", "boy"};
        System.out.println(String.join(" ", sArray));
    }

    //Using the ... notation can accept zero, one, or many of whatever type you pass
    private static void printStrings(String... text){
        for (String t: text){
            System.out.println(t);
        }
    }
}
