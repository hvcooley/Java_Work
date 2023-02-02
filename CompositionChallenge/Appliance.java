package dev.cooley;

public class Appliance {
    private Boolean hasWorkToDo;

    public Appliance(){
        this.hasWorkToDo = false;
    }

    public void setHasWorkToDo(Boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public Boolean getHasWorkToDo() {
        return hasWorkToDo;
    }
}

class Refrigerator extends Appliance{
    public Refrigerator(){
        super();
    }

    public void orderFood(){
        if (getHasWorkToDo() == true){
            System.out.println("Ordering food...");
            setHasWorkToDo(false);
        }
    }
}

class DishWasher extends Appliance{
    public DishWasher(){
        super();
    }

    public void doDishes(){
        if (getHasWorkToDo() == true){
            System.out.println("Doing dishes...");
            setHasWorkToDo(false);
        }
    }
}

class CoffeeMaker extends Appliance{
    public CoffeeMaker(){
        super();
    }

    public void brewCoffee(){
        if (getHasWorkToDo() == true){
            System.out.println("Brewing coffee...");
            setHasWorkToDo(false);
        }
    }
}
