package p35;
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        for(int i = 0,j=0;i<nums1.length;i++){
            j =0;
            while(nums1[i] != nums2[j] && j<nums2.length){
                j++;
            }
            if(nums1[i] == nums2[j]){
                if(j==nums2.length-1){
                    nums1[i] = -1;
                }
                else{
                    while(j<nums2.length && nums2[j]<=nums1[i]){
                        j++;
                    }
                    if(j==nums2.length){
                        nums1[i] = -1;
                    }
                    else if(nums2[j]>nums1[i]){
                        nums1[i] = nums2[j];
                    }
                    else{
                        nums1[i] = -1;
                    }
                }
            }
            else {
                nums1[i] = -1;
            }
        }
        return nums1;
    }
}
public class Problem35_nextGreaterElementI {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] nums1 = {4,1,2};
        int[] nums2 =  {1,3,4,2};
        int[] ans = obj.nextGreaterElement(nums1, nums2);
        for(int i = 0; i<nums1.length;i++){
            System.out.println(ans[i]);
        }
    }
}
