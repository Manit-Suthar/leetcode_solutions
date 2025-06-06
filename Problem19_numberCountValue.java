package p19;

import java.util.*;

class Solution {
    
    
    public boolean digitCount(String num) {
        Map<Integer,Integer> map1 = new HashMap<>(); //expected frequency
        Map<Integer,Integer> map2 = new HashMap<>(); //original frequency
        int[] numArray = new int[10];
        int i;
            for(char c : num.toCharArray()){
                numArray[(int)(c - '0')]++;
            }
            for(i=0;i<num.length();i++){
                map1.put(i,(int)(num.toCharArray()[i]-'0'));
            }
            //System.out.println(map1);
            for(i=0;i<numArray.length;i++){
                map2.put(i,numArray[i]);
            }
            //System.out.println(map2);
            for(int k=0;k<num.length();k++){
                if(map1.get(k)==map2.get(k)){
                    continue;
                }
                else return false;
            }
            
        return true;
    }
} 

public class Problem19_numberCountValue{
    public static void main(String[] args) {
        Solution obj = new Solution();
        String strNum = "030";
        boolean ans = obj.digitCount(strNum);
        System.out.println(ans);
    }
}