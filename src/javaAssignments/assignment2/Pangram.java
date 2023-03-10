package javaAssignments.assignment2;

public class Pangram {

    public boolean pangram(String str){
        boolean[] present = new boolean[26];
        str = str.toLowerCase();

        for (char character : str.toCharArray()) {

            if (character >= 'a' && character <= 'z') {
                present[character - 'a'] = true;
            }
        }

        for (boolean isPresent : present) {
            if (!isPresent) {
                return false;
            }
        }
        
        return true;

        // Time complexity:

        //The function iterates over each character in the input string once, which takes O(n) time, where n is the length of the string.
        //The function also iterates over the boolean array of size 26 once, which takes O(1) time.
        // the overall time complexity of the function is O(n).

        //Space complexity:

        //The function creates a boolean array of size 26, which takes O(1) space.
        //the overall space complexity of the function is O(1).
    }
}
