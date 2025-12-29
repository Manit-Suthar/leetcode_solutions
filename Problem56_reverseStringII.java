package p56;
class Solution {
    public void reverse(char[] c ,int a,int b){
        while(a<b){
            char temp = c[a];
            c[a] = c[b];
            c[b] = temp;
            a++;
            b--;
        }
        return;
    }
    public String reverseStr(String s, int k) {
        if(s.length()==1){
            return s;
        }
        char[] c = s.toCharArray();
        int i = 0;
        while(i<c.length){
            int j = Math.min(i+k-1,c.length-1);
            reverse(c, i, j);
            i = i + 2*k;
        }
        return String.valueOf(c);
    }
}
public class Problem56_reverseStringII {
    public static void main(String[] args) {
        Solution obj = new Solution();
        String s = "abcdefg";
        int k = 2;
        String ans = obj.reverseStr(s, k);
        System.out.println(ans);
    }
    
}