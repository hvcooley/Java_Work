package com.cooley;

import java.util.*;

public class Main {
    private static Map<Integer, Location> locations = new HashMap<Integer, Location>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        locations.put(0, new Location(0, "Sitting in front of computer learning java"));
        locations.put(1, new Location(1, "At the end of a road before the woods"));
        locations.put(2, new Location(2, "On a secluded street in a regal wood"));
        locations.put(3, new Location(3, "In the city living among the skyscrapers"));
        locations.put(4, new Location(4, "In a sunny-swamp where I went to college"));
        locations.put(5, new Location(5, "In a winter-wonderland"));

        locations.get(1).addExit("W", 2);
        locations.get(1).addExit("E", 3);
        locations.get(1).addExit("S", 4);
        locations.get(1).addExit("N", 5);
        //locations.get(1).addExit("Q", 0);

        locations.get(2).addExit("W", 1);
        locations.get(2).addExit("S", 4);
        locations.get(2).addExit("N", 5);
        //locations.get(2).addExit("Q", 0);

        locations.get(3).addExit("W", 1);
        //locations.get(3).addExit("Q", 0);

        locations.get(4).addExit("N", 1);
        locations.get(4).addExit("W", 2);
        //locations.get(4).addExit("Q", 0);

        locations.get(5).addExit("W", 2);
        //locations.get(5).addExit("Q", 0);


        int loc = 1;
        while (true){
            System.out.println();
            System.out.println(locations.get(loc).getDescription());
            if (loc ==0){
                break;
            }

            //get the exits of the current location
            // (in the Map locations, the val holds another Map of exit key-vals, keys are direction, val is new loc)
            Map<String, Integer> exits = locations.get(loc).getExits();
            System.out.println("\nAvailable directions to exit are:");
            for (String dir: exits.keySet()){
                System.out.println(dir);
            }

            System.out.println("\nEnter direction instructions:");

            //User's input
            String userInput = scanner.nextLine();
            //Variable program will store direction, which it can use properly
            String parsedDirec = null;

            //Options
            String[] options = {"NORTH", "SOUTH", "EAST", "WEST", "QUIT"};

            //Naive solution that assumes the direction is given as the last word in the string
            //parse direction into the singular character of either N,S,E,W, or Q
            //String[] splitString = direction.toLowerCase().split(" ");
            //System.out.println("The split string is " + Arrays.toString(splitString));
            //String lastWord = splitString[splitString.length-1];
            //String parsedDirec = lastWord.substring(0,1).toUpperCase();
            //System.out.println("The parsed direction is " + parsedDirec);

            //First check if it is a single letter command
            if (userInput.length() == 1){
                //make it uppercase and call it a day
                parsedDirec = userInput.toUpperCase();
            }
            else{
                //If not make a Map of all the strings

                //First split string
                String[] splitString = userInput.toUpperCase().split(" ");
                //System.out.println("The split string is " + Arrays.toString(splitString));

                Map<String, Boolean> words = new HashMap<String, Boolean>();
                for (String word: splitString){
                    words.put(word,true);
                }

                
                int count = 0;
                String direction = null;
                //Then check for presence of North, West, South, East, or Quit

//                for (Directions dir: Directions.values()){
//                    System.out.println("Looking at enum value " + dir);
//                    if (words.containsKey(dir)){
//                        System.out.println("The map contains the key " + dir);
//                        count += 1;
//                        direction = String.valueOf(dir);
//                    }
//                }

                //In this method I check every option of direction against the HashMap which has all of
                // the user's entered words. I count to make sure there is only one direction entered
                for (String dir: options){
                    //System.out.println("Looking at string value " + dir);
                    if (words.containsKey(dir)){
                        //System.out.println("The map contains the key " + dir);
                        count += 1;
                        direction = String.valueOf(dir);
                    }
                }
                //Could have done a slightly simpler/more effective approach by making a hard coded HashMap of all
                // the directions and then looping through every word entered by the user to check against the HashMap
                //This could also implement a count feature so that I go through every word and keep a count of
                // direction given and prevent any actino being taken if more than one direction is given

                //If multiple directions given, say can only choose one direction
                if (count < 1){
                    System.out.println("Was not able to understand your directions");
                }
                else if (count > 1){
                    System.out.println("Please only enter one direction");
                }
                else{
                    //if only one pass it to the parsedDirec
                    parsedDirec = direction.substring(0,1);
                }

            }

            //For program output could use a map for letter to direction
//            Map<String, String> letterToDir = new HashMap<String, String>();
//            letterToDir.put("E", "East");
//            letterToDir.put("W", "West");
//            letterToDir.put("N", "North");
//            letterToDir.put("S", "South");
//            letterToDir.put("Q", "Quit");


            if (exits.containsKey(parsedDirec)){
                //System.out.println("Going in the " + letterToDir.get(parsedDirec) + " direction");

                //Internally the switch statement type casts strings into hashcodes for lookup

                //The performance of the switch and hashtable generally might not be that different.
                //The switch will convert into direct lookup tables, and if using integers uses those values

                //Switch statement is better for readability of code with only a few options.
                //It would be impractical to use a switch statement for many options and hard code those in
                //Instead in that case a HashMap would be the best way to go
                switch (Objects.requireNonNull(parsedDirec)) {
                    case "E" -> System.out.println("Going East...");
                    case "W" -> System.out.println("Going West...");
                    case "N" -> System.out.println("Going North");
                    case "S" -> System.out.println("Going South");
                    case "Q" -> System.out.println("Quitting");
                    default -> System.out.println("No valid action taken");
                }
                loc = exits.get(parsedDirec);
            }
            else{
                System.out.println("You cannot go in that direction");
            }
        }

    }
}
