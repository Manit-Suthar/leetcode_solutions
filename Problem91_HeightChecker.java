package p91;

import java.util.Arrays;

class Solution {
    public int heightChecker(int[] heights) {
        int[] checkArr = new int[heights.length];
        int count = 0 ; 
        for(int i = 0 ; i<heights.length;i++){
            checkArr[i] = heights[i];
        }
        Arrays.sort(heights);
        for(int m = 0 ; m<heights.length;m++){
            if(checkArr[m]!=heights[m]){
                count++;
            } 
        }
        return count;
    }
}
public class Problem91_HeightChecker {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] arr = {5,4,3,2,1};
        int ans = obj.heightChecker(arr);
        System.out.println(ans);
    }
}
