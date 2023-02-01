package dev.cooley;

public class Product {

    private String model;
    private String manufacturer;
    private int height;
    private int width;
    private int depth;

    public Product(String model, String manufacturer) {
        this.model = model;
        this.manufacturer = manufacturer;
    }
}

class Monitor extends Product{
    private int size;
    private String resolution;

    public Monitor(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public Monitor(String model, String manufacturer, int size, String resolution) {
        super(model, manufacturer);
        this.size = size;
        this.resolution = resolution;
    }

    public void drawPixel(int x, int y, String color){
        System.out.println(String.format("Drawing pixel at %d,%d in color %s", x,y,color));
    }

}

class Motherboard extends Product{
    private int cardSlots;
    private int ramSlots;
    private String bios;
    public Motherboard(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public Motherboard(String model, String manufacturer, int cardSlots, int ramSlots, String bios) {
        super(model, manufacturer);
        this.cardSlots = cardSlots;
        this.ramSlots = ramSlots;
        this.bios = bios;
    }

    public void loadProgram(String programName){
        System.out.println("Program " + programName + " loading...");
    }
}

class ComputerCase extends Product{

    private String powerSupply;
    public ComputerCase(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public ComputerCase(String model, String manufacturer, String powerSupply) {
        super(model, manufacturer);
        this.powerSupply = powerSupply;
    }

    public void pressPowerButton(){
        System.out.println("Power button pressed");
    }
}