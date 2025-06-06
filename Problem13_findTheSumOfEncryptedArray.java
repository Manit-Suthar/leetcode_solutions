//package p13;
class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int range = nums.length;
        int[] newArr = new int[range];
        int sum = 0;
        for(int i = 0; i < range ; i++){
            int max = 0;
            if(nums[i]<=9){
                newArr[i] = nums[i];
                continue;
            }
            int count = 0;
            while(nums[i]!=0){
                int rem = nums[i] % 10;
                if(rem > max){
                    max = rem;
                }
                nums[i] /= 10;
                count++;
            }
            if(count == 2){
                newArr[i] = max * 11;
            }
            if(count == 3){
                newArr[i] = max * 111;
            }
            if(count == 4){
                newArr[i] = max * 1111;
            }
        }
        for(int j = 0;j<range;j++){
            sum = sum + newArr[j];
        }
        return sum;    
    }
}
public class Problem13_findTheSumOfEncryptedArray {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] arr = {19,13};
        int sum = obj.sumOfEncryptedInt(arr);
        System.out.println(sum);
    }
}
