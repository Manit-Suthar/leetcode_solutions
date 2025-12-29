package p92;
class Solution {
    public int findPermutationDifference(String s, String t) {
        int[] sArr = new int[26];
        int[] tArr = new int[26];
        int i = 1 , j = 1 ;
        int diff = 0 ;
        for(char c : s.toCharArray()){
            sArr[c-'a'] = i++;
        }
        for(char c : t.toCharArray()){
            tArr[c-'a'] = j++;
        }
        for(int d = 0 ; d < sArr.length ; d++){
            diff = diff + Math.abs(sArr[d]-tArr[d]);
        }
        return diff;
    }
}
public class Problem92_permutationDiffernceBetween2Strings {
    public static void main(String[] args) {
        Solution obj = new Solution();
        String s = "rwohu";
        String t = "rwuoh";
        int ans = obj.findPermutationDifference(s,t);
        System.out.println(ans);
    }
}
