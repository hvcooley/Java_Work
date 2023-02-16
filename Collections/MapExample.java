package com.cooley;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args){

        Map<String, String> myMap = new HashMap<>();
        myMap.put("Marchisio", "Excellent");
        myMap.put("Iniesta", "World Class");
        myMap.put("Messi", "The GOAT");
        myMap.put("Neymar", "Phony");
        myMap.put("Bale", "Rapid");

        System.out.println(myMap.get("Marchisio"));

        //keys are unique
        myMap.put("Marchisio", "My favorite player");
        System.out.println(myMap.get("Marchisio"));

        //.put() returns null if there is no previous value there
        System.out.println(myMap.put("Osihmen", "Goal-Scorer"));
        //.put() will then return previous value if there is a value present already
        System.out.println(myMap.put("Osihmen", "Rapid"));

        //.containsKey()
        if (myMap.containsKey("Marchisio")){
            System.out.println("The map contains the key Marchisio");
        }

        if (myMap.containsKey("Xavi")){
            System.out.println("Map contains Xavi");
        }
        else{
            System.out.println("Xavi not present in map");
        }

        System.out.println("===============================================================");

        //loop through and print set of keys

        for (String key: myMap.keySet()){
            System.out.println(key + ": " + myMap.get(key));
        }
        //hashMaps are not ordered

        System.out.println("===============================================================");

        //remove() method
        //returns true/false value, which is why it can be used in the if else statement

        myMap.remove("Neymar");
        if (myMap.remove("Messi", "Barcelona-Player")){
            System.out.println("Key value (Messi,Barcelona-Player) removed\n");
        }
        else{
            System.out.println("Key value (Messi,Barcelona-Player) could not be removed\n");
        }

        for (String key: myMap.keySet()){
            System.out.println(key + ": " + myMap.get(key));
        }


        //replace will return previous entry similiar to put(). But will return null and not work if no key present
        System.out.println(myMap.replace("Bale", "Finisher"));
        System.out.println(myMap.replace("Vidal", "Will not be added"));

        //replace will return a boolean if given three parameters: key, value, old value
        if (myMap.replace("Bale","Finisher", "Game-Changer")){
            System.out.println("Bale replaced");
        }
        else{
            System.out.println("Bale not replaced");
        }


    }//END main()

}
