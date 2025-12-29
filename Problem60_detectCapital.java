package p60;
class Solution {
    public boolean detectCapitalUse(String word) {
        String up = word.toUpperCase();
        String low = word.toLowerCase();
        char[] c = word.toCharArray();
        if(String.valueOf(up)==String.valueOf(word)){
            return true;
        }
        else if(String.valueOf(low)==String.valueOf(word)){
            return true;
        }
        else if((int) c[0] >= 65 && (int) c[0] <=90){
            for (int i = 1;i<word.length();i++) {
                if((int)c[i]<97){
                    return false;
                }
            }
            return true;
        }
        
        return false;
    }
}

public class Problem60_detectCapital {
    public static void main(String[] args) {
        Solution obj = new Solution();
        String s = "LeetCode";
        boolean ans = obj.detectCapitalUse(s);
        System.out.println(ans);
    }
}
/*      MOST OPTIMIZED SOLUTION

class Solution {
    public boolean detectCapitalUse(String word) {
        int n = word.length();
        if (n == 1) {
            return true; // Single letter is always correct
        }

        // Check if all letters from second onward are uppercase
        boolean allUpper = true;
        boolean allLower = true;

        for (int i = 1; i < n; i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                allLower = false;
            } else {
                allUpper = false;
            }
        }

        // Case 1: All letters are uppercase
        if (Character.isUpperCase(word.charAt(0)) && allUpper) {
            return true;
        }
        // Case 2: All letters are lowercase
        if (Character.isLowerCase(word.charAt(0)) && allLower) {
            return true;
        }
        // Case 3: First is uppercase, rest all lowercase
        if (Character.isUpperCase(word.charAt(0)) && allLower) {
            return true;
        }
        // Other cases: incorrect
        return false;
    }
}
 */