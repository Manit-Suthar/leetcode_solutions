package p23;


class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0;
        for(int a=0;a<nums.length;a++){
            if(nums[a]!=val){
                nums[i++] = nums[a];
            }
        } 
        return i;
    }
}

public class Problem23_removeAllElement {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] nums = {3,2,2,3};
        int val = 3;
        int ans = obj.removeElement(nums, val);
        System.out.println("\n"+ans);
    }
    
}
