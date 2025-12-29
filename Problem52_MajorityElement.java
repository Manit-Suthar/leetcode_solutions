package p52;

import java.util.Arrays;

// As max repeated element appears more than size/2 of array ...
// if we sort the array then the max repeated element must be present at size/2 index

// class Solution {
//     public int majorityElement(int[] nums) {
//         Arrays.sort(nums);
//         return nums[nums.length/2];   
//     }
// }

class Solution {
    public int majorityElement(int[] nums) {
        int max = 0;
        int current_max = 1;
        int element = 0;
        Arrays.sort(nums);

        for (int j = 0; j < nums.length - 1; j++) {
            if (nums[j] == nums[j + 1]) {
                current_max++;
                if (current_max>max) {
                    element = nums[j];
                }
                max = Math.max(current_max, max);
            } else {
                current_max = 1;
            }
        }

        return element;
    }
}

public class Problem52_MajorityElement {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] nums = { 2, 2, 2, 2, 2, 3, 3, 4 };
        int ans = obj.majorityElement(nums);
        System.out.println(ans);
    }
}
