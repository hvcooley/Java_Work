import java.util.HashMap;

public class countOccur {
    public Character maxChar(String input){
        if (input.length() == 0){
            System.out.print("There are no input chars, therefore no max");
            return null;
        }

        HashMap<Character, Integer> charCounts = new HashMap<Character, Integer>();
        
        Character maxCh = null;
        int maxCount = 0;

        //loop through string and count chars
        for (int i = 0; i < input.length(); i++){
            char c  = input.charAt(i);
            charCounts.put(c, charCounts.getOrDefault(c,0)+1);
            int cCount = charCounts.get(c);
            if (maxCount < cCount){
                maxCh = c;
                maxCount = cCount;
            }
        }

        return maxCh;

    }
}
