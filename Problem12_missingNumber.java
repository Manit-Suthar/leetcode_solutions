class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int totalSum = 0;
        int numsSum = 0;
        for(int i1 = 0; i1 <= n;i1++ ){
            totalSum = totalSum + i1;
        }
        for(int i2 = 0;i2<n;i2++){
            numsSum = numsSum + nums[i2];
        }
        return totalSum - numsSum;
        
    }
}

public class Problem12_missingNumber {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] arr = {2,0,1,5,3,6,7,8,9};
        int answer = obj.missingNumber(arr);
        System.out.println(answer);
        
    }
}
