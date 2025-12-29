package p78;

class Solution {
    public int findNumbers(int[] nums) {
        int evenNum = 0;
        for (int num : nums) {
            if ((num >= 10 && num <= 99) || (num >= 1000 && num <= 9999) || num == 100000) {
                evenNum++;
            }
        }
        return evenNum;
    }

    // public int findNumbers(int[] nums) {
    //     int evenNum = 0;
    //     for (int num : nums) {
    //         if ((int)(Math.log10(num) + 1) % 2 == 0) {
    //             evenNum++;
    //         }
    //     }
    //     return evenNum;
    // }
    

    // public int findNumbers(int[] nums) {
    //     int evenNum = 0;
    //     for (int num : nums) {
    //         if (String.valueOf(num).length() % 2 == 0) {
    //             evenNum++;
    //         }
    //     }
    //     return evenNum;
    // }
    

    // public int findNumbers(int[] nums) {
    //     int evenNum=0;
    //     for(int a =0 ; a<nums.length;a++){
    //         int temp = nums[a] ;
    //         int count = 1; 
    //         while(temp>9){
    //             temp /= 10;
    //             count++;
    //         }
    //         if(count%2==0) evenNum++;
    //     }
    //     return evenNum;
    // }
}
public class Problem78_findNumberWithEvenNum {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] arr = {12,234,3456,76,1};
        int ans = obj.findNumbers(arr);
        System.out.println(ans);
    }
}
