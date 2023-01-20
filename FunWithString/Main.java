public class Main {
    public static void main(String[] args){
        System.out.print("Inside the main function. \n");


        //Testing reverse string
        String myName = "Harrison";
        System.out.println("String before reversal is: " + myName);

        FunWithStrings strFun = new FunWithStrings();
        String revString = strFun.reverseString(myName);
        System.out.println("The reversed string is " + revString);
        System.out.println("___________");


        //Testing most frequent counter
        String sequence = "abcdefga";
        System.out.println("Will now find the most frequent character in " + sequence);

        countOccur test = new countOccur();
        char res = test.maxChar("abcdefga");
        System.out.print("The most frequent character is " + res);

    }
}
