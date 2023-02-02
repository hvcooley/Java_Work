package dev.cooley;

public class Main {
    public static void main(String[] args) {
        //Default constructor
        Player bob = new Player();
        System.out.println(bob.toString());

        //Constructor with only name parameter
        Player leo = new Player("Leo");
        System.out.println(leo.toString());

        //Constructor with parameters
        Player harrison = new Player("Harrison", 100, "Bejeweled Staff of light");
        System.out.println(harrison.toString());

        System.out.println("Harrison's remaining health is " + harrison.healthRemaining());
    }
}
