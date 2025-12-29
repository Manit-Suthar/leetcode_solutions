package p63;
class Solution {
    public boolean isSubsequence(String s, String t) {
        int i,j=0;
        StringBuilder sb = new StringBuilder();
        for(i = 0;i<s.length();i++){
            for(;j<t.length();j++){
                if(s.charAt(i) == t.charAt(j)){ 
                    sb.append(t.charAt(j));
                    j++;
                    break;
                }
            }
        }
        return s.equals(sb.toString());
    }
}
public class Problem63_isSubsequence {
    public static void main(String[] args) {
        Solution obj = new Solution();
        String s = "abc";
        String t = "ambmc";
        boolean ans = obj.isSubsequence(s, t);
        System.out.println(ans);
    }
}
