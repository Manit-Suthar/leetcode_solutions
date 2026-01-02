package p117;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int repeatedNTimes(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return num;
            }
            seen.add(num);
        }
        return -1; // This line should never be reached given the problem constraints
     } 
}
public class Problem117_nRepeatedElementsInSize2nArray {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] nums = {5,1,5,2,5,3,5,4};
        int result = obj.repeatedNTimes(nums);
        System.out.println(result);
    }
}
