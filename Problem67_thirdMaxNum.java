package p67;

import java.util.Arrays;

class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        if(nums.length<3) return nums[nums.length-1];
        int thirdmax = nums[nums.length - 1];
        int count = 1;
        for (int i = nums.length - 2; i > -1; i--) {
            if (thirdmax > nums[i]) {
                thirdmax = nums[i];
                count++;
                if(count == 3) return thirdmax;
            }
        }
        return nums[nums.length-1];
    }
}

public class Problem67_thirdMaxNum {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] nums = { 1, 2, 2, 5, 3, 5 };
        int ans = obj.thirdMax(nums);
        System.out.println(ans);
    }
}
