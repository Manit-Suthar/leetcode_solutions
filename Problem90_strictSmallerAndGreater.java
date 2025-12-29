package p90;

class Solution {
    public int countElements(int[] nums) {
        if (nums.length < 3) return 0;

        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num < min) min = num;
            if (num > max) max = num;
        }

        int countMin = 0, countMax = 0;
        for (int num : nums) {
            if (num == min) countMin++;
            if (num == max) countMax++;
        }

        if (min == max) return 0;
        return nums.length - countMin - countMax;   
    }
}

public class Problem90_strictSmallerAndGreater {
    public static void main(String[] args) {
        Solution  obj = new Solution();
        int[] nums = {11,7,2,15};
        int ans = obj.countElements(nums);
        System.out.println(ans);
    }
}
