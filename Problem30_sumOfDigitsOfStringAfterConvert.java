package p30;

class Solution {
    public int getLucky(String s, int k) {
        char[] c = s.toCharArray();
        for(int i = 0; i<c.length;i++){
            c[i] = '(int) c[i]'; 
        }
        System.out.println(c);
        return 0;
    }
}

public class Problem30_sumOfDigitsOfStringAfterConvert {
    public static void main(String[] args) {
        Solution obj = new Solution();
        String s = "a";
        int k = 1;
        int ans = obj.getLucky(s, k);
        System.out.println(ans);
    }
}
