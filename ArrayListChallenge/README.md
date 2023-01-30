
This is a challenge to create an interactive console program in Java that creates a grocery list. Features:
- The user can add items to the grocery list and remove them via typing to console in a comma delimited list
- The grocery list is stored as an ArrayList in the GroceryList class
- Program converts comma delimited list to a string, then splits the string by the location of commas and makes an ArrayList
- Program removes whitesapces before or after each grocery item, but not within one item ex) mac and cheese -> mac and cheese
- The GroceryList class checks that duplicates are not entered by maintaing a hash map
- GroceryList class keeps the list in sorted order with ArrayList .sort() function
- The main function validates menu input selection and prompts the user to re-enter if incorrect option is given
