package p71;
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        for(int i = 1 ; i<=s.length()/2;i++){
            if(s.length()%i==0){
                String pattern = s.substring(0, i);
                StringBuilder sb = new StringBuilder();
                for(int j=0;j<(s.length()/i);j++){
                    sb.append(pattern);
                }
                if(sb.toString().equals(s)) return true;
            }
        }
        return false;
    }
}
public class Problem71_repeatedSubStringPattern {
    public static void main(String[] args) {
        Solution obj = new Solution();
        String s = "abcdabcd";
        boolean ans = obj.repeatedSubstringPattern(s);
        System.out.println(ans);
    }   
}
