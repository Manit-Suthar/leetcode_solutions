package p48;

import java.util.Arrays;

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0,j=0;
        while(i<g.length && j<s.length){
            if(g[i]<=s[j]){
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        return i;
    }
}
public class Problem48_assignCookies {
    public static void main(String a[]){
        Solution obj = new Solution();
        int[] g = {2,3,1,5,4,7};
        int[] s = {4,2,1,2,6,8};
        int ans = obj.findContentChildren(g,s);
        System.out.println(ans);
    }
}
    //manual sorting : BUBBLE SORT
    // public static int[] sort(int[] arr){
    //     for(int i = 0; i<arr.length-1;i++){
    //         for(int j = 0;j<arr.length-1-i;j++){
    //             if(arr[j]>arr[j+1]){
    //                 int temp = arr[j];
    //                 arr[j] = arr[j+1];
    //                 arr[j+1] = temp;
    //             }
    //         }
    //     }
    //     return arr;
    // }
