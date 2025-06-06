package p24;

class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        for(int j=0;j<nums.length;j++){
            if(j == nums.length-1){
                nums[i++] = nums[j];
                continue;
            }
            if(nums[j]!=nums[j+1]){
                nums[i++] = nums[j];
            }
            
        }
        return i;
    }
}

public class Problem24_removeDuplicateFromSortedArr {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        int ans = obj.removeDuplicates(arr);
        System.out.println(ans);
    }
}
