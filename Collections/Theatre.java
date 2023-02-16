package com.cooley;

import java.util.*;

public class Theatre {
    private final String theaterName;

    //By Using the general List class can change the type of list and it still will work.
    //private List<Seat> seats = new LinkedList<Seat>();
    private List<Seat> seats = new ArrayList<Seat>();

    //Can be even more general and use the Collection class to use other types of collections like hash set

    //hash set will lead to the list not being sorted when iterating through it
    //private Collection<Seat> seats = new HashSet<Seat>();

    //Can use a linked hash set to have sorted structure
    //private Collection<Seat> seats = new HashSet<Seat>();

    //Can use all collections interchangeably that are on same hierarchy level.
    //So for our example cannot use trees

    static final Comparator<Seat> PRICE_ORDER;
    //an example of static initialization
    static {
        PRICE_ORDER = new Comparator<Seat>() {
            @Override
            public int compare(Seat seat1, Seat seat2) {
                if (seat1.getPrice() < seat2.getPrice()) {
                    return -1;
                } else if (seat1.getPrice() > seat2.getPrice()) {
                    return 1;
                } else {
                    return 0;
                    //This comparator actually will pose problems for comparisons of seats, bc
                    // two seats with the same price will be defined as equal.
                    // INCONSISTENT WITH EQUALS --> will give problems in map interface
                }
            }
        };
    }

    public Theatre(String theaterName, int numRows, int seatsPerRow){
        this.theaterName = theaterName;
        //int value of char A is 64
        int lastRow = 'A' + (numRows - 1);
        System.out.println("The last row is " + lastRow);

        for (char row = 'A'; row <= lastRow; row++){
            for (int seatNum = 1; seatNum <= seatsPerRow; seatNum++){
                double price = 12.00;

                //Premium price for front rows
                if (row < 'D' && (seatNum >= 4 && seatNum <= 7)){
                    price = 14.00;
                }
                else if (row > 'F' || (seatNum < 4 || seatNum > 7)){
                    price = 7.00;
                }

                seats.add(new Seat(row + String.format("%02d", seatNum), price));
            }
        }
    }//END constructor

    public String getTheaterName() {
        return theaterName;
    }

    public boolean reserveSeat(String seatNumber){

        //Binary Search written out, to search through seats list
//        Seat seatRequest = new Seat(seatNumber, 0);
//        int low = 0;
//        int high = seats.size()-1;
//
//        while (low <= high){
//            //System.out.print(".");
//            int mid = (low+high)/2;
//            int cmp = seats.get(mid).compareTo(seatRequest);
//
//            //These statements also work, but they are using the String class compareTo(), not the overriden
//            // compareTo() for the Seat class
//            //Seat midVal = seats.get(mid);
//            //int cmp = midVal.getSeatNumber().compareTo(seatNumber);
//
//            if (cmp < 0){
//                low = mid+1;
//            }
//            else if (cmp > 0){
//                high = mid -1;
//            }
//            else{
//                return seats.get(mid).reserve();
//            }
//        }//END while
//        System.out.println("Seat " + seatNumber + " was not found");
//        return false;

        //Binary search using Java's collections
        Seat seatRequest = new Seat(seatNumber, 0);
        //binarySearch returns the index of the seat I want
        int foundSeat = Collections.binarySearch(seats, seatRequest, null);
        if (foundSeat >= 0){
            //now that I have the index in the list of seats I can access the seat I want and call reserve on it
            return seats.get(foundSeat).reserve();
        }
        else{
            System.out.println("There is a no seat " + seatNumber);
            return false;
        }



        //this brute force search is inefficient, can do better
//        Seat seatRequest = null;
//        for (Seat seat: seats){
//            System.out.println("Looked at a seat");
//            if (seat.getSeatNumber().equals(seatNumber)){
//                seatRequest = seat;
//                break;
//            }
//        }
//        if (seatRequest == null){
//            System.out.println("Seat not found");
//            return false;
//        }
//        return seatRequest.reserve();

    }//END reserveSeat

    public void printSeats(){
        for (Seat seat: seats){
            System.out.print(" " + seat.getSeatNumber());
        }
    }

    public Collection<Seat> getSeats(){
        return seats;
    }

    public int getNumSeats(){
        return seats.size();
    }

    public List<Seat> returnSeatsCopy(){
        ArrayList<Seat> seatsCopy = new ArrayList<>(seats.size());
        seatsCopy.addAll(seats);
        return seatsCopy;
    }


    //For best practices should have kept this class private, but tutorial does this for demonstration of collection
    // methods.
    //private class Seat implements Comparable<Seat>{
    public class Seat implements Comparable<Seat>{
        private final String seatNumber;
        private boolean reserved = false;
        private double price;

        public Seat(String seatNumber, double price){
            this.seatNumber = seatNumber;
            this.price = price;
        }

        public boolean reserve(){
            if (!this.reserved){
                this.reserved = true;
                System.out.println("Seat number " + seatNumber + " is now reserved");
                return true;
            }
            else{
                System.out.println("Sorry, seat " + seatNumber + " is already reserved");
                return false;
            }
        }

        public boolean cancel(){
            if (this.reserved){
                System.out.println("Seat reservation " + seatNumber + " is cancelled");
                this.reserved = false;
                return true;
            }
            else{
                System.out.println("Seat " + seatNumber + " was never reserved");
                return false;
            }
        }

        public String getSeatNumber(){
            return seatNumber;
        }

        public double getPrice(){
            return price;
        }

        @Override
        public int compareTo(Seat seat) {
            //recall seatNumber is a string and compareToIgnoreCase is a string comparison method
            //compareToIgnoreCase returns 0 if the two strings are the same,
            // < 0 if the string has less characters or characters with lower unicode values
            // > 0 if the string has more characters or characters with high unicode values
            return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());

            //The above structure is what the compareTo method in comparable conforms to
        }
    }

}//END class theatre


