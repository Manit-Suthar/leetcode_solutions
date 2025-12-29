package p47;
import java.util.HashSet;
class Solution {
    public int majorityElement(int[] nums) {
        HashSet<Integer> h = new HashSet<>();
        int max = nums[0];
        for(int i = 0;i<nums.length;i++){
            h.add(nums[i]);
        }
        System.out.println(h);
        return max;
    }
}
public class Problem47_majorElement {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] nums = {4,1,2,3,2,2,2};
        int ans = obj.majorityElement(nums);
        System.out.println(ans);
    }

}
