package dev.cooley;

public class Main {
    public static void main(String[] args) {
        String birthdate = "25/11/1982";

        //.indexOf function
        int startingIndex = birthdate.indexOf("1982" );
        System.out.println("Starting index is " + startingIndex);

        //.substring function
        System.out.println("Birth year = " + birthdate.substring(startingIndex));

        //.substring with end index (exclusive)
        System.out.println("Birth month = " + birthdate.substring(3,5));

        //.join method
        String newDate = String.join("/", "25", "11", "1982");
        System.out.println("The newDate is " + newDate);

        //Below methods all create new strings for every addition to the string. Even the code in one line

        //.concat method
        // much less efficient in this example
        newDate = "25";
        newDate = newDate.concat("/");
        newDate = newDate.concat("11");
        newDate = newDate.concat("/");
        newDate = newDate.concat("1982");
        System.out.println("The new date is " + newDate);

        newDate = "25" + "/" + "11" + "/" + "1982";
        System.out.println("The new date is " + newDate);

        newDate = "25".concat("/").concat("11").concat("/").concat("1982");
        System.out.println("New date = " + newDate);


        //.replace can take chars or strings as the argument
        System.out.println("New date is " + newDate.replace('/', '-'));
        System.out.println("New date is " + newDate.replace("2", "00"));

        System.out.println("New date is " + newDate.replaceFirst("/", "-"));
        System.out.println("New date is " + newDate.replaceAll("/", "---"));

        //.repeat function
        System.out.println("ABC\n".repeat(3));
        System.out.println("-".repeat(20));

        //.indent method
        System.out.println("ABC\n".repeat(3).indent(8));
        System.out.println("-".repeat(20));

        //.indent with a negative number parameter
        System.out.println("     ABC\n".repeat(3).indent(-2));
        System.out.println("-".repeat(20));


    }
}
