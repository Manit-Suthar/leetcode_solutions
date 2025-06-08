package p34;
class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<1){
            return false;
        }
        while(n%4 == 0){
            n/=4;
        }
        return n ==1;
    }
}
public class Problem34_powerOf34 {
    public static void main(String[] args) {
        Solution obj = new Solution();
        boolean ans = obj.isPowerOfFour(20);
        System.out.println(ans);
    }
}
