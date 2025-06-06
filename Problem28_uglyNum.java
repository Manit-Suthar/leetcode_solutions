package p28;
class Solution {
    public boolean isUgly(int n) {
        if(n<=0){
            return false;
        }
        else {
            while(n % 2 == 0 ){
                n /=2;
            }
            while(n % 3 == 0){
                n /=3;
            }
            while(n % 5 == 0){
                n /=5;
            }
            
        }
        if(n == 1)
            {return true;}
        else
            {return false;}
    }
}

public class Problem28_uglyNum {
    public static void main(String[] args) {
        Solution obj = new Solution();
        boolean ans = obj.isUgly(15);
        System.out.println(ans);
    }
}
