package dev.cooley;

public class Main {
    public static void main(String[] args) {

        String helloWorld = "Hello World";
        helloWorld = helloWorld.concat(" and goodbye");

        //Below statement will not work, string builders cannot be assigned a string literal
        //StringBuilder helloWorldBuilder = "Hello" + "World";

        //But StringBuilders can be passed a string literal as a constructor
        StringBuilder helloWorldBuilder = new StringBuilder("Hello" + " World");

        //StringBuilder .append method
        helloWorldBuilder.append(" and goodbye");

        printInformation(helloWorld);
        printInformation(helloWorldBuilder);

        //the capacity of the StringBuilder grows as the string grows and exceeds old capacities

        StringBuilder emptyStart1 = new StringBuilder();
        emptyStart1.append("a".repeat(17));
        StringBuilder emptyStart2 = new StringBuilder(20);
        emptyStart2.append("a".repeat(17));

        printInformation(emptyStart1);
        printInformation(emptyStart2);

        //New StringBuilder to show unique StringBuilder methods
        StringBuilder builderPlus = new StringBuilder("Hello" + " World");
        builderPlus.append(" and Goodbye");

        //.deleteChatAt() and .insert()
        builderPlus.deleteCharAt(16).insert(16, 'g');
        System.out.println(builderPlus);

        //.replace, which regular String also has but works differently
        builderPlus.replace(16, 17, "G");
        System.out.println(builderPlus);

        //.reverse and .setLength
        builderPlus.reverse().setLength(7);
        System.out.println(builderPlus);

    }

    public static void printInformation(String string){
        System.out.println("String = " + string);
        System.out.println("Length = " + string.length());
    }

    public static void printInformation(StringBuilder builder){
        System.out.println("String = " + builder);
        System.out.println("Length = " + builder.length());
        System.out.println("Capacity = " + builder.capacity());
    }

}
