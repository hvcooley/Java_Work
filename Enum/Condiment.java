package dev.cooley;


//use a semicolon at the end of the enum to make it have class behavior and implementation abilities
// In reality enum is just a class underneath and each constant is an instance of the class
public enum Condiment {
    SWISS,
    BACON,
    BBQ,
    LETTUCE,
    TOMATO,
    MAYO;

    public double getPrice(){
        return switch(this){
            case BACON -> 1.00;
            case SWISS -> 0.25;
            case BBQ -> 0.50;
            default -> 0.00;
        };
    }

}
