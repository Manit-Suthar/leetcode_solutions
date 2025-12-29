package p69;

import java.util.Arrays;

class Solution {
    public boolean isGood(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        // Step 1: The largest number must be n - 1 and must appear twice                   //O(n) no sorting
        if (nums[n - 1] != n - 1 || nums[n - 2] != n - 1) {
            return false;
        }
        // Step 2: Check that all elements from 1 to n - 2 appear exactly once
        for (int i = 0; i < n - 2; i++) {
            if (nums[i] != i + 1) {
                return false;
            }
        }
        return true;
    }
}

/* SORTING BASED O(n long n)
 * class Solution {
    public boolean isGood(int[] nums) {
        int n = nums.length;
        int[] freq = new int[n]; // values should be from 1 to n-1

        for (int num : nums) {
            if (num >= n) return false; // no number should be >= n
            freq[num]++;
        }

        for (int i = 1; i < n - 1; i++) {
            if (freq[i] != 1) return false; // 1 to n-2 must appear once
        }

        return freq[n - 1] == 2; // n - 1 must appear exactly twice
    }
}

 */

public class Problem69_checkIfArrayIsGood {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] nums = { 3, 3, 1 };
        boolean ans = obj.isGood(nums);
        System.out.println(ans);
    }
}
