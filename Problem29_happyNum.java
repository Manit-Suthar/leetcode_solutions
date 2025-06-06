package p29;
import java.util.ArrayList;
import java.util.List;
class Solution {
    public boolean isHappy(int n) { 
        List<Integer> l = new ArrayList<>();

        int sum = 0;
        do{
            System.out.println("in while");
            sum = 0;
            while(n>0){
                int num = n % 10;
                sum = sum + (num*num);
                n /= 10;
                
            }
            if(l.contains(sum) == true){
                break;
            }
            l.add(sum);
            System.out.println(l);
            n = sum;
            
        }
        while(sum != 1); 

        if(sum == 1){
            return true;
        }
        else{
            return false;
        }
    }
}
public class Problem29_happyNum {
    public static void main(String[] args) {
        Solution obj = new Solution();
        boolean ans = obj.isHappy(2);
        System.out.println(ans);
    }   
}
