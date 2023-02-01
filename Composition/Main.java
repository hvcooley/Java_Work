package dev.cooley;

public class Main {

    //Composition is creating objects within objects where there is one master object.
    // Usually best practice is to use composition before inheritance bc:
    // - more flexible
    // - provides functional reuse outside the class hierarchy. Classes can share atributes and behavior
    //   by inheriting similar components
    // - Java's inheritance breaks encapsultion

    //Inheritance is less flexible because:
    // - Adding/removing classes affects class hierarchy and can affect subclasses
    // - New subclass may not need all functionality of the parent
    public static void main(String[] args) {
        ComputerCase theCase = new ComputerCase("2208", "Dell", "240");
        Monitor theMonitor = new Monitor("27-inch beast", "Acer", 27, "2540 x 1440");
        Motherboard theMotherBoard = new Motherboard("BJ-200", "Asus", 4,6,"v2.44");

        PersonalComputer myComputer = new PersonalComputer("2208", "Dell", theCase, theMotherBoard, theMonitor);

        //Use the parts of the computer by calling getter methods, this is not best practice though usually
//        myComputer.getMonitor().drawPixel(10, 10, "red");
//        myComputer.getMotherboard().loadProgram("Windows OS");
//        myComputer.getComputerCase().pressPowerButton();

        //Instead have those parts encapsulated by the overarching object
        myComputer.powerUp();


    }
}
