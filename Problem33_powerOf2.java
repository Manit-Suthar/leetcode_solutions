package p33;
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<1){
            return false;
        }
        while(n%2 == 0){
            n/=2;
        }
        return n==1;
    }
}
public class Problem33_powerOf2 {
    public static void main(String[] args) {
        Solution obj = new Solution();
        boolean ans =  obj.isPowerOfTwo(20);
        System.out.println(ans);
    }    
}
