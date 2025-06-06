//package p11;
class Solution {
    public char findTheDifference(String s, String t) {
        char[] charOfS = s.toCharArray();
        char[] charOfT = t.toCharArray();
        int sumS = 0 , sumT = 0;
        for(char characterS : charOfS){
            sumS = sumS + (int) characterS;
        }
        for(char characterT : charOfT){
            sumT = sumT + (int)characterT; 
        }
        int sumDiff = sumT - sumS;
        
        return (char) sumDiff;
    }
}


public class Problem11_findTheDifference {
    public static void main(String[] args) {
        Solution obj = new Solution();
        String s = "abcdef";
        String t = "abcdef?";
        char difference = obj.findTheDifference(s,t);
        System.out.println(difference);
    }  
}
