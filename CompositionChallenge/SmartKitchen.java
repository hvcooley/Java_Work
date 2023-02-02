package dev.cooley;

public class SmartKitchen {
    private CoffeeMaker coffeeMaker;
    private DishWasher dishWasher;
    private Refrigerator refrigerator;

    public SmartKitchen(){
        coffeeMaker = new CoffeeMaker();
        dishWasher = new DishWasher();
        refrigerator = new Refrigerator();
    }

    //change to using getter to access each appliance
    public void addWater(){
        coffeeMaker.setHasWorkToDo(true);
    }

    public void pourMilk(){
        refrigerator.setHasWorkToDo(true);
    }

    public void loadDishWasher(){
        dishWasher.setHasWorkToDo(true);
    }

    public void doKitchenWork(){
        coffeeMaker.brewCoffee();
        refrigerator.orderFood();
        dishWasher.doDishes();
    }

    public CoffeeMaker getCoffeeMaker(){
        return coffeeMaker;
    }

    public DishWasher getDishWasher(){
        return dishWasher;
    }

    public Refrigerator getRefrigerator(){
        return refrigerator;
    }

}
