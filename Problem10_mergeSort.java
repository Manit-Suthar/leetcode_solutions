// merge sort

//package p10;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1, j = n-1, k = m+n-1 ;
        

        while( i>=0 && j>=0)
        {
            if(nums1[i]>nums2[j]){
               nums1[k--] = nums1[i--]; 
            }
            else{
               nums1[k--] = nums2[j--];
            }
        }
        for (;i>=0;i--){
           nums1[k--] = nums1[i];
        }
        for (;j>=0;j--){
           nums1[k--] = nums2[j];
        }
        System.out.print("[");
        for(int a = 0 ; a<nums1.length;a++){
            if(a<nums1.length-1){
                System.out.print(nums1[a]+",");
            }  
            else{
                System.out.print(nums1[a]);
            } 
        }
        System.out.print("]"); 

    }
}



public class Problem10_mergeSort {
    public static void main(String[] args) {
        Solution obj = new Solution();
        
        int[] arr1 = {1,2,3,0,0,0};
        int[] arr2 = {2,5,6};
        obj.merge(arr1,3,arr2 ,3);

    }

    
}