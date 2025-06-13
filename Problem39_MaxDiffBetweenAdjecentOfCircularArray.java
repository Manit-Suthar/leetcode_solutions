package p39;


// import java.math.*;
class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int temp = 0;
        for(int i =0 ; i< nums.length;i++){
            if(i == nums.length-1){
                if(Math.abs(nums[i]-nums[0])>temp){
                    temp = Math.abs(nums[i]-nums[0]);
                }
                break;
            }
            if(Math.abs(nums[i]-nums[i+1])>temp){
                temp = Math.abs(nums[i]-nums[i+1]);
            }
            
        }
        return temp;
    }
}
public class Problem39_MaxDiffBetweenAdjecentOfCircularArray {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] nums = {3,2,-5,-3};
        int ans = obj.maxAdjacentDistance(nums);
        System.out.println(ans);
    }
}
