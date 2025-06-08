package p32;
class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<=0){
            return false;
        }
        if(n==1){
            return true;
        }
        while(n%3==0){
                n = n/3;
        }
        return n==1;
    }
}
public class Problem32_powerOf3 {
    public static void main(String[] args) {
        Solution obj = new Solution();
        boolean ans = obj.isPowerOfThree(24);
        System.out.println(ans);
    }
}
