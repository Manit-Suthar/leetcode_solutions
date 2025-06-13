package p36;

class Solution {
    public int lengthOfLastWord(String s) {
        int len = 0,i = s.length()-1;
        while(i>-1 && s.charAt(i) == ' '){
            i--;
        }
        while(i>-1 && s.charAt(i) != ' '){
            len++;
            i--;
        }
        return len;
    }
}
    
public class Problem36_lengthOfLastWord {
    public static void main(String[] args) {
        Solution obj = new Solution();
        String str = "ms abd   ";
        int ans = obj.lengthOfLastWord(str);
        System.out.println(ans);
    }
}
