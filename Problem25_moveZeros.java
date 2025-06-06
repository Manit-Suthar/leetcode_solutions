package p25;

class Solution {
    public void moveZeroes(int[] nums) {
        int i=0;
        for(int j=0;j<nums.length && nums.length>1;j++){
            if(nums[j]!=0){
                nums[i++] = nums[j];
            }
        }
        for(;i<nums.length && nums.length>1;i++){
            nums[i] = 0;
        }
        for(int m=0;m<nums.length;m++){
            System.out.println(m+" "+nums[m]);
        }
    }
}

public class Problem25_moveZeros {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] arr = {1,0};
        obj.moveZeroes(arr);
    }
}
