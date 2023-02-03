package dev.cooley;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        //LinkedList<String> list = new LinkedList<>();
        var list = new LinkedList<String>();
        addMoreElements(list);
        System.out.println(list);

        testIterator(list);
    }

    //an iterators position is IN BETWEEN elements!!!
    private static void testIterator(LinkedList<String> list){
        //var iterator = list.iterator();

        var iterator = list.listIterator();
        while (iterator.hasNext()){
            //System.out.println(iterator.next());

            //this statement both moves the iterator forward and checks that value
            if (iterator.next().equals("Brisbane")){
                //must call remove on iterator
                //iterator.remove();

                iterator.add("Lake Wivenhoe");
            }
        }

        System.out.println(list);

        //Once iterator reaches end of list, to get back to front need to either start new iterator reset
        // iterator variable

        //Can traverse backwards
        while (iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }

        System.out.println(list);

        //To place an iterator after a specific index in list:
        var iterator2 = list.listIterator(3);
        System.out.println(iterator2.next());
        System.out.println(iterator2.previous());
    }

    private static void gettingElements(LinkedList<String> list) {

        System.out.println("Retrieved Element = " + list.get(4));

        System.out.println("First Element = " + list.getFirst());
        System.out.println("Last Element = " + list.getLast());

        System.out.println("Darwin is at position: " + list.indexOf("Darwin"));
        System.out.println("Melbourne is at position: " +
                list.lastIndexOf("Melbourne"));
        // Queue retrieval method
        System.out.println("Element from element() = " + list.element());
        // Stack retrieval methods
        System.out.println("Element from peek() = " + list.peek());
        System.out.println("Element from peekFirst() = " + list.peekFirst());
        System.out.println("Element from peekLast() = " + list.peekLast());
    }

    public static void printItinerary(LinkedList<String> list) {

        System.out.println("Trip starts at " + list.getFirst());
        for (int i = 1; i < list.size(); i++) {
            System.out.println("--> From: " + list.get(i - 1) + " to " + list.get(i));
        }
        System.out.println("Trip ends at " + list.getLast());
    }

    public static void printItinerary2(LinkedList<String> list) {

        System.out.println("Trip starts at " + list.getFirst());
        String previousTown = list.getFirst();
        for (String town : list) {
            System.out.println("--> From: " + previousTown + " to " + town);
            previousTown = town;
        }

        System.out.println("Trip ends at " + list.getLast());
    }

    private static void addMoreElements(LinkedList<String> list) {

        list.addFirst("Darwin");
        list.addLast("Hobart");
        // Queue methods
        list.offer("Melbourne"); //Offer puts element at end
        list.offerFirst("Brisbane"); //offFirst puts element at the beginning
        list.offerLast("Toowoomba"); // offerLast puts the element at end too
        // Stack Methods
        list.push("Alice Springs"); //follows LIFO structure, puts at head

    }

    private static void removeElements(LinkedList<String> list) {

        list.remove(4);
        list.remove("Brisbane");

        System.out.println(list);
        String s1 = list.remove(); // removes first element
        System.out.println(s1 + " was removed");

        String s2 = list.removeFirst(); // removes first element
        System.out.println(s2 + " was removed");

        String s3 = list.removeLast(); // removes last element
        System.out.println(s3 + " was removed");
        // Queue/Deque poll methods
        String p1 = list.poll();  // removes first element
        System.out.println(p1 + " was removed");
        String p2 = list.pollFirst();  // removes first element
        System.out.println(p2 + " was removed");
        String p3 = list.pollLast();  // removes last element
        System.out.println(p3 + " was removed");

        list.push("Sydney");
        list.push("Brisbane");
        list.push("Canberra");
        System.out.println(list);

        String p4 = list.pop();  // removes first element
        System.out.println(p4 + " was removed");
    }

}
