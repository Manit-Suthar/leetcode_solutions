package p61;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> l = new ArrayList<>();
        int i = 1;
        while(i<=n){
            if(i%3 == 0 && i%5 == 0){
                l.add("FizzBuzz");
                i++;
            }
            else if(i%3==0){
                l.add("Fizz");
                i++;
            }
            else if(i%5 == 0){
                l.add("Buzz");
                i++;
            }
            else{
                l.add(i+"");
                i++;
            }
        }
        return l;
    }
}
public class Problem61_FizzBuzz {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int n = 15;
        List<String> ans = obj.fizzBuzz(n);
        for(int i = 0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
    }    
}
