package p59;

class Solution {
    public int firstUniqChar(String s) {
        int[] count = new int[26];
        for(char c : s.toCharArray()){
            count[c-'a']++;
        }
        for(int i = 0 ; i<s.length();i++){
            char c = s.charAt(i);
            if(count[c-'a'] == 1){
                return i;
            }
        }
        return -1;
    }
}
public class Problem59_firstUniqueCharacterInAString {
    public static void main(String[] args) {
        Solution obj = new Solution();
        String  s = "leetcode";
        int ans = obj.firstUniqChar(s);
        System.out.println(ans);

    }
}
