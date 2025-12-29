package p65;

// import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character,String> m = new HashMap<>();
        String[] str = s.split(" ");
        for(int j = 0;j<str.length;j++){
            System.out.println(pattern.charAt(j)+" "+str[j]);
        }
        for(int i = 0 ;i<pattern.length();i++){
            m.putIfAbsent(pattern.charAt(i), str[i]);
            if(String.valueOf(str[i])!=String.valueOf(m.get(pattern.charAt(i)))){
                System.out.println(str[i]+" "+m.get(pattern.charAt(i)));
                return false;
            }
        }
        return true;
    }
}
public class Problem65_wordPattern {
    public static void main(String[] args) {
        Solution obj = new Solution();
        String pattern = "abba";
        String word = "xy pq pq xy";
        boolean ans = obj.wordPattern(pattern, word);
        System.out.println(ans);
    }   
}
