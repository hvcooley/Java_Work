package dev.cooley;

public class Main {

    public static void main(String[] args) {
        Printer myPrinter = new Printer(55,true);
        System.out.println("Printed " + myPrinter.printPages(10) + " pages with input 10 and duplex true.");
    }
}
