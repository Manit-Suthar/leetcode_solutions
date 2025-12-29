package p68;

import java.util.Arrays;

class Solution {
    public int findNonMinOrMax(int[] nums) {        //O(nlogn)
        Arrays.sort(nums);
        if(nums.length<3) return -1;
        else return nums[1];
    }
}
// class Solution {
//     public int findNonMinOrMax(int[] nums) {
//         if (nums.length < 3) return -1;                      //O(n)
        
//         int a = nums[0], b = nums[1], c = nums[2];
        
//         if ((a > b && a < c) || (a < b && a > c)) return a;
//         if ((b > a && b < c) || (b < a && b > c)) return b;
//         return c;
//     }
// }

public class Problem68_NeitherMinNorMax {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] nums = {12,23,6};
        int ans = obj.findNonMinOrMax(nums);
        System.out.println(ans);
    }
}
