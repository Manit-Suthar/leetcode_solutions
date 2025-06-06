package p26;

import java.util.List;
import java.util.ArrayList;

class Solution{
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int idx = -1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < 0){
                idx = nums[i]*-1-1;
            }else{
                idx = nums[i]-1;
            }
            
            if(nums[idx]>0){
                nums[idx] = -nums[idx];
            }
            
        }
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                list.add(i+1);
            };
            
        }
        
        return list;
    }
}

public class Problem26_FindAllNumbersDisappearedInArr {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] arr = {1,3,2,4,1,2,7,8};
        List<Integer> ans = new ArrayList<>();
        ans = obj.findDisappearedNumbers(arr);
        System.out.println(ans);        
    }
}
