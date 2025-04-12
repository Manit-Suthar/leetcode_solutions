class Solution {
    public int searchInsert(int[] nums, int target) {
        int l=0,h=nums.length-1,mid;
        while(l<=h){
            
                mid = (l+h)/2;
                if(nums[mid] == target){
                    return mid;
                }
                else if(nums[mid]>target){
                    h = mid-1; 
                }
                else if(nums[mid]<target){
                    l=mid+1;
            }
        }
        return l;
    }

 }

public class Problem6_searchIndexPosition{
    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] num={1,3,5,7,9};
        int target = 100;
        int place = obj.searchInsert(num, target);
        System.out.println(place);
    }
}