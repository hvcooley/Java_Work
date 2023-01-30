package dev.cooley;

import java.util.*;

public class GroceryList {
    private ArrayList<String> groceryList;
    private HashMap<String, Boolean> hashMap;

    //could make an improvement by storing the hashmap in the class as a member variable

    public GroceryList(){
        groceryList = new ArrayList<>();
        hashMap = new HashMap<>();
    }

    protected void addItemsV2(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the grocery items to add in a comma delimetted list here: ");
        String input = scanner.nextLine();
        String trimmedInput = input.replaceAll("\\s", "");;
        //System.out.println("The trimmed input is " + trimmedInput);
        String[] inputArray = trimmedInput.split(",");
        //System.out.println("Input is " + Arrays.toString(inputArray));

        for (String element: inputArray){
            if (hashMap.containsKey(element)){
                continue;
            }
            else{
                groceryList.add(element);
                hashMap.put(element, true);
            }
        }

        //Sort in alphabetical order
        groceryList.sort(Comparator.naturalOrder());
        //System.out.println("The grocery list in sorted order is now: " + groceryList);

        System.out.println("The grocery list is: " + groceryList);
    }
    protected void removeItemsV2(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the grocery items to remove in a comma delimetted list here: ");
        String input = scanner.nextLine();
        String trimmedInput = input.replaceAll("\\s", "");;
        //System.out.println("The trimmed input is " + trimmedInput);
        String[] inputArray = trimmedInput.split(",");
        //System.out.println("Input is " + Arrays.toString(inputArray));

        for (String element: inputArray){
            if (hashMap.containsKey(element)) {
                hashMap.remove(element);
                groceryList.remove(element);
            }
        }

        groceryList.sort(Comparator.naturalOrder());
        //System.out.println("The grocery list in sorted order is now: " + groceryList);

        System.out.println("The grocery list is: " + groceryList);
    }

    protected void printItems(){
        System.out.println("The grocery list is: " + groceryList);
    }

    protected void addItems(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the grocery items to add in a comma delimetted list here: ");
        String input = scanner.nextLine();
        String trimmedInput = input.replaceAll("\\s", "");;
        //System.out.println("The trimmed input is " + trimmedInput);
        String[] inputArray = trimmedInput.split(",");
        //System.out.println("Input is " + Arrays.toString(inputArray));

        //Make array into a list, then the list can be added to the arrayList
        groceryList.addAll(List.of(inputArray));
        //System.out.println("The grocery list is now: " + groceryList);

        groceryList = removeDups(groceryList);
        //System.out.println("The grocery list with duplicates removed is " + groceryList);

        //Sort in alphabetical order

        groceryList.sort(Comparator.naturalOrder());
        //System.out.println("The grocery list in sorted order is now: " + groceryList);

        System.out.println("The grocery list is: " + groceryList);
    }
    protected void removeItems(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the grocery items to remove in a comma delimetted list here: ");
        String input = scanner.nextLine();
        String trimmedInput = input.replaceAll("\\s", "");;
        //System.out.println("The trimmed input is " + trimmedInput);
        String[] inputArray = trimmedInput.split(",");
        //System.out.println("Input is " + Arrays.toString(inputArray));

        //Make array into a list, then the list can be removed from the arrayList
        groceryList.removeAll(List.of(inputArray));
        //System.out.println("The grocery list is now: " + groceryList);

        groceryList.sort(Comparator.naturalOrder());
        //System.out.println("The grocery list in sorted order is now: " + groceryList);

        System.out.println("The grocery list is: " + groceryList);
    }

    protected <T> ArrayList<T> removeDups(ArrayList<T> list){
        ArrayList<T> newList = new ArrayList<T>();

        HashMap<T, Boolean> map = new HashMap<>();

        //Make the hashmap of all the current elements in list
        for (T element: list){
            if (map.containsKey(element)){
                continue;
            }
            else
            {
                newList.add(element);
                map.put(element, true);
            }
        }//END for

        return newList;

    }
}
