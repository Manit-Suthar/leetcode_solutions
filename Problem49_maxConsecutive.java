package p49;
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int current_max = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]!= 0){
                current_max++;
                max = Math.max(current_max, max);
            }
            else{
                current_max = 0;
            }
        }
        return max;
    }
}
public class Problem49_maxConsecutive {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] arr= {0,1,0,1,1,1,0,1};
        int ans = obj.findMaxConsecutiveOnes(arr);
        System.out.println(ans);
    }
}
