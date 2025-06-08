package p31;

class Solution {
    public int minElement(int[] nums) {
        for(int i = 0;i<nums.length;i++){
            char[] c = String.valueOf(nums[i]).toCharArray();
            int sum = 0;
            for(int j = 0;j<c.length;j++){
                sum += (int)c[j]-48;
            }
            nums[i] = sum;
        }
        int min = nums[0];
        for(int l = 0 ; l<nums.length ;l++){
            if(nums[l]<min){
                min = nums[l];
            }
        }
        return min;
    }
} 
public class Problem31_minElementAfterReplacementOfDigitSum {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] arr = {12,34,4};
        int ans = obj.minElement(arr);
        System.out.println(ans);
    }
}
