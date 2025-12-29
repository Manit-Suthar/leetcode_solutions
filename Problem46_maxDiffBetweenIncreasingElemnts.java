package p46;
class Solution {
    public int maximumDifference(int[] nums) {
        int maxDiff = -1;
        int minElement = nums[0];

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] > minElement) {
                maxDiff = Math.max(maxDiff, nums[j] - minElement);
            } else {
                minElement = nums[j];
            }
        }

        return maxDiff;
    }
}
public class Problem46_maxDiffBetweenIncreasingElemnts {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] arr = {10,2,5,1,20};
        int ans = obj.maximumDifference(arr);
        System.out.println(ans);
    }
}
