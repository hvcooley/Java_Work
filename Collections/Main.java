package com.cooley;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Theatre kindertoten = new Theatre("Kindertoten", 10, 10);
        //kindertoten.getSeats();

        //kindertoten.reserveSeat("E10");
        //kindertoten.reserveSeat("H11");


        //Shallow copy: Same reference to objects in memory, but separate array lists
        //Basically modifying the objects will show on both lists, but the order of the lists can be different
        List<Theatre.Seat> shallowCopy = new ArrayList<>(kindertoten.returnSeatsCopy());
        printList(shallowCopy);

        //reserve the seat on original list
        kindertoten.reserveSeat("A01");

        //trying to reserve on the shallowCopy shows that it is already reserved
        shallowCopy.get(0).reserve();

        //Demonstration of list order being independent
        //Collections.reverse(shallowCopy);
        Collections.shuffle(shallowCopy);

        System.out.println("Printing shallow copy after shuffle");
        printList(shallowCopy);

        System.out.println("Printing original list");
        kindertoten.printSeats();

        Theatre.Seat minSeat = Collections.min(shallowCopy);
        Theatre.Seat maxSeat = Collections.max(shallowCopy);

        //Even if the list has been put out of order, the min and max funcitons use the
        // comparator defined for the data type to figure out min/max
        System.out.println("The min seat is " + minSeat.getSeatNumber());
        System.out.println("The max seat is " + maxSeat.getSeatNumber());


        //Bubble sort
        bubbleSort(shallowCopy);
        System.out.println("The shallow copy re-sorted is ");
        printList(shallowCopy);

        //Collections .copy() method doesn't have many uses

        //This method requires the destination list to be as big or bigger than the original list
        // However, the destination needs to have both the capacity for that size and have that many objects in the list


        //These lines will throw an exception: source doesn't fit into destination
        //ArrayList<Theatre.Seat> newList = new ArrayList<>(kindertoten.seats.size());
        //Collections.copy(newList, kindertoten.seats);


        kindertoten.reserveSeat("G08");
        kindertoten.reserveSeat("G08");
        kindertoten.reserveSeat("Z10");

        //Testing price implementation
        List<Theatre.Seat> priceSeats = new ArrayList<>(kindertoten.getSeats());
        //Notation for inner class initialization
        priceSeats.add(kindertoten.new Seat("B00", 13.00));
        priceSeats.add(kindertoten.new Seat("A00", 13.00));
        //Sorting using a custom comparator in the second parameter
        Collections.sort(priceSeats, Theatre.PRICE_ORDER);
        //Custom comparator is stable -> won't make swaps unless it needs to. So if 2 elements even they stay put
        printList(priceSeats);


    }

    public static void printList(List<Theatre.Seat> list){
        for (Theatre.Seat s: list){
            System.out.println(" " + s.getSeatNumber() + " $" + s.getPrice());
        }
        System.out.println();
        System.out.println("========================");
    }

    //Example of bubble sort
    public static void bubbleSort(List<? extends Theatre.Seat> list){
        for (int i = 0; i < list.size()-1; i++){
            for (int j = i+1; j < list.size(); j ++){
                if (list.get(i).compareTo(list.get(j)) > 0){
                    Collections.swap(list,i,j);
                }
            }
        }
    }

}
