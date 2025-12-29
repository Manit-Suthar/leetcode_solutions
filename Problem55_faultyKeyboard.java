package p55;
class Solution {
    public String finalString(String s) {
        StringBuilder sb = new StringBuilder();
        int i = 0 ;
        while(i<s.length()){
            if(s.charAt(i) != 'i'){
                sb.append(s.charAt(i));
                i++;
            }
            else{
                sb = sb.reverse();
                i++;
            }
        }
        return String.valueOf(sb);
    }
}
public class Problem55_faultyKeyboard {
    public static void main(String[] args) {
        Solution obj = new Solution();
        String s = "abciid";
        String ans = obj.finalString(s);
        System.out.println(ans);
    }
}
