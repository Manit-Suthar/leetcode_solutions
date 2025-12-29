package p81;
class Solution {
    public boolean checkString(String s) {
        for(int i = 0 ; i < s.length()-1;i++){
            if(s.charAt(i)=='b' && s.charAt(i+1)=='a'){
                return false;
            }
        }
        return true;
    }
}
public class Problem81_checkAllABeforeB {
    public static void main(String[]a){
        Solution obj = new Solution();
        String s = "bbbb";
        boolean ans = obj.checkString(s);
        System.out.println(ans);
    }
}
