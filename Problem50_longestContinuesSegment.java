package p50;
class Solution {
    public boolean checkZeroOnes(String s) {
        int max_zero = 0;
        int current_zero = 0;
        int max_one = 0;
        int cuurent_one = 0;
        for(int i =0;i<s.length();i++){
            if(s.charAt(i) == '0'){
                current_zero++;
                max_zero = Math.max(max_zero,current_zero);
                cuurent_one = 0;
            }
            else{
               cuurent_one++;
               max_one = Math.max(max_one, cuurent_one);
               current_zero = 0;
            }
        }
        if(max_one>max_zero){
            return true;
        }
        else{
            return false;
        }
    }
}
public class Problem50_longestContinuesSegment {
    public static void main(String[] args) {
        Solution obj = new Solution();
        String s = "110100010";
        boolean ans =  obj.checkZeroOnes(s);
        System.out.println(ans);
    }
}
