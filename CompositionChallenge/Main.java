package dev.cooley;

public class Main {

    public static void main(String[] args) {
        SmartKitchen myKitchen = new SmartKitchen();

        //"Assign" tasks by calling the external functions to set doWork vars to true in the appliances
        myKitchen.addWater();
        myKitchen.pourMilk();

        //Call the doWork function which accesses each appliance and calls their respective functions
        myKitchen.doKitchenWork();

    }
}
