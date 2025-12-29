package p64;
class Solution {
    public String longestCommonPrefix(String[] strs) {
        for(int i = 0; i<strs[0].length();i++){
            char c = strs[0].charAt(i);
            for(int j = 1;j<strs.length;j++){
                if(i==strs[j].length() ||c != strs[j].charAt(i) ){
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }
}
public class Problem64_longestCommonPreFix {
    public static void main(String[] args) {
        Solution obj = new Solution();
        String[] arr = {"flight","flies","fliover"};
        String ans = obj.longestCommonPrefix(arr);
        System.out.println(ans);
    }
}
