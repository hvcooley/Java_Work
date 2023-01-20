public class FunWithStrings {
    public String reverseString(String s){
        if (s.length() == 0) {
            System.out.println("The string given to be reversed is empty");
        }

        int left = 0;
        int right = s.length()-1;

        StringBuilder newString = new StringBuilder(s);

        //System.out.println("The string builder is " + newString);

        while (left < right){
            char swapChar = newString.charAt(left);
            newString.setCharAt(left, s.charAt(right));
            newString.setCharAt(right, swapChar);
            left++;
            right--;
        }

        //System.out.println("The string builder after reversal is " + newString);

        return newString.toString();
    }
}
