package dev.cooley;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        DayOfTheWeek weekDay = DayOfTheWeek.SAT;
        System.out.println(weekDay);

        //enums start with a ordinal value of 0
        System.out.printf("Name is %s, Ordinal Value = %d%n", weekDay.name(), weekDay.ordinal());

        for (int i = 0; i < 10; i++){
            //System.out.println("Random day: " + getRandomDay());

            DayOfTheWeek randDay = getRandomDay();
            System.out.printf("Name is %s, Ordinal Value = %d%n", randDay.name(), randDay.ordinal());

            if (randDay == DayOfTheWeek.FRI){
                System.out.println("Found a Friday!!!!");
            }
            switchEnumDay(randDay);

        }//END for

        //loop through all condiments and their prices

        for (Condiment c: Condiment.values()){
            System.out.printf("The condiment %s has a price of %.2f%n", c.name(), c.getPrice());
        }

    }//END main

    public static void switchEnumDay(DayOfTheWeek weekDay){
        int weekDayInteger = weekDay.ordinal()+1;
        switch(weekDay){
            case WED -> System.out.println("Wednesday is day " + weekDayInteger);
            case SAT -> System.out.println("Saturday is day " + weekDayInteger);
            case FRI -> System.out.println("Friday is day " + weekDayInteger);
            //All other days of week are the enum prefix we have + day
            default -> System.out.println(weekDay.name().charAt(0) + weekDay.name().substring(1).toLowerCase()
                    + "day is Day " + weekDayInteger);
        }
    }

    public static DayOfTheWeek getRandomDay(){
        int randomInteger = new Random().nextInt(7);
        //make an array with all options
        var allDays = DayOfTheWeek.values();

        //System.out.println("The allDays variable is " + Arrays.toString(allDays));

        return allDays[randomInteger];
    }
}
